package UserObject.Basics;

import UserObject.Employee;

import java.util.Arrays;
import java.util.List;

//Get the total salary of all employees in a specific department
public class Basic5 {

    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee("Raja", 9000, 1, "HR", "Bengaluru"),
                new Employee("Raja2", 9000, 1, "HR", "Bengaluru"),
                new Employee("Pulkit", 10000, 2, "BA", "Delhi")
        );
        double totalSalary = employees.stream().filter(emp -> emp.getDepartment().equals("HR")).mapToDouble(emp -> emp.getSalary()).sum();
        System.out.println("totalSalary- " + totalSalary);

    }
}
