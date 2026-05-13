package experiments;

import java.util.ArrayList;
import java.util.Arrays;

public class Primes {
    static private ArrayList<Integer> findnPrimes(int n){
        ArrayList<Integer> x = new ArrayList<>();
        int count;
        for (int i=2;i<Integer.MAX_VALUE;i++){
            count=0;
            for (int j=1;j<=(i/2);j++){
                if(i%j == 0){
                    count++;
                }
            }
            count++;
            if(count<=2){
                x.add(i);
            }
            if(x.size()==n){
                return x;
            }
        }
        return x;
    }
    
    static private int findnthPrime(int n){
        int count;
        for (int i=2;i<Integer.MAX_VALUE;i++){
            count=0;
            for (int j=1;j<=(i/2);j++){
                if(i%j == 0){
                    count++;
                }
            }
            count++;
            if(count<=2){
                if(--n == 0){
                    return i;
                }
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        System.out.println("Print 10 primes "+ Primes.findnPrimes(10));
        System.out.println("Finding nth prime "+Primes.findnthPrime(3));
        int count;
        int tenthprime = 10;
        for (int i=2;i<100;i++){
            count=0;
            for (int j=1;j<=(i/2);j++){
                if(i%j == 0){
                    count++;
                }
            }
            count++;
            if(count<=2){
                if(--tenthprime == 0)
                    System.out.print(i+" ");
            }
        }
    }
    
    
    
}
