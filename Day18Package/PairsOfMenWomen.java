package Day18Package;

import java.util.ArrayList;
import java.util.Scanner;
public class PairsOfMenWomen {
    public static void main(String[] args) {
        ArrayList<String> man = new ArrayList<>();
        ArrayList<String> woman = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 3 names of woman");
        for (int i = 0; i < 3; i++) {
            String nameWoman = sc.next();
            woman.add(nameWoman);
        }
        System.out.println("Enter 3 names of man");
        for (int i = 0; i < 3; i++) {
            String nameMan = sc.next();
            man.add(nameMan);
        }
        if(woman.size() == man.size()){
            for(int i = 0;i<3;i++)
            System.out.println("[" + woman.get(i) + " ," + man.get(i)  + "]");
        }
    }
}