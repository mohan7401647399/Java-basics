package association.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import association.model.AddressModel;
import association.repository.AddressRepository;

@Service
public class AddressService {

	@Autowired
	private AddressRepository addressRepository;

	public AddressModel createAddress(AddressModel addressModel) {
		return addressRepository.save(addressModel);
	}

	public AddressModel getAddress(int id) {
		return addressRepository.findById(id).orElseThrow();
	}

	public List<AddressModel> getAllAddresses() {
		return addressRepository.findAll();
	}
}
