package ListOfNumbers.basics;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

//Get the even/odd numbers between a range
public class Basic2 {
    public static void main(String[] args) {

        List<Integer> nums = Arrays.asList(11, 12, 13, 14, 15, 16, 17);

        IntStream.rangeClosed(10, 100).filter(val -> val % 2 == 0).forEach(System.out::println);
        int[] numsarr = new int[]{11, 12, 13, 14, 15, 16, 17};
    }
}
