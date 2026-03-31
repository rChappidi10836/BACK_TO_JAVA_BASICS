package Operators;

import static java.lang.System.in;

public class Logical_and_Bitwise {

    static int a =5, b=6;
    //logical (stricly boolean only)
    static void landOp(){
        System.out.println("/and &&");
        System.out.println("a>4 && b<4 = "+((a>4)&&(b<4)));
    }
    static void lorOp(){
        System.out.println("/or ||");
        System.out.println("a>4 || b<4 = "+((a>4)||(b<4)));
    }

    static void lnotOp(){
        System.out.println("/not !");
        System.out.println("! a>4 = "+!(a>4));
    }

    //boolean (strictly both sides of operands should be of either boolean or non-boolean)
    // like boolean & boolean, boolean | boolean,
    //also non-boolean | non-boolean, non-boolean ^ non-boolean, non-boolean & non-boolean.
    static void bandOp(){
        //if both bits are 1, it gives 1, else it shows 0.
        /*ex: a = 5 = 0101 (In Binary)
        b = 7 = 0111 (In Binary)

        Bitwise AND Operation of 5 and 7
        0101
                & 0111
        ________
        0101  = 5 (In decimal)*/
        System.out.println("/AND &");
        System.out.println(" a & b = "+(a&b));
    }

    static void borOp(){
        //if either of the bits is 1, it gives 1, else it shows 0.
        System.out.println("/OR |");
        System.out.println(" a | b = "+(a|b));
    }

    static void bxorOp(){
        //if corresponding bits are different, it gives 1, else it shows 0.
        System.out.println("/XOR ^ ");
        System.out.println(" a ^ b = "+(a^b));
    }

    static void bnotOp(){
        //bitwise complement ~
        //It inverts all the bits of the given number (0 becomes 1 and 1 becomes 0).
        System.out.println("/NOT ~");
        System.out.println(" ~b = "+~b);
    }

    /*NOTE:
    *  We can use bitwise and/or in place of logical and/or in conditioning if we want 2 conditions to execute for sure
    * example:
    *
    * if(true || method()) or if (false && method()) ---> here method won't be executing even if we want as by first part condition itself whole condition is satisfied
    * so we can use if(false & method()) in this case the 1st and 2nd both are evalutated and then the whole condition is evaluated
    * */

    /*🎯 Final Difference
    Operator	Executes RHS?
            &	Always
            &&	Only if needed

            this behavior in logical operators is called "SHORT-CIRCUT"*/



    public static void main(String[] args) {
        System.out.println("a = "+a+" b = "+b);
        System.out.println("---logical");
        landOp();
        lorOp();
        lnotOp();
        System.out.println("=== bitwise");
        bandOp();
        borOp();
        bnotOp();
        bxorOp();
        bnotOp();

    }
}
