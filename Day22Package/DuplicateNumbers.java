package Day22Package;

import java.util.HashSet;
import java.util.Set;

public class DuplicateNumbers {
    public static void main(String[] args) {
        Set<Integer> dup = new HashSet<>();
        dup.add(3);
        dup.add(43);
        dup.add(33);
        dup.add(23);
        dup.add(23);
        System.out.println(dup);
        System.out.println(dup.stream().count());
    }
}
