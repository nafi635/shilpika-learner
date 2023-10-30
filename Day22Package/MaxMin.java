package Day22Package;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MaxMin {
    public static void main(String[] args) {
        List<Integer> maxmin = new ArrayList<>();
        maxmin = Arrays.asList(0,1,2,3,4,5,5,6,6,7,42,3,53,433);
        System.out.println("Maximum number is " + maxmin.stream().max(Integer::compareTo).get());
        System.out.println("Minimum number is " + maxmin.stream().min(Integer::compareTo).get());
    }
}
