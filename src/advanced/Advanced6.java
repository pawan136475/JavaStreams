package advanced;

import java.util.Arrays;
import java.util.List;

//Given a list of strings find the first element having the length as 10 if not handle exceptions
public class Advanced6 {
    public static void main(String[] args) {
        List<String> fruits = Arrays.asList("apple", "1234", "9876", "berry", "strawberry", "kiwiqwertg", "vbnm");
        String result = fruits.stream().filter(str -> str.length() == 10).findFirst().orElseThrow(() -> new RuntimeException("No string of length 10"));
        System.out.println(result);
    }
}
