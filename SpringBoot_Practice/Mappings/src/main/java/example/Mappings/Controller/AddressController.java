package example.Mappings.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import example.Mappings.entity.AddressEntity;
import example.Mappings.repository.AddressRepository;

@RestController
public class AddressController {
	
	@Autowired
	private AddressRepository addrep;
	
	@GetMapping("/getAddress")
	public List<AddressEntity> getEmployees(){
		return addrep.findAll();
	}

}
