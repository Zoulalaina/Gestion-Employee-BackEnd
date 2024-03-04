package zoul.lalina.firstProjet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import zoul.lalina.firstProjet.model.Employee;
import zoul.lalina.firstProjet.repository.EmployeeRepository;

@SpringBootApplication
public class FirstProjetApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(FirstProjetApplication.class, args);
	}
	@Autowired
	private EmployeeRepository employeeRepository;
	@Override
	public void run(String... args) throws Exception {
//		Employee employee = new Employee();
//		employee.setFirstName("Rabe");
//		employee.setLastName("Rajao");
//		employee.setEmail("Rajao@gmail.com");
//		employeeRepository.save(employee);
//
//		Employee employee1 = new Employee();
//		employee1.setFirstName("Bao");
//		employee1.setLastName("Voalazara");
//		employee1.setEmail("Volazara@gmail.com");
//		employeeRepository.save(employee1);
	}
}

