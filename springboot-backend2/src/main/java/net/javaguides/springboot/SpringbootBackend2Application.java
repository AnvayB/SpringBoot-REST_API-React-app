package net.javaguides.springboot;

import net.javaguides.springboot.entity.Employee;
import net.javaguides.springboot.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootBackend2Application implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootBackend2Application.class, args);
	}

	@Autowired
	private EmployeeRepository employeeRepository;

	@Override
	public void run(String... args) throws Exception {


		Employee employee1 = Employee.builder()
				.firstName("Anvay")
				.lastName("Bhanap")
				.email("anvay.bhanap@gmail.com")
				.build();

		Employee employee2 = Employee.builder()
				.firstName("Tony")
				.lastName("Stark")
				.email("tony.stark@gmail.com")
				.build();

		Employee employee3 = Employee.builder()
				.firstName("John")
				.lastName("Cena")
				.email("john.cena@gmail.com")
				.build();

		employeeRepository.save(employee1);
		employeeRepository.save(employee2);
		employeeRepository.save(employee3);
	}
}
