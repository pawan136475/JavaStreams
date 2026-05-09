package Strings.basics;

import java.util.Arrays;
import java.util.List;

//Get the list of strings where the length of each element is greater than 5 and get the count
public class Basic2 {

    public static void main(String[] args) {
        List<String> fruits = Arrays.asList("apple", "orange", "pineapple", "berry", "strawberry", "kiwi", "berry", "kiwi");
        fruits.stream().filter(str -> str.length() > 5).forEach(System.out::println);
    }
}
