package UserObject.Intermediate;

import UserObject.Employee;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

//Get the employee with the longest name
public class Intermediate8 {

    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee("Raja", 9000, 1, "HR", "Bengaluru"),
                new Employee("Raja2", 7000, 1, "HR", "Bengaluru"),
                new Employee("Pulkit", 10000, 2, "BA", "Delhi")
        );
        Employee emp = employees.stream().max(Comparator.comparing(empl -> empl.getName().length())).get();
        System.out.println(emp);
    }
}
