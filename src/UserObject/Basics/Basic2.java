package UserObject.Basics;

import UserObject.Employee;

import java.util.Arrays;
import java.util.List;

//Find all employees where salary is greater than a particular value
public class Basic2 {

    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee("Raja", 9000, 1, "HR", "Bengaluru"),
                new Employee("Pulkit", 10000, 2, "BA", "Delhi")
        );

        employees.stream().filter(emp -> emp.getSalary() > 5000).forEach(System.out::println);
    }
}
