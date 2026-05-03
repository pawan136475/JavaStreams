import java.util.Arrays;
import java.util.List;

public class Streams {
    public static void main(String[] args) {
        List<String> course = Arrays.asList("Java", "Angular", "C++");
        course.stream()
                .filter(str -> str.length() > 3)
                .forEach(str -> System.out.println(str));
    }
}
