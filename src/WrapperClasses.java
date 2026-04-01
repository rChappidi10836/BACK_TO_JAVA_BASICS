public class WrapperClasses {

    /**
     * 1. Wrapper = Object version of primitive
     * 2. Autoboxing = primitive → object
     * 3. Unboxing = object → primitive
     * 4. Integer caching (-128 to 127)
     * 5. Wrappers are immutable
     * 6. Beware of NullPointerException during unboxing
     * 7. Avoid wrappers in loops (performance)
     */

    /*  Integer x = null;
        x = x+1;
        System.out.println(x);

        Gives null pointer exception
        cuz internally x+1 changes to x.intValue() +1
        but null can't be handled by primitive integer
     */



    static void cachingIntegerWithInRange(){
        //Integer caching range (-128 to 127), Both point to same cached object
        Integer c = 100;
        Integer d = 100;
        System.out.println("\nwith in cache reach");
        System.out.println("c == d "+ (c==d));//true
        cachingIntegerOutOfRange();
    }

    static void cachingIntegerOutOfRange(){
        Integer c = 200;
        Integer d = 200;
        System.out.println("\nOut of caching range");
        System.out.println("c == d "+ (c==d));//false
        System.out.println("c == d "+ c.equals(d));//true
        //cuz her range is out of caching and objects are created and they are compared
    }

    //BOXING
    static void autoBoxing(){
        //primitive to wrapper class auto-conversion
        int a = 10;
        Integer b = a;
        System.out.println("\nautoBoxing");
        System.out.println("int a = "+a+" Integer b = "+b);
    }

    static void unBoxing(){
        //Wrapper to primitive auto-conversion
        Integer x =15;
        int b = x;
        System.out.println("\nunBoxing");
        System.out.println("Integer x = "+x+ " int b = "+b);
    }

    static void together(){
        //autoboxing and unboxing together happening internally
        Integer k = 55;
        k++;
        /**k = Integer.valueOf(k.intValue() + 1);
         * this is how it gets incremented internally
         * where unbocking and autoboxing happens*/

        System.out.println("k++ = "+k);
    }

    static void proofOfWrappersAreImmutable(){
        /**Wrapper objects are immutable.

         Integer x = 10;
         x = x + 1;

         👉 A new object is created, old one remains unchanged.*/
        Integer ey = 68;
        int firstHashcode = System.identityHashCode(ey);
        ey +=1;
        int secHashcode = System.identityHashCode(ey);

        System.out.println("\n ey = "+ey);
        System.out.println("1st reff = "+firstHashcode);
        System.out.println("2nd reff = "+secHashcode);
        System.out.println(firstHashcode==secHashcode);

    }

    public static void main(String[] args) {
        autoBoxing();
        unBoxing();
        cachingIntegerWithInRange();
        proofOfWrappersAreImmutable();

        /**
         * Conversion Methods
         *  String → Primitive
         *      int x = Integer.parseInt("123");
         *  Primitive → Wrapper
         *      Integer x = Integer.valueOf(10);
         *  Wrapper → String
         *      String s = Integer.toString(10);
         */
    }
}
