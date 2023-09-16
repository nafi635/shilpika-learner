package Day17Package;

import java.util.HashSet;

public class SetInterface {
    public static void main(String[] args) {
        HashSet<Integer> setInterfaceExample = new HashSet();
        setInterfaceExample.add(1);
        setInterfaceExample.add(2);
        setInterfaceExample.add(3);
        setInterfaceExample.add(4);
        setInterfaceExample.add(5);
        System.out.println(setInterfaceExample);
        System.out.println(setInterfaceExample.contains(3));
        setInterfaceExample.remove(4);
        System.out.println(setInterfaceExample);
        System.out.println(setInterfaceExample.clone());
    }
}
