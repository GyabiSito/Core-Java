import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamToList {
    public static void main(String[] args) {
        List<String> ids= Arrays.asList("123","456","789");
        List<Integer> idsInInt=ids.stream().map(Integer::parseInt).toList();
    }
}
