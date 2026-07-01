class game_start<T,K> {


    public void letsseewhatitreturns(T engo){
        System.out.println("One parameter is "+engo);
    }
    public T letsseewhatitreturns(T engo, K thisko) {
        System.out.println("2 parameters is "+engo+" "+thisko);
        return engo;
    }


}

public class Generics{

    public static void main(String[] args) {
        game_start o = new game_start();

        System.out.println("Passing string to the generic class method");
        o.letsseewhatitreturns("Hello");

        System.out.println("\n\nNOW INTERGER");
        o.letsseewhatitreturns(23);


        System.out.println("\n\nWith 2 types of parameters");
        o.letsseewhatitreturns(69,"odhu");


        System.out.println("\n\nWith 2 types of parameters");
        o.letsseewhatitreturns(69,96);
    }

}