package streams.filter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class filterDemo {

    public static void main(String[] args) {

/*
        ArrayList<Integer> numberList = new ArrayList<>();

        numberList.add(10);
        numberList.add(20);
        numberList.add(15);
        numberList.add(30); */

        List<Integer> numberList = Arrays.asList(10,15,20,25,30);

        List<Integer> evenNumbersList = new ArrayList<>();

        evenNumbersList= numberList.stream().filter(n -> n%2==0).collect(Collectors.toList());

        // numberList.stream().streams.filter(n->n%2==0).forEach(System.out::println);

        System.out.println("numberList: " +numberList);
        System.out.println("evenNumbersList: " +evenNumbersList);
    }
}
