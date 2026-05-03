package intermediate;

import java.util.Arrays;
import java.util.List;

//Write a Java program to create a new list of strings, where each string is reversed from the original list, using Java streams.
public class Intermediate5 {

    public static void main(String[] args) {

        List<String> fruits = Arrays.asList("apple", "orange", "pineapple", "berry", "strawberry", "kiwi", "berry", "kiwi");
        fruits.stream().map(str -> new StringBuffer(str).reverse()).forEach(System.out::println);
    }
}
