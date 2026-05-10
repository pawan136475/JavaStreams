package ListOfNumbers.basics.intermediate;

import java.util.Arrays;
import java.util.List;

//Remove duplicate elements from an array/list of integers
public class Intermediate1 {
    public static void main(String[] args) {

        List<Integer> nums = Arrays.asList(11, 12, 13, 19, 15, 16, 17, 11, 12, 13);
        nums.stream().distinct().forEach(System.out::println);

        System.out.println("------------------------------------");
        int[] numsarr = new int[]{11, 12, 13, 19, 15, 16, 17};
        Arrays.stream(numsarr).distinct().forEach(System.out::println);
    }
}
