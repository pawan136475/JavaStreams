package Strings.basics;

import java.util.Arrays;
import java.util.List;

//Get the length of each name in a list
public class Basic7 {

    public static void main(String[] args) {

        List<String> fruits = Arrays.asList("apple", "orange", "pineapple", "berry", "strawberry", "kiwi", "berry", "kiwi");

        fruits.stream().map(str -> str.length()).forEach(System.out::println);
    }
}
