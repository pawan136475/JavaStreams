package ListOfNumbers.basics;

import java.util.Arrays;
import java.util.List;

//Sort a list of integers in descending/ascending order
public class Basic3 {

    public static void main(String[] args) {

        List<Integer> nums = Arrays.asList(11, 12, 13, 19, 15, 16, 17);

        //nums.stream().sorted().forEach(System.out::println); //sorted in ascending order
        //nums.stream().sorted((a, b) -> b.compareTo(a)).forEach(System.out::println); //sorted in descending order

        int[] numsarr = new int[]{11, 12, 13, 14, 15, 16, 17};
        Arrays.stream(numsarr)
                //.boxed()
                .mapToObj(num -> Integer.valueOf(num))
                .sorted((a, b) -> b.compareTo(a))
                .forEach(System.out::println);
    }
}
