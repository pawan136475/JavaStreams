package Strings.advanced;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

//Reverse the list of strings using streams api
public class Advanced7 {

    public static void main(String[] args) {
        List<String> fruits = Arrays.asList("apple", "1234", "9876", "berry", "strawberry", "kiwiqwertg", "vbnm");

        IntStream.range(0, fruits.size())
                .mapToObj(i -> fruits.get(fruits.size() - 1 - i))
                .forEach(System.out::println);
    }
}
