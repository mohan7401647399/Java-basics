package association.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import association.Service.AddressService;
import association.model.AddressModel;

@RestController
@RequestMapping("/address")
public class AddressContoller {

	@Autowired
	private AddressService addressService;

	@PostMapping("/create")
	public AddressModel createAddress(AddressModel addressModel) {
		return addressService.createAddress(addressModel);
	}

	@GetMapping("/get/{id}")
	public AddressModel getAddress(@PathVariable int id) {
		return addressService.getAddress(id);
	}

	@GetMapping("/getAll")
	public List<AddressModel> getAllAddresses() {
		return addressService.getAllAddresses();
	}

}
