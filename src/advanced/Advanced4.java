package advanced;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;

//Given a list of strings, group the list of strings with vowels and no vowels into two lists
public class Advanced4 {

    public static void main(String[] args) {
        List<String> fruits = Arrays.asList("apple", "orange", "pineapple", "berry", "strawberry", "kiwi", "vbnm");

        Predicate<String> pred = str -> str.matches(".*[aeiou].*");
        Map<Boolean, List<String>> mapwords = fruits.stream().collect(Collectors.partitioningBy(pred));
        System.out.println("Vowels-" + mapwords.get(true));
        System.out.println("Not Vowels-" + mapwords.get(false));
    }
}
