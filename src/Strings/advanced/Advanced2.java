package Strings.advanced;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

//Given a list of strings, group a list of strings by the length of the string
public class Advanced2 {
    public static void main(String[] args) {
        List<String> fruits = Arrays.asList("apple", "orange", "pineapple", "berry", "strawberry", "kiwi");
        Map<Integer, List<String>> mapwords = fruits.stream().collect(Collectors.groupingBy(str -> str.length()));

        mapwords.forEach((key, val) -> {
            System.out.println(key + "-" + val);
        });
    }
}
