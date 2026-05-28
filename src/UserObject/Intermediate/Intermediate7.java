package UserObject.Intermediate;

import UserObject.Employee;

import java.util.Arrays;
import java.util.List;

//Get the employees who are earning above the average salary
public class Intermediate7 {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee("Raja", 9000, 1, "HR", "Bengaluru"),
                new Employee("Raja2", 7000, 1, "HR", "Bengaluru"),
                new Employee("Pulkit", 10000, 2, "BA", "Delhi")
        );
        double avgSalary = employees.stream().mapToDouble(Employee::getSalary).average().getAsDouble();
        System.out.println("avgSalary- " + avgSalary);
        employees.stream().filter(emp -> emp.getSalary() > avgSalary).forEach(System.out::println);
    }
}
