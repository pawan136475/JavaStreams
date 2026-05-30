package UserObject.Advanced;

import UserObject.Employee;

import java.util.Arrays;
import java.util.List;

//Check if all employees belong to a specific department
public class Advanced5 {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee("Raja", 9000, 1, "HR", "Bengaluru"),
                new Employee("Raja2", 7000, 1, "HR", "Bengaluru"),
                new Employee("Pulkit", 10000, 2, "BA", "Delhi")
        );

        boolean val = employees.stream().allMatch(emp -> emp.getDepartment().equals("HR"));
        System.out.println(val);
    }
}
