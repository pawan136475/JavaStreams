package ListOfNumbers.basics.intermediate;

import java.util.Arrays;
import java.util.List;

// Find the sum of squares of all the numbers in the array/list
public class Intermediate3 {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(11, 12, 13, 19, 15, 16, 17, 11, 12, 13);
        int sum = nums.stream().map(num -> num * num).mapToInt(Integer::valueOf).sum();
        System.out.println("List sum- " + sum);
        int[] numsarr = new int[]{11, 12, 13, 19, 15, 16, 17};

        System.out.println("Arrays- " + Arrays.stream(numsarr).map(num -> num * num).sum());
    }
}
