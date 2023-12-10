package streams.streammethods;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

//findAny()
//findFirst()
public class Find {


    public static void main(String[] args) {
        List<String> stringList = Arrays.asList("one","two","three","four","five","six");

        Optional<String> findAnyResult=stringList.stream().findAny();

        System.out.println(findAnyResult.get());

        // findFirst

        Optional<String> findFirstResult= stringList.stream().findFirst();

        System.out.println(findFirstResult.get());

    }

}
