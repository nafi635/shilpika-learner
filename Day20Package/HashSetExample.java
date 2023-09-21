package Day20Package;

import java.util.HashSet;

public class HashSetExample {
    public static void main(String[] args) {
        HashSet<Integer> hashExample = new HashSet<>();
        hashExample.add(1);
        hashExample.add(2);
        hashExample.add(1);
        hashExample.add(2);
        hashExample.add(3);
        System.out.println(hashExample);
        System.out.println(hashExample.contains(1));
    }
}
