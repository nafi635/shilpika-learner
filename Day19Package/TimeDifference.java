package Day19Package;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import static java.lang.Math.abs;

public class TimeDifference {
    public static void main(String[] args) {
        List<String> time = new ArrayList<>(2);
        Scanner sc = new Scanner(System.in);
        String t1, t2;
        System.out.println("Please enter t1 and t2 values");
        for( int i = 0; i < 2; i++){
            time.add(i,sc.next());
        }
        System.out.println(time);
        t1=time.get(0);
        t2=time.get(1);
        int td=0;
        if(time.get(0).charAt(t1.length()-2) == time.get(1).charAt(t2.length()-2))
        {
            td = abs(time.get(0).charAt(1)-time.get(1).charAt(1));
        }
        else {
            td = 12+abs((time.get(0).charAt(1)-time.get(1).charAt(1)));
        }
        System.out.println(td);
    }
}
