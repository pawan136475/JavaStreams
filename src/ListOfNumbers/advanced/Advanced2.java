package ListOfNumbers.advanced;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

//Convert an array of integers into a map where the key is the number and the value is its square
public class Advanced2 {

    public static void main(String[] args) {

        List<Integer> multilist = Arrays.asList(1, 2, 3, 4, 5, 6);
        Map<Integer, Integer> mapnums = multilist.stream().collect(Collectors.toMap(key -> key, val -> val * val));
        mapnums.forEach((key, val) -> System.out.println(key + "-" + val));
        int[] twodim = new int[]{1, 2, 3, 4, 5, 6};
        Arrays.stream(twodim).mapToObj(Integer::valueOf).collect(Collectors.toMap(key -> key, val -> val * val)).forEach((key, val) ->
                System.out.println(key + "-" + val));
    }
}
