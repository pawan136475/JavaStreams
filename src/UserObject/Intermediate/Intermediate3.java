package UserObject.Intermediate;

import UserObject.Employee;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

//Get a Map of Employee Names and their salaries
public class Intermediate3 {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee("Raja", 9000, 1, "HR", "Bengaluru"),
                new Employee("Raja2", 9000, 1, "HR", "Bengaluru"),
                new Employee("Pulkit", 10000, 2, "BA", "Delhi")
        );
        Map<String, Double> map = employees.stream().collect(Collectors.toMap(emp -> emp.getName(), emp -> emp.getSalary()));
        map.forEach((name, sal) -> {
            System.out.println("name- " + name + " - " + " sal- " + sal);
        });
    }
}
