package intermediate;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//convert a list of strings into a single string, separated by commas, using streams
public class Intermediate4 {

    public static void main(String[] args) {
        List<String> fruits = Arrays.asList("apple", "orange", "pineapple", "berry", "strawberry", "kiwi", "berry", "kiwi", "vbnm");

        String word = fruits.stream().collect(Collectors.joining(","));
        System.out.println(word);

    }
}
