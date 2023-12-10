package streams.map;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

public class MapDemo {

    public static void main(String[] args) {

        List<String> vehicles = Arrays.asList("bus","car","bicycle","flight","train");

        List<String> upperCaseVehicles = new ArrayList<>();

        upperCaseVehicles = vehicles.stream().map(v -> v.toUpperCase(Locale.ROOT)).collect(Collectors.toList());
        vehicles.stream().forEach(v -> System.out.println(v.length()));
        System.out.println(vehicles);
        System.out.println(upperCaseVehicles);
    }
}
