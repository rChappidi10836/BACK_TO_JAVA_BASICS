package OOPS;
//real world examples of how classes and objects work

import java.util.Scanner;

//general template
public class This_Capitalist {
    long money;

    //same name as class
    This_Capitalist(){
        System.out.println("New world order is only money");
    }

    public void earn(){
        System.out.println("How much money earned till now "+ money);
        System.out.println("How much money earned till now "+ this.money);// this refers to current object's instance variable
        // here even without this. the money will print cuz internally java passes this=man or object
    }

    //when there is an ambiguity "this" becomes necessary
    public void audit(long money){
        this.money=money;
        System.out.println("audited = "+ money);
    }

    public static void main(String[] args) {

        //here man is the real world entity
        This_Capitalist man = new This_Capitalist();// man is the reference variable to object got created.
        man.earn();
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the current level of earned money");
        long money = scan.nextLong();
        man.audit(money);
        man.earn();
    }
}
