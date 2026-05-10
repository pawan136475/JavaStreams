package ListOfNumbers.basics.intermediate;

import java.util.Arrays;
import java.util.List;

//Get the second largest number and second smallest  number in a list/array
public class Intermediate4 {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(11, 12, 13, 19, 15, 16, 17, 11, 12, 13);

        int secondLargest = nums.stream().sorted((a, b) -> b - a).skip(1).findFirst().get();
        System.out.println("List- " + secondLargest);
        int[] numsarr = new int[]{11, 12, 13, 19, 15, 16, 17};
        int secondLarge = Arrays.stream(numsarr).mapToObj(Integer::valueOf).sorted((a, b) -> b - a).skip(1).findFirst().get();
        System.out.println("Arrays- " + secondLarge);
    }
}
