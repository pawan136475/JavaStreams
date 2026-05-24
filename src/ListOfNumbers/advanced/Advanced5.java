package ListOfNumbers.advanced;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

//implement a parallel stream that computes the sum of squares of numbers in an array.
public class Advanced5 {

    public static void main(String[] args) {
        List<Integer> multilist = Arrays.asList(1, 2, 3, 4, 5, 6);
        Optional<Integer> total = multilist.parallelStream().map(num -> num * num).reduce((x, y) -> x + y);
        System.out.println("List- " + total.get());

        int[] twodim = new int[]{1, 2, 3, 4, 5, 6};
        int val = Arrays.stream(twodim).parallel().map(num -> num * num).sum();
        System.out.println("Array- " + val);
    }

}
