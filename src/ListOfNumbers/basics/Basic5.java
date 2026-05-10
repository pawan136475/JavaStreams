package ListOfNumbers.basics;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.OptionalInt;

//Find the maximum/minimum number in an array/list of numbers
public class Basic5 {
    public static void main(String[] args) {


        List<Integer> nums = Arrays.asList(11, 12, 13, 19, 15, 16, 17);
//        int max = nums.stream().max(Comparator.comparing(Integer::valueOf)).get();
//        System.out.println("list maximum 2- " + max);

        int max = nums.stream().mapToInt(Integer::valueOf).max().getAsInt();
        System.out.println("list maximum 2- " + max);

        int[] numsarr = new int[]{11, 12, 13, 19, 15, 16, 17};
        OptionalInt optnum = Arrays.stream(numsarr).max();
        optnum.ifPresent(maxx -> System.out.println("Arrays Max- " + max));

    }
}
