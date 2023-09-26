package Day21Package;

import java.util.ArrayList;
import java.util.List;

public class StreamExample {
    public static void main(String[] args) {
       List<Integer> streamex = new ArrayList<>();
        streamex.add(23);
        streamex.add(2);
        streamex.add(34);
        streamex.add(36);
        streamex.add(21);
        System.out.println(streamex);
        System.out.println("Total count of elements: " + streamex.stream().count());
        streamex.stream().filter(num -> num % 3 == 0).forEach(System.out::println);
        System.out.println("Sorted Stream: " + streamex.stream().sorted().toList());
        System.out.println("Max value: " + streamex.stream().max(Integer::compare).get());
        List<String> streamString = new ArrayList<>();
        streamString.add("Hello");
        streamString.add("Hi");
        streamString.add("How");
        streamString.add("are");
        streamString.add("you?");
        streamString.add("are");
        streamString.add("How");
        System.out.println(streamString);
        System.out.println(streamString.stream().count());
        streamString.stream().distinct().forEach(System.out::println);
    }
}
