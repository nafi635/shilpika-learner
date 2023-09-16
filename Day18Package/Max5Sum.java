package Day18Package;

import java.util.Arrays;

public class Max5Sum {
    public static void main(String[] args) {
        int[] a = {0, 0, 0, 0, 0, 0, 0, 0, 0, 100};
        int i;
        Arrays.sort(a);
        int total=0;
        for(i=5;i<10;i++)
            total=a[i]+total;
        System.out.println("The maximum total of given set of integers is " + total);
    }
}
