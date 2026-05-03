package experiments;

import java.util.Scanner;

public class Pyramid {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter the no of rows required in a number: ");
        int required_rows= scan.nextInt();
        System.out.println((" ".repeat(3))+"c");
//        for (int i = 1; i <=required_rows; i++) {
//            for (int j = 1; j <= i; j++) {
//                System.out.print("* ");
//            }
//            System.out.println("\n");
//        }
        for (int i = 1; i <=required_rows; i++) {
            System.out.print(" ".repeat(required_rows-i+5));
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println("\n");
        }
    }
}


