package streams.streammethods;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class demo2 {

    public static void main(String[] args) {
        List<Integer> numberList = Arrays.asList(1,2,3,4,5,6,7);

        // min()

        Optional<Integer> min =numberList.stream().min((value1, value2) ->{
            return value1.compareTo(value2);
        });
        System.out.println(min.get());

        //max()

        Optional<Integer> max =numberList.stream().max((value1, value2) ->{
            return value1.compareTo(value2);
        });
        System.out.println(max.get());

    }
}
