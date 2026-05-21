package OOPS;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class Scanner_test{

    public static void main(String[] args) throws FileNotFoundException {
        Scanner sco = new Scanner(System.in);
        System.out.println("Input name");
//        String Name = sco.nextLine();
//
//        System.out.println("Entered User_name = "+Name);


        String deatils = "evaro 55 1400000000";
        Scanner sc = new Scanner(deatils);
        System.out.println("\n ---------------------------------------------------");
        System.out.println(sc.toString());
        System.out.println(sc.next());
        System.out.println(sc.nextInt());
        System.out.println(sc.nextInt());
        System.out.println(sc.toString());

        System.out.println("\n ---------------------------------------------------");


        //Using Delimiter other than whitespace
        String input = "1 fish 2 fish fish 3 fiish Read fish 4 seash Fish";
        Scanner scd = new Scanner(input).useDelimiter("\\s*fish\\s*");
        //System.out.println(scd.nextLine());
        System.out.println(scd.toString());
        while(scd.hasNext()){
            System.out.print(scd.next()+ " | ");
        }

        //scanning file
        System.out.println("\n\n ---------------------------------------------------");
        try {
        Scanner scanFile = new Scanner(new File("a.txt"));
        //a.txt has to be at same level as src to get access or else share the full path with the scanner class
        System.out.println("Content in the file a.txt");
            if (scanFile.hasNext()) {
                System.out.println(scanFile.nextLine());
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
            throw new RuntimeException(e);
        }
    }
}
