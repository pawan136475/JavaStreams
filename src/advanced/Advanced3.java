package advanced;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//Given a list of strings, create a map where the key is the last letter of the string, and the value is a list of strings that start with that letter using streams
public class Advanced3 {
    public static void main(String[] args) {
        List<String> fruits = Arrays.asList("apple", "orange", "pineapple", "berry", "strawberry", "kiwi");

        fruits.stream().collect(Collectors.groupingBy(str -> str.charAt(str.length() - 1))).forEach((key, val) -> {
            System.out.println(key + "-" + val);

        });
    }
}
