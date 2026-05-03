package intermediate;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

//Sort the list of strings based on their lengths in ascending/descending order.
public class Intermediate1 {

    public static void main(String[] args) {

        List<String> fruits = Arrays.asList("apple", "orange", "pineapple", "berry", "strawberry", "kiwi", "berry", "kiwi");

        //fruits.stream().sorted((o1, o2) -> ((Integer) o1.length()).compareTo(o2.length())).forEach(System.out::println);

        //second way
        fruits.stream().sorted(Comparator.comparing(String::length).reversed()).forEach(System.out::println);
    }
}
