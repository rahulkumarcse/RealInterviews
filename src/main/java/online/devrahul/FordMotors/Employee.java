package online.devrahul.FordMotors;

public class Employee{
    private String name;
    private int salary;
    private String department;
    private String gender;


    public Employee(String name, int salary, String department, String gender) {
        this.name = name;
        this.salary = salary;
        this.department = department;
        this.gender = gender;
    }


    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }
    public String getDepartment() {
        return department;
    }
    public String getGender() {
        return gender;
    }
}