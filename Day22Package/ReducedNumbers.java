package Day22Package;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ReducedNumbers {
    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>();
        arr = Arrays.asList(1,2,3,2,1,2,3,2,1,2);
        System.out.println(arr);
        for(int i = 0;  i<6;i++){
            System.out.println(arr.get(i));
        }
    }
}
