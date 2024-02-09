package example.Mappings.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import example.Mappings.entity.AddressEntity;
import example.Mappings.repository.AddressRepository;

@Service
public class AddressServiceImpl implements AddressService {

    @Autowired
    private AddressRepository addressRepository;

    @Override
    public List<AddressEntity> findAllAddresses() {
        return addressRepository.findAll();
    }
}


