package zoul.lalina.firstProjet.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import zoul.lalina.firstProjet.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
    //All crud
}
