package Operators;

public class Arithmetic {
    public static void main(String[] args){
        int a = 2;
        int b = 5;

        System.out.println("a+b = "+(a+b)+"\na-b = "+(a-b)+"\na*b = "+(a*b)+"\nb/a = " + (b/a) + "\nb%a = "+(b%a));

        float c = 5;
        int   d = 2;

        System.out.println("float c/ int d = "+(c/d));
        System.out.println("Type of c/d is "+ ((Object)(5.0/2)).getClass().getSimpleName());


        //Unary Operators => increment and decrement
        System.out.println("a = " + a + " b = " + b) ;
//        a++; ++b;
        System.out.println("post and pre increments");
        System.out.println("a = " + a++ + " b = " + ++b) ;
        System.out.println("a = " + a + " b = " + b) ;
//        --a;
        System.out.println("pre and post decrement");
        System.out.println("a = " + --a + " b = " + b--) ;
        System.out.println("a = " + a + " b = " + b) ;
//        b--;
    }
}
