package Day19Package;


import java.util.HashSet;

import java.util.Scanner;

public class Unrepeated {
    public static void main(String[] args) {
        HashSet<Character> unrepeated = new HashSet<>();
        char[] j = new char[10];
        Scanner sc = new Scanner(System.in);
        System.out.println("Please give a word");
        String word = sc.next();
        j = word.toCharArray();
        System.out.println(j);
        for(int i=0;i<10;i++){
            unrepeated.add(j[i]);
        }
       System.out.println(unrepeated);
        }
}
