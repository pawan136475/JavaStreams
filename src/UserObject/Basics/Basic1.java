package UserObject.Basics;

import UserObject.Employee;

import java.util.Arrays;
import java.util.List;

//Find all employees from a specific city and get the count
public class Basic1 {
    public static void main(String[] args) {

        List<Employee> employees = Arrays.asList(
                new Employee("Raja", 9000, 1, "HR", "Bengaluru"),
                new Employee("Pulkit", 10000, 2, "BA", "Delhi")
        );

        employees.stream().filter(emp -> emp.getCity().equals("Delhi")).forEach(System.out::println);
        long totalCount = employees.stream().filter(emp -> emp.getCity().equals("Delhi")).count();
        System.out.println("totalCount= " + totalCount);
    }


}
