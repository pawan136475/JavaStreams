package UserObject.Basics;

import UserObject.Employee;

import java.util.Arrays;
import java.util.List;

//Print all the employee names only in upper case and alphabetical order
public class Basic3 {

    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee("Raja", 9000, 1, "HR", "Bengaluru"),
                new Employee("Pulkit", 10000, 2, "BA", "Delhi")
        );

        employees.stream().map(emp -> emp.getName().toUpperCase()).forEach(System.out::println);
    }
}
