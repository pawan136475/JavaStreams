package Strings.basics;

import java.util.Arrays;
import java.util.List;

//Write a Java program to remove strings that start with a specific word from a list using streams.
public class Basic5 {
    public static void main(String[] args) {
        List<String> fruits = Arrays.asList("apple", "orange", "pineapple", "berry", "strawberry", "kiwi", "berry", "kiwi");

        fruits.stream().filter(str -> !str.startsWith("b")).forEach(System.out::println);
    }
}
