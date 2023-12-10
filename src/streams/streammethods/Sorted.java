package streams.streammethods;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Sorted {

    public static void main(String[] args) {
        List<Integer> list1 = Arrays.asList(2, 4, 1, 3, 7, 5, 9);

        List<Integer> sortedList = list1.stream().sorted().collect(Collectors.toList());

        System.out.println(sortedList); //ascending order


        List<Integer> sortedListDesc = list1.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());

        System.out.println(sortedListDesc); //descending order

        // Strings

        List<String> list2 = Arrays.asList("John","Mary","Kim","David","Smith");

        List<String> sortedList2 = list2.stream().sorted().collect(Collectors.toList());

        System.out.println(sortedList2);
    }
}
