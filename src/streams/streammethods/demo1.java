package streams.streammethods;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class demo1 {
    public static void main(String[] args) {
        //distinct()    count() limit()

        List<String> vehicleList = Arrays.asList("bus", "car", "car", "bike", "bus");


        // distinct
        List<String> vehicleListDistinct =vehicleList.stream().distinct().collect(Collectors.toList());

        System.out.println(vehicleListDistinct);

        // count
        System.out.println(vehicleListDistinct.stream().distinct().count());

        // limit
        vehicleList.stream().limit(2).forEach(System.out::println);
    }
}
