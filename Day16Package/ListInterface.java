package Day16Package;

import java.util.ArrayList;

public class ListInterface {
    public static void main(String[] args) {
        ArrayList<Integer> listofIntegers1 = new ArrayList<>();
        listofIntegers1.add(30);
        listofIntegers1.add(40);
        listofIntegers1.add(50);
        listofIntegers1.add(60);
        listofIntegers1.add(70);
        System.out.println(listofIntegers1);
        System.out.println(listofIntegers1.contains(60));
       /* listofIntegers1.removeAll(listofIntegers1);
        System.out.println(listofIntegers1);
        listofIntegers1.clear();
        System.out.println(listofIntegers1);*/
        ArrayList<Integer> listofIntegers2 = new ArrayList<>();
        listofIntegers2.add(90);
        listofIntegers2.add(20);
        listofIntegers2.add(30);
        listofIntegers2.add(20);
        listofIntegers2.add(60);
        listofIntegers2.add(3,80);
        System.out.println(listofIntegers2);
        //boolean a;
        listofIntegers1.addAll(listofIntegers2);
        //System.out.println("Added elements of 2 to 1 " +);
        System.out.println(listofIntegers1);
        System.out.println(listofIntegers2);
    }
}
