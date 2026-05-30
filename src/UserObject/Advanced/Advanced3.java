package UserObject.Advanced;

import UserObject.Employee;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//Get the sum of salaries of all employees by department
public class Advanced3 {

    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee("Raja", 9000, 1, "HR", "Bengaluru"),
                new Employee("Raja2", 7000, 1, "HR", "Bengaluru"),
                new Employee("Pulkit", 10000, 2, "BA", "Delhi")
        );
        employees.stream().collect(Collectors.groupingBy(Employee::getDepartment, Collectors.summingDouble(Employee::getSalary)))
                .forEach((dept, sal) -> System.out.println("dept- " + dept + " - " + "sal- " + sal));
    }
}
