package ListOfNumbers.intermediate;

import java.util.Arrays;
import java.util.List;

//Get the first number greater than 50 in a list/array
public class Intermediate5 {

    public static void main(String[] args) {

        List<Integer> nums = Arrays.asList(11, 12, 13, 19, 15, 16, 17, 11, 12, 93);
        int number = nums.stream().filter(num -> num > 50).findFirst().get();
        System.out.println("list number-  " + number);
        int[] numsarr = new int[]{11, 12, 13, 19, 15, 16, 17};

        int val = Arrays.stream(numsarr).mapToObj(Integer::valueOf).filter(num -> num > 50).findFirst().get();
        System.out.println("Arrays number- " + val);
    }
}
