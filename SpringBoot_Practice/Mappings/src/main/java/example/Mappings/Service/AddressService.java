package example.Mappings.Service;

import java.util.List;

import example.Mappings.entity.AddressEntity;

public interface AddressService {
    List<AddressEntity> findAllAddresses();
}
