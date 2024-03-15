package com.springdemo.springboot;

import com.springdemo.springboot.model.Employee;
import com.springdemo.springboot.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootBackendApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootBackendApplication.class, args);
    }

//    @Autowired
//    private EmployeeRepository employeeRepository;
//
//    @Override
//    public void run(String... args) throws Exception {
//        Employee employee = new Employee();
//        employee.setFirstName("Anik");
//        employee.setLastName("Barua");
//        employee.setEmailId("anik@gmail.com");
//        employeeRepository.save(employee);
//
//        Employee employee1 = new Employee();
//        employee1.setFirstName("Rahul");
//        employee1.setLastName("Das");
//        employee1.setEmailId("rahul@gmail.com");
//        employeeRepository.save(employee1);
//
//    }
}
