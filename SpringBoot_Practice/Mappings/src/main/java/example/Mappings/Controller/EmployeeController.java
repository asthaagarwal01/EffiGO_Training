package example.Mappings.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import example.Mappings.entity.EmployeeEntity;
import example.Mappings.repository.EmployeeRepository;

@RestController
public class EmployeeController {

	@Autowired
	private EmployeeRepository emprepo;
	
	@PostMapping("/saveEmployees")
	public ResponseEntity<String>saveEmployees(@RequestBody List<EmployeeEntity>empData){
		emprepo.saveAll(empData);
		return ResponseEntity.ok("Data saved");
	}
	
	@GetMapping("/getEmployees")
	public List<EmployeeEntity>getEmployees(){
		return emprepo.findAll();
	}
	
}
