package Day22Package;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class ReverseSorting {
    public static void main(String[] args) {
        List<Integer> sort = Arrays.asList(2,5,1,7,89,6,95,146,686,14,5,2,5,62,1455,541);
        System.out.println("Given List of Integers: " + sort);
        System.out.println("Reverse sorted List of Integers: " + sort.stream().sorted(Comparator.reverseOrder()).toList());
    }
}
