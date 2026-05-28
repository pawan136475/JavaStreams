package UserObject.Intermediate;

import UserObject.Employee;

import java.util.Arrays;
import java.util.List;

//Check if all employees have a salary greater than a specific Value
public class Intermediate1 {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee("Raja", 9000, 1, "HR", "Bengaluru"),
                new Employee("Raja2", 9000, 1, "HR", "Bengaluru"),
                new Employee("Pulkit", 10000, 2, "BA", "Delhi")
        );

        boolean isMatching = employees.stream().allMatch(emp -> emp.getSalary() > 8000);
        System.out.println("isMatching- " + isMatching);
    }
}
