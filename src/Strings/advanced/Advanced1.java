package Strings.advanced;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

//Given a list of strings, group a list of strings by the first letter of each string using streams
public class Advanced1 {
    public static void main(String[] args) {
        List<String> fruits = Arrays.asList("apple", "orange", "pineapple", "berry", "strawberry", "kiwi");

        Map<Character, List<String>> mapwords = fruits.stream().collect(Collectors.groupingBy(str -> str.charAt(0)));

        mapwords.forEach((key, val) -> {
            System.out.println(key + "-" + val);
        });

    }
}
