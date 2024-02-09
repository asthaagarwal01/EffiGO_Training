package example.Mappings.Service;

import java.util.List;
import java.util.Optional;

import example.Mappings.entity.EmployeeEntity;

public interface EmployeeService {
    List<EmployeeEntity> findAllEmployees();
    Optional<EmployeeEntity> findEmployeeById(Long id);
    EmployeeEntity saveEmployee(EmployeeEntity employee);
    EmployeeEntity updateEmployee(EmployeeEntity employee);
    void deleteEmployee(Long id);
}
