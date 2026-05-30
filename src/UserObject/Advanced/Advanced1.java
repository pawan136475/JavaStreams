package UserObject.Advanced;

import UserObject.Employee;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

//Group all employees by department
public class Advanced1 {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee("Raja", 9000, 1, "HR", "Bengaluru"),
                new Employee("Raja2", 7000, 1, "HR", "Bengaluru"),
                new Employee("Pulkit", 10000, 2, "BA", "Delhi")
        );

        Map<String, List<Employee>> map = employees.stream().collect(Collectors.groupingBy(Employee::getDepartment));
        map.forEach((key, val) -> System.out.println("key- " + key + " - " + "value- " + val));
    }
}
