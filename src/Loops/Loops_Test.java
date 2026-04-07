package Loops;

public class Loops_Test {

    public boolean findPrimeorNot(int n) {
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
