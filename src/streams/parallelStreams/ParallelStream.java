package streams.parallelStreams;

import java.util.Arrays;
import java.util.List;

class Student {

    String name;
    Integer score;

    public Student(String name, Integer score) {
        this.name = name;
        this.score = score;
    }
}

public class ParallelStream {

    public static void main(String[] args) {

        List<Student> studentList = Arrays.asList(
                new Student("hasan", 100),
                new Student("mustafa", 90),
                new Student("John", 82),
                new Student("Bob", 55),
                new Student("Eric", 87),
                new Student("Smith", 66),
                new Student("Scott", 50)
        );

        // using stream
        studentList.stream().filter(s -> s.score > 80).limit(3).forEach(s -> {
            System.out.println(s.name + " " + s.score);
        });

        // parallel stream
        studentList.parallelStream().filter(s -> s.score > 80).limit(3).forEach(s -> {
            System.out.println(s.name + " " + s.score);
        });

        //convert stream -> parallelStream
        // parallel

        studentList.stream().parallel().filter(s -> s.score > 80).limit(3).forEach(s -> {
            System.out.println(s.name + " " + s.score);

        });

    }
}
