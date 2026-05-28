package UserObject.Intermediate;

import UserObject.Employee;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;

//Get the employees with the highest salary
public class Intermediate5 {

    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee("Raja", 9000, 1, "HR", "Bengaluru"),
                new Employee("Raja2", 9000, 1, "HR", "Bengaluru"),
                new Employee("Pulkit", 10000, 2, "BA", "Delhi")
        );
        Employee highestSalary = employees.stream().sorted((emp1, emp2) -> ((Double) emp2.getSalary()).compareTo(emp1.getSalary())).findFirst().get();
        System.out.println("highestSalary- " + highestSalary.getSalary());

    }
}
