package UserObject.Advanced;

import UserObject.Employee;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

//Find the department with the highest average salary
public class Advanced7 {

    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee("Raja", 9000, 1, "HR", "Bengaluru"),
                new Employee("Raja2", 7000, 1, "HR", "Bengaluru"),
                new Employee("Pulkit", 10000, 2, "BA", "Delhi")
        );

        Map<String, Double> map = employees.stream().collect(Collectors.groupingBy(Employee::getDepartment, Collectors.averagingDouble(Employee::getSalary)));
        map.forEach((dept, sal) -> System.out.println(dept + "-" + sal));
        String key = map.keySet().stream().max(Comparator.comparing(dept -> map.get(dept))).get();
        double highest = map.get(key);
        System.out.println("highest- " + highest);
    }

}
