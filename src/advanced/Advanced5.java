package advanced;

import java.util.Arrays;
import java.util.List;

//Given a list of strings print only the string elements excluding the digits using streams.
public class Advanced5 {
    public static void main(String[] args) {
        List<String> fruits = Arrays.asList("apple", "1234", "9876", "berry", "strawberry", "kiwi", "vbnm");

        fruits.stream().filter(str -> !str.matches(".*[0-9].*")).forEach(System.out::println);


    }
}
