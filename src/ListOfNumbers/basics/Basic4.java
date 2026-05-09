package ListOfNumbers.basics;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;

//Calculate the sum and average of numbers in an array and list of numbers
public class Basic4 {
    public static void main(String[] args) {

        List<Integer> nums = Arrays.asList(11, 12, 13, 19, 15, 16, 17);

//        int val = nums.stream()
//                //.mapToInt(num -> num.intValue())
//                //.mapToInt(Integer::intValue)
//                .sum();
        Optional<Integer> val = nums.stream().reduce((x, y) -> x + y);
        val.ifPresent(System.out::println);

        System.out.println("Average for list of numbers-");

        OptionalDouble average = nums.stream().mapToDouble(value -> value.doubleValue()).average();
        if (average.isPresent()) {
            System.out.println("list average- " + average.getAsDouble());
        }

        int[] numsarr = new int[]{11, 12, 13, 19, 15, 16, 17};
        System.out.println("Array-");
        int total = Arrays.stream(numsarr).sum();
        System.out.println(total);
        System.out.println("Array average-" + Arrays.stream(numsarr).average().getAsDouble());
    }
}
