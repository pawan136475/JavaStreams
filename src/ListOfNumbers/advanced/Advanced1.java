package ListOfNumbers.advanced;

import java.util.Arrays;
import java.util.List;

//Get the sum of numbers of a two dimensional array and list of list of integers
public class Advanced1 {
    public static void main(String[] args) {
        List<List<Integer>> multilist = Arrays.asList(Arrays.asList(1, 2, 3, 4), Arrays.asList(5, 6, 7, 8));

        int total = multilist.stream().flatMap(list -> list.stream()).mapToInt(Integer::intValue).sum();
        System.out.println("List sum- " + total);

        int[][] twodim = new int[][]{{1, 2}, {3, 4}, {5, 6}};
        int sum = Arrays.stream(twodim).flatMapToInt(onedim -> Arrays.stream(onedim)).sum();
        System.out.println("Array sum- " + sum);


    }
}
