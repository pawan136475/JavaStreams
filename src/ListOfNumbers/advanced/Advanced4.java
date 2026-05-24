package ListOfNumbers.advanced;

import java.util.Arrays;
import java.util.List;

//Calculate the product of all numbers in the array using reduce
public class Advanced4 {

    public static void main(String[] args) {
        List<Integer> multilist = Arrays.asList(1, 2, 3, 4, 5, 6);
        int result = multilist.stream().reduce(1, (x, y) -> x * y);
        System.out.println("List- " + result);
        int[] twodim = new int[]{1, 2, 3, 4, 5, 6};

        result = Arrays.stream(twodim).reduce((x, y) -> x * y).getAsInt();
        System.out.println("Array- " + result);
    }
}
