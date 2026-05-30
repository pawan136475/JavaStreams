package UserObject.Advanced;

import UserObject.Employee;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//Get the count of employees by department
public class Advanced2 {

    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee("Raja", 9000, 1, "HR", "Bengaluru"),
                new Employee("Raja2", 7000, 1, "HR", "Bengaluru"),
                new Employee("Pulkit", 10000, 2, "BA", "Delhi")
        );
        employees.stream().collect(Collectors.groupingBy(Employee::getDepartment, Collectors.counting())).forEach((dept, count) -> System.out.println("dept- " + dept + " - " + "count- " + count));
    }
}
