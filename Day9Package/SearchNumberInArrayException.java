package Day9Package;

import java.util.Scanner;

public class SearchNumberInArrayException {
    public static void main(String[] args) throws ArrayStoreException {
        int a[] = new int[5];
        int i;
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter 5 integer values");
        for (i = 1; i < 5; i++) {
            a[i] = sc.nextInt();
            try {
                if(a[0] == 'e');
            } catch (ArrayStoreException d) {
                System.out.println("Please enter integers only");
            }
        }
        System.out.println("Please enter a number within or out of array");
        int num = sc.nextInt();
        boolean isPresent = false;
        for (i = 0; i < 5; i++) {
            if (a[i] == num)
                isPresent = true;
        }
        if (isPresent)
            System.out.println("True");
        else
            System.out.println("False");
    }
}
