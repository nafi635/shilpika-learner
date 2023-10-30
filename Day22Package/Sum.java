package Day22Package;

import java.util.Arrays;
import java.util.List;

public class Sum {
    public static void main(String[] args) {
        List<Integer> sort = Arrays.asList(2,5,1,7,89,6,95,146,686,14,5,2,5,62,1455,541);
        System.out.println(sort);
        System.out.println(sort.stream().reduce(0,Integer::sum));
    }
}