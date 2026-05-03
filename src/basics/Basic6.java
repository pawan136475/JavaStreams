package basics;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

//Find the first element in a list that starts with a particular letter
public class Basic6 {
    public static void main(String[] args) {


        List<String> fruits = Arrays.asList("apple", "orange", "pineapple", "berry", "strawberry", "kiwi", "berry", "kiwi");

        Optional<String> val = fruits.stream().filter(str -> str.startsWith("k")).findFirst();

        if (val.isPresent()) {
            String result = val.get();
            System.out.println(result);

        }
    }
}
