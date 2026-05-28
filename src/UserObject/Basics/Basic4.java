package UserObject.Basics;

import UserObject.Employee;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

//Get the first employee where dept is "HR" and if not available throw exception
public class Basic4 {

    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee("Raja", 9000, 1, "HR", "Bengaluru"),
                new Employee("Pulkit", 10000, 2, "BA", "Delhi")
        );
        Optional<Employee> dept = employees.stream().filter(emp -> emp.getDepartment().equals("HR")).findFirst();
        dept.ifPresent(System.out::println);
    }
}
