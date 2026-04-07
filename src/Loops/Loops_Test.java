package Loops;

public class Loops_Test {

    public boolean findPrimeorNot(int n) {
        /**
         * How the below code works by functional pairing we don't have check the factors twice
         * for example if we check if 36 is divisible by 2 or not then we are automatically checking if 18 is divisible or not too
         * cuz even 2*18 or 18*2 don't change
         *
         * so what we are doinng is taking the sqrt of the number and checking if it has any factor in between 1 and sqrt(n)
         * if yes it will be non-prime and no it will be prime cuz
         * prime only have 1 and itself(n) as factors
         *
         * */
        int count = 0;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            //System.out.println("n%i => " + n + "%" + i + " = " + (n % i));
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Loops_Test O = new Loops_Test();
        System.out.println("8 is prime? "+O.findPrimeorNot(8));
        System.out.println("34 is prime? "+O.findPrimeorNot(34));
        System.out.println("7 is prime? "+O.findPrimeorNot(7));
        System.out.println("137 is prime? "+O.findPrimeorNot(137));
        System.out.println("5561 is prime? "+O.findPrimeorNot(5561));
    }
}
