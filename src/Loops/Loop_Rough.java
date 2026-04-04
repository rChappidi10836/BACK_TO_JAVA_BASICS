package Loops;

import java.util.Scanner;

public class Loop_Rough {
    public static void main(String[] args) {


        /**
         * Labels used to control nested loops and
         * they can also be applied to any block of code as below
         */
        outside:
        for(int i=1;i<=3;i++){
            for(int j=1;j<4;j++){
                if((i*3) == (j*1)){
                    System.out.println(i);
                    System.out.println(i+" "+j);
                    break outside;
                }
            }
        }

        bayata:
        for(int i=1;i<55;i++){
            for(int j=1;j<10;j++){
                if(j!=2 && (i/(float)j)== 0.5f){
                    System.out.println(i+" "+j);
                    break bayata;
                }
            }
        }

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int x = sc.nextInt();
        edhotry:
        {
            System.out.println(" first dhi elago avuthindhi ley");
            System.out.println(" Second dhi avvudhu emo ani konnnchem anumanam ga vundhi");
            System.out.println(" aa tharvath tharva yentaney mudu andi");
            System.out.println(" hmmaya naku enni lekkalu vasthunayo");
            if(x==3) break edhotry;
            System.out.println(" leksthundhayoo thusu");
        }

        System.out.println("Final touch");
    }
}
