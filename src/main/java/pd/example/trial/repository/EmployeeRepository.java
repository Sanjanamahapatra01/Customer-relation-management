package pd.example.trial.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import pd.example.trial.model.Employee;
@Repository
public interface EmployeeRepository extends MongoRepository<Employee,String> {
    Employee findByEmployeeId(String employeeId);
}
