package Strings.intermediate;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

//Find the longest word in the list.
public class Intermediate2 {

    public static void main(String[] args) {

        List<String> fruits = Arrays.asList("apple", "orange", "pineapple", "berry", "strawberry", "kiwi", "berry", "kiwi");

        Optional<String> val = fruits.stream().max(Comparator.comparing(String::length));
        val.ifPresent(str -> System.out.println(str.toUpperCase()));
    }

}
