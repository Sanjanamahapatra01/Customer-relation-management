package pd.example.trial.service;

import org.springframework.stereotype.Service;
import pd.example.trial.model.Employee;
import pd.example.trial.repository.EmployeeRepository;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService {
    private final EmployeeRepository employeeRepository;
    public EmployeeService(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    /**
     * Method is used get all employees.
     * @return
     */
    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }

    /**
     * Method is used to get employees by id.
     * @param id
     * @return
     */
    public Optional<Employee> getEmployeeById(String id) {
        return employeeRepository.findById(id);
    }

    /**
     * method is used save the employee details.
     * @param employee
     * @return
     */
    public Employee saveEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }

    /**
     * Method is used delete the employees by id.
     * @param id
     */
    public void deleteEmployeeById(String id) {
        employeeRepository.deleteById(id);
    }

    /**
     * Method is used to find the employees by id.
     * @param employeeId
     * @return
     */
    public Employee findByEmployeeId(String employeeId) {
        return employeeRepository.findByEmployeeId(employeeId);
    }
}
