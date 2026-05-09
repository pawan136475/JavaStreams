package Strings.basics;

import java.util.Arrays;
import java.util.List;

//Convert a list of strings to uppercase , sort them and print
public class Basic1 {

    public static void main(String[] args) {
        List<String> fruits = Arrays.asList("apple", "orange", "pineapple", "berry", "strawberry", "kiwi", "berry", "kiwi");
        fruits.stream().map(str -> str.toUpperCase()).sorted().forEach(System.out::println);
    }
}
