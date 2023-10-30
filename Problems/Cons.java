package Problems;

import java.util.*;
import java.util.stream.Collectors;

public class Cons {
    public static void main(String[] args) {
        List<Integer> con = Arrays.asList(2,5,8);
        List<Integer> finall = new ArrayList();
        finall = con.stream().filter(i -> Collections.frequency(con, i) >1).toList();
        System.out.println("Final values repeated " + finall);
        if (finall.size() > 0 ){
            System.out.println("True");
            System.out.println("True Values " + finall.stream().distinct().toList());

       }
       else{
           System.out.println("False");
           System.out.println(" False values " + finall);
       }
    }
}