package Strings.intermediate;

import java.util.Arrays;
import java.util.List;

//Write a Java program to remove all strings from the list that are empty or null using streams.
public class Intermediate6 {
    public static void main(String[] args) {
        List<String> fruits = Arrays.asList("apple", "orange", "pineapple", "berry", "strawberry", "kiwi", null, "");

        fruits.stream().filter(str -> str != null && !str.isEmpty()).map(str -> new StringBuffer(str)).forEach(System.out::println);
    }
}
