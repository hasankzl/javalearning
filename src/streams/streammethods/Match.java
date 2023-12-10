package streams.streammethods;

import java.util.HashSet;
import java.util.Set;

// anyMatch()
// allMatch()
// nOneMatch()
public class Match {

    public static void main(String[] args) {

        Set<String> fruites = new HashSet<>();
        fruites.add("One apple");
        fruites.add("One mango");
        fruites.add("Two apples");
        fruites.add("More grapes");
        fruites.add("Two guavas");

        // at least 1 value should start with "One"
        boolean anyMatchResult =fruites.stream().anyMatch(value -> value.startsWith("One"));

        System.out.println("anyMatch: "+anyMatchResult);


        // every value should start with "One"
        //allMatch()
        boolean allMatchResult =fruites.stream().allMatch(value -> value.startsWith("One"));

        System.out.println("allMatchResult: "+allMatchResult);


        // nOne of the elements should not start with "One"
        //nOneMatch()
        boolean noneMatchResult =fruites.stream().noneMatch(value -> value.startsWith("One"));

        System.out.println("noneMatchResult: "+noneMatchResult);
    }
}
