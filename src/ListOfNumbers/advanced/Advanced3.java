package ListOfNumbers.advanced;


import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

//Partition an array of integers into two groups: even and odd using Streams.
public class Advanced3 {

    public static void main(String[] args) {
        List<Integer> multilist = Arrays.asList(1, 2, 3, 4, 5, 6);


        Map<Boolean, List<Integer>> result = multilist.stream().collect(Collectors.partitioningBy(num -> num % 2 == 0));
        System.out.println("Even Numbers- " + result.get(true));
        System.out.println("Odd Numbers- " + result.get(false));

        int[] twodim = new int[]{1, 2, 3, 4, 5, 6};
        Arrays.stream(twodim).mapToObj(Integer::valueOf).collect(Collectors.partitioningBy(num -> num % 2 == 0)).forEach((key, value) -> System.out.println("key-" + key + " value-" + value));
    }
}
