package advanced;

import java.util.Arrays;
import java.util.List;

//Reverse the list of strings using streams api
public class Advanced7 {

    public static void main(String[] args) {
        List<String> fruits = Arrays.asList("apple", "1234", "9876", "berry", "strawberry", "kiwiqwertg", "vbnm");

        fruits.stream().map(str -> new StringBuffer(str).reverse()).forEach(System.out::println);
    }
}
