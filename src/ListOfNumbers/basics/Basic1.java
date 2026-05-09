package ListOfNumbers.basics;

import java.util.Arrays;
import java.util.List;

//Get the even/odd numbers from an array of numbers and list of numbers
public class Basic1 {

    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(11, 12, 13, 14, 15, 16, 17);
        nums.stream().filter(val -> val % 2 == 0).forEach(System.out::println);

        int[] numsarr = new int[]{11, 12, 13, 14, 15, 16, 17};
        Arrays.stream(numsarr).filter(val -> val % 2 != 0).forEach(System.out::println);

    }
}
