package Operators;

public class Assignment_and_Ternary {
    //simple assignment =
    //compound assignments (+=, -=, *=, /=, %=)

    //Ternary Operator
    //condition? trueValue : falseValue
    //condition? expression to execute if true : expression to execute if false;

    public static void main(String[] args) {

        //how compound assignment works
        byte b = 10;
        System.out.println("b = "+b);
        b+=10; //it works even though byte + int  because internaly b=(byte)(b + 10);
        System.out.println("post b+=10, b = "+b);

        //let's test that b is still byte or not using terinary
        // using wrapper call to prove above condition as instanceof only works on object not on primitives
        /*Byte i = 7;
        i +=4;// gives error cuz*/
        /*🎯 Final Rule

        ✔ Safe → use primitives for calculations
        ✔ Use wrappers → only when needed (collections, null, etc.)
        ⚠ Mixing both → can cause bugs

        🔥 One-line takeaway
        Primitives = simple & safe
        Wrappers = powerful but tricky*/
        byte e=7;
        e+=1;
        System.out.println("e = "+e);

        Integer i = 55;
        i+='a';
        System.out.println("i = "+i+"\nis i still Integer after i+='a'? : "+ ((i instanceof Integer)? "Yes":"No"));

    }
}
