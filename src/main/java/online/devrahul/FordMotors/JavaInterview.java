package online.devrahul.FordMotors;

import java.util.List;
import java.util.stream.Collectors;

public class JavaInterview {
    // Three question on Streams API
    // 1. Write a stream which accepts a list of employees object and filter who have salary more than 50000
    public List<Employee> filterEmployeeBySalary(List<Employee> employees){
       return employees.stream().filter(employee -> employee.getSalary() > 50000).collect(Collectors.toList());
    }
    // 2. Write a stream which accepts a list of employees object and filter female employees having salary more than 5000
    public List<Employee> filterEmployeesByGender(List<Employee> employees){
        return employees.stream().filter(employee -> employee.getGender().equals("FEMALE") && employee.getSalary() > 50000).collect(Collectors.toList());
    }
    // 3. Write a stream which accepts a list of employees and return employee with highest salary
    public List<Employee> filterEmployeeWithHighestSalary(List<Employee> employees){
        return employees.stream().max((emp1, emp2) -> emp1.getSalary() - emp2.getSalary()).stream().collect(Collectors.toList());
    }
}

