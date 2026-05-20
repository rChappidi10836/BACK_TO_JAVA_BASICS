package OOPS;

public class Account_Encapsule {

    // will be hidden by classes which interit it ans it is data sensitive one and shouldn't be disclosed to many
    //private members accessible ONLY inside same class
    private double current_level_amount;
    long phone_number;

    public void deposit(double new_amount){
        if(new_amount>0)
            current_level_amount+=new_amount;
    }
    public double get_Current_level_amount(){
        return current_level_amount;
    }

//    public static void main(String[] args) {
//        Account_Encapsule myacc = new Account_Encapsule();
//        myacc.phone_number= 9876543210L;
//        System.out.println(myacc.current_level_amount);
//
//    }
    /** intially I was trying to runn the 2 mains at the same time
     * and was wondering why the below main was not working
     * cuz I forgot this main is there and
     * for a file only one main is allowed
     */


}

class Admin extends Account_Encapsule{
    public String whoamI(){
        return "I am admin";
    }
    public static void main(String[] args) {

        Account_Encapsule myacc = new Account_Encapsule();
        myacc.phone_number= 9876543210L;
        System.out.println("private current level access through method " + myacc.get_Current_level_amount());


        Admin p1 = new Admin();
        System.out.println("Here p1 number" + p1.phone_number);
        //System.out.println(p1.current_level_amount);//will receive an error of java: current_level_amount has private access in OOPS.Account_Encapsule

        Account_Encapsule p2 = new Admin();
        //System.out.println(p2.whoamI);
        /** java: cannot find symbol
         symbol:   variable whoamI
         location: variable p2 of type OOPS.Account_Encapsule**/
        p2.phone_number=9876543120L;
        System.out.println("Here p2 number" + (p2.phone_number));

    }
}
