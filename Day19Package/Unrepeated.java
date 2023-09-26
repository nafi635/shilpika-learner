package Day19Package;

import java.util.*;

public class Unrepeated {
    public static void main(String[] args) {
       // Collection<Character> unrepeated = new HashSet<>();
        Set<Character> j = new HashSet<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Please give a word");
        String word = sc.next();
        for(int i = 0;  i <word.length() ;   i++){
            j.add(word.charAt(i));
        }
        System.out.println(j);
    }
}
