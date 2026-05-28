package UserObject.Intermediate;

import UserObject.Employee;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

//Print the employee details from highest to lowest salary
public class Intermediate4 {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee("Raja", 9000, 1, "HR", "Bengaluru"),
                new Employee("Raja2", 9000, 1, "HR", "Bengaluru"),
                new Employee("Pulkit", 10000, 2, "BA", "Delhi")
        );
        employees.stream().sorted((emp1, emp2) -> ((Double) emp2.getSalary()).compareTo(emp1.getSalary())).forEach(System.out::println);
    }
}
