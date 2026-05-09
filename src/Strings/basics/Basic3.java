package Strings.basics;


import java.util.Arrays;
import java.util.List;

//Remove duplicates from a list
public class Basic3 {

    public static void main(String[] args) {
        List<String> fruits = Arrays.asList("apple", "orange", "pineapple", "berry", "strawberry", "kiwi", "berry", "kiwi");

        fruits.stream().distinct().forEach(System.out::println);
    }
}
