package UserObject.Intermediate;

import UserObject.Employee;

import java.util.Arrays;
import java.util.List;

//Get the employees with the second highest salary
public class Intermediate6 {

    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee("Raja", 9000, 1, "HR", "Bengaluru"),
                new Employee("Raja2", 7000, 1, "HR", "Bengaluru"),
                new Employee("Pulkit", 10000, 2, "BA", "Delhi")
        );
        Employee secondHighestSalary = employees.stream().sorted((emp1, emp2) -> ((Double) emp2.getSalary()).compareTo(emp1.getSalary())).skip(1).findFirst().get();
        System.out.println("secondHighestSalary- " + secondHighestSalary);
    }
}
