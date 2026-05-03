package basics;

import java.util.Arrays;
import java.util.List;

//Get the list of strings having a particular word
public class Basic4 {

    public static void main(String[] args) {
        List<String> fruits = Arrays.asList("apple", "orange", "pineapple", "berry", "strawberry", "kiwi", "berry", "kiwi");

        fruits.stream().filter(str -> str.contains("berry")).forEach(System.out::println);

    }
}
