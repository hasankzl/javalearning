package streams.streammethods;

import java.util.Arrays;
import java.util.List;

public class ToArrayExample {
    public static void main(String[] args) {
        List<String> stringList = Arrays.asList("A","B","C","1","2","3");

        Object arr[] =stringList.stream().toArray();

        System.out.println(arr.length);

        Arrays.stream(arr).forEach(System.out::println);
    }
}
