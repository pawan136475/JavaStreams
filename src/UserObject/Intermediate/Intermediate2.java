package UserObject.Intermediate;

import UserObject.Employee;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;

//Get the sum of salaries of all employees and the average salary
public class Intermediate2 {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee("Raja", 9000, 1, "HR", "Bengaluru"),
                new Employee("Raja2", 9000, 1, "HR", "Bengaluru"),
                new Employee("Pulkit", 10000, 2, "BA", "Delhi")
        );
        double totalSalary = employees.stream().mapToDouble(emp -> emp.getSalary()).sum();
        OptionalDouble averageSalary = employees.stream().mapToDouble(emp -> emp.getSalary()).average();
        System.out.println("totalSalary- " + totalSalary + " averageSalary- " + averageSalary.getAsDouble());
    }
}
