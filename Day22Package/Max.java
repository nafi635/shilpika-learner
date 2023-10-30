package Day22Package;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Max {
    public static void main(String[] args) {
        List<Integer> max = new ArrayList<>();
        max = Arrays.asList(10,51,92,83,4,55,5,68,66,76,42,39,53,33);
        System.out.println("Maximum number is " + max.stream().max(Integer::compareTo).get());
    }
}
