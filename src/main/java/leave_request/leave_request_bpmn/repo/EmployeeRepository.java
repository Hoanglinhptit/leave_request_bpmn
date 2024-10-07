package leave_request.leave_request_bpmn.repo;

import leave_request.leave_request_bpmn.entities.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}