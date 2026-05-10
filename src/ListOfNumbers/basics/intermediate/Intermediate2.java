package ListOfNumbers.basics.intermediate;

import java.util.Arrays;
import java.util.List;

//Convert a list/array of integers to a list of their squares and print them
public class Intermediate2 {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(11, 12, 13, 19, 15, 16, 17, 11, 12, 13);
        nums.stream().map(num -> num * num).forEach(System.out::println);

        System.out.println("---------------------------------------");

        int[] numsarr = new int[]{11, 12, 13, 19, 15, 16, 17};
        Arrays.stream(numsarr).map(num -> num * num).forEach(System.out::println);
    }
}
