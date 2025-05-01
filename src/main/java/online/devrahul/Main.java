package online.devrahul;

import online.devrahul.FordMotors.Employee;
import online.devrahul.FordMotors.JavaInterview;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
     List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("John", 30000, "Engineer", "MALE"));
        employees.add(new Employee("Jane", 25000, "Designer","FEMALE"));
        employees.add(new Employee("Mike", 35000, "Manager","MALE"));

        employees.add(new Employee("Rahul", 24000000, "Founder","MALE"));
        employees.add(new Employee("Ni", 12000000, "Founder","FEMALE"));
        JavaInterview javaInterview = new JavaInterview();

        javaInterview.filterEmployeeBySalary(employees).forEach(x -> System.out.println(x.getName() + " " + x.getSalary()));

      javaInterview.filterEmployeesByGender(employees).forEach(x -> System.out.println(x.getName() + " " + x.getSalary()));

        javaInterview.filterEmployeeWithHighestSalary(employees).forEach(x -> System.out.println(x.getName() + " " + x.getSalary()));

    }

}