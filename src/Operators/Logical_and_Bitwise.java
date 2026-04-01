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

    //shift Operator
    static void lshift(){
        //Moves bits left, fills right with 0
        //a << n ≈ a * 2ⁿ
        System.out.println("/Left shift << ");
        System.out.println(" a << 1 = "+(a<<1));//5-> 0101 // 1010 → 10
    }

    static void signedrshift(){
        //Moves bits right, keeps sign bit
        //a >> n ≈ a / 2ⁿ
        System.out.println("/signed Right shift >> ");
        System.out.println(" b >> 1 = "+(b >> 1));
    }

    static void unsignedrshift(){
        //Always fills left with 0 (ignores sign)
        System.out.println("/unsigned Right shift >>> ");
        System.out.println(" b >>> 1 = "+(b >>> 1));
    }


    //uses of shift operators
    /*
    * 🚀 1️⃣ Fast Multiply / Divide by 2
Problem

Multiply or divide without * or /

int x = 6;

System.out.println(x << 1); // 12 (6 * 2)
System.out.println(x >> 1); // 3  (6 / 2)

👉 Used in performance-critical code.

🚀 2️⃣ Check if Number is Power of 2
Problem

Check if n is power of 2

int n = 8;

if ((n & (n - 1)) == 0) {
    System.out.println("Power of 2");
}

👉 Internally uses bit shifting logic (single 1 bit)

🚀 3️⃣ Extract a Specific Bit
Problem

Get kth bit of number

int n = 10; // 1010
int k = 1;

int bit = (n >> k) & 1;

System.out.println(bit); // 1

👉 Used in:

Bit masking
Low-level programming
🚀 4️⃣ Set a Bit
Problem

Turn ON kth bit

int n = 8; // 1000
int k = 1;

n = n | (1 << k);

System.out.println(n); // 1010 → 10
🚀 5️⃣ Clear a Bit
Problem

Turn OFF kth bit

int n = 10; // 1010
int k = 1;

n = n & ~(1 << k);

System.out.println(n); // 1000 → 8
🚀 6️⃣ Toggle a Bit
Problem

Flip kth bit

int n = 10; // 1010
int k = 1;

n = n ^ (1 << k);

System.out.println(n); // 1000 → 8
🚀 7️⃣ Swap Two Numbers (No Temp)
int a = 5;
int b = 3;

a = a ^ b;
b = a ^ b;
a = a ^ b;

System.out.println(a + " " + b); // 3 5
🚀 8️⃣ Count Set Bits (Important)
int n = 10; // 1010
int count = 0;

while (n > 0) {
    count += (n & 1);
    n = n >> 1;
}

System.out.println(count); // 2
🚀 9️⃣ Fast Exponentiation (Using Shift)
int base = 2;
int power = 5;
int result = 1;

while (power > 0) {
    if ((power & 1) == 1)
        result *= base;

    base *= base;
    power >>= 1;
}

System.out.println(result); // 32

👉 Used in:

Cryptography
Competitive programming
🔥 Most Important Patterns
Pattern	Meaning
1 << k	create mask
n & 1	check odd/even
n >> 1	divide by 2
n << 1	multiply by 2
🎯 Final Insight

Shift operators are mainly used for:

Bit masking
Performance optimization
Low-level manipulation
⚡ One-line takeaway

If you see bits → think shifts.*/


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
        System.out.println("=== shifting");
        lshift();
        signedrshift();
        unsignedrshift();

    }
}
