package intermediate;

import java.util.Arrays;
import java.util.List;

//Get the list of strings having vowels
public class Intermediate3 {
    public static void main(String[] args) {
        List<String> fruits = Arrays.asList("apple", "orange", "pineapple", "berry", "strawberry", "kiwi", "berry", "kiwi", "vbnm");

        fruits.stream().filter(str -> str.matches(".*[aeiou].*")).forEach(System.out::println);
    }
}
