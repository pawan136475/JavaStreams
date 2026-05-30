package UserObject.Advanced;

import UserObject.Employee;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

//List all employees grouping by cities but belong to the same department
public class Advanced6 {

    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee("Raja", 9000, 1, "HR", "Bengaluru"),
                new Employee("Raja2", 7000, 1, "HR", "Bengaluru"),
                new Employee("Pulkit", 10000, 2, "BA", "Delhi")
        );

        Map<String, List<Employee>> map = employees.stream().collect(Collectors.groupingBy(Employee::getDepartment));
        map.forEach((dept, empList) -> {
            System.out.println("Dept- " + dept);
            empList.stream().collect(Collectors.groupingBy(Employee::getCity)).forEach((city, emp) -> {
                System.out.println("city- " + city + " - " + "emp- " + emp);

            });
        });

    }
}
