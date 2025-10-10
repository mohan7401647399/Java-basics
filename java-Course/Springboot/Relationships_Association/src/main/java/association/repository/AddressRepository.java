package association.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import association.model.AddressModel;

@Repository
public interface AddressRepository extends JpaRepository<AddressModel, Integer> {

}
