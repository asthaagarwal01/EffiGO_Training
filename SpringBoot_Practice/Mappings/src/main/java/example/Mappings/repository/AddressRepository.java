package example.Mappings.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import example.Mappings.entity.AddressEntity;

public interface AddressRepository extends JpaRepository<AddressEntity,Long> {

}
