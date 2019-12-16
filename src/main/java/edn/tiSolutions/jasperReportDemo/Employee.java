package edn.tiSolutions.jasperReportDemo;

import java.util.ArrayList;
import java.util.List;

public class Employee {

    private int id;
    private String firstName;
    private String lastName;
    private String address;
    private double salary;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public static List<Employee> getEmployeesMock() {
        List<Employee> employees = new ArrayList<>();

        for (int i = 0; i < 6; i++) {
            Employee e = new Employee();
            e.id = i;
            e.firstName = "First Name " + i;
            e.lastName = "Last Name " + i;
            e.address = "My address " + i;
            e.salary = 10.25 * i;

            employees.add(e);
        }

        return employees;
    }

}
