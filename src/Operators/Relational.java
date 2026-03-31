package Operators;

import com.sun.jdi.PathSearchingVirtualMachine;

public class Relational {
    String name;

//    @Override
//    public boolean equals(Object o){
//        Relational r = (Relational) o;
//        return  this.name.equals(r.name);
//    }// now r1.equals(r2); works


    public static void main(String[] args) {
        int a = 5, b =4;
        System.out.println("a= "+a+ " b= "+b);

        System.out.println("a>b = "+ (a>b));
        System.out.println("a<b = "+ (a<b));
        System.out.println("a>=b = "+ (a>=b));
        System.out.println("a<=b = "+ (a<=b));
        System.out.println("a==b = "+ (a==b));// == only works for primitive data types
                                              // for objects need to use .equals()
        System.out.println("a!=b = "+ (a!=b));
        char c = 'c';
        System.out.println("a>c = "+ (a>c));//comparing int and char works internally works as 5 > (int) 'c'

        String s1= " edho 😅😅";
        String s2= " edho 😅😅";
        System.out.println("s1==s2 =>"+ (s1==s2)); // true
        System.out.println("s1==s2 =>"+ s1.equals(s2));//true cuz
        /*STACK                     STRING CONSTANT POOL (SCP)
        -----------------         -------------------------------
        s1  -----------+-------->  "temp"   (one shared object)
        s2  -----------+*/

        String k = new String("inkedho");
        String d = new String("inkedho");
        System.out.println("k==d =>"+ (k==d)); // false
        System.out.println("k==d =>"+ k.equals(d));//true cuz
        //doesn't work cuz == compares the references for object types so need to use .equals()
        /*STACK                     HEAP
         -----------------    --------------------
         k -----------+----->  Object1 ("temp")
         d -----------+----->  Object2 ("temp")*/

        //.equals only works when it is overriden properly
        // which mean the class should have it's own equals method or it compares references only like below

        Relational r1 = new Relational();
        r1.name="Raja";
        Relational r2 = new Relational();
        r2.name="Raja";

        System.out.println(r1.equals(r2));//false compares references
        System.out.println(r1.name.equals(r2.name));//true

        //instead also can you overriden method in class as commented above








    }

}
