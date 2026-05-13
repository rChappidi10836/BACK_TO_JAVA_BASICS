package OOPS;

public class Account_Encapsule {

    // will be hidden by classes which interit it ans it is data sensitive one and shouldn't be disclosed to many
    //private members accessible ONLY inside same class
    private double current_level_amount;

    public void deposit(double new_amount){
        if(new_amount>0)
            current_level_amount+=new_amount;
    }

    public static void main(String[] args) {
        Account_Encapsule myacc = new Account_Encapsule();

        System.out.println(myacc.current_level_amount);

    }


}
