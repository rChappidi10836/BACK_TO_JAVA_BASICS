import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;

class game_start<T,K> {


    public void letsseewhatitreturns(T engo){
        System.out.println("One parameter is "+engo);
    }
    public T letsseewhatitreturns(T engo, K thisko) {
        System.out.println("2 parameters is "+engo+" "+thisko);
        return engo;
    }


}

class other{

    public <T> void trial_only_method(T hero){
        System.out.println(hero);
    }
}

public class Generics{

    private static <T> void hemp(T trial){
        System.out.println("passing to static method");
    }


    public static void print_List_Objets(List<Objects> plist){
        System.out.println(plist);
    }

    public static void print_List_wildcards(List<?> plist){
        System.out.println("\n\n"+plist+"\n\n");
    }



    public static void main(String[] args) {
        game_start<Integer, String> o = new game_start<>();//actully to do is game_start o = new game_start();



        System.out.println("Passing string to the generic class method");
        o.letsseewhatitreturns(55); // but this will not be error then  o.letsseewhatitreturns("Hello");

        System.out.println("\n\nNOW INTERGER");
        o.letsseewhatitreturns(23);


        System.out.println("\n\nWith 2 types of parameters");
        o.letsseewhatitreturns(69,"odhu");


        System.out.println("\n\nWith 2 types of parameters");
        o.letsseewhatitreturns(69,"hello"); // even we can do this  o.letsseewhatitreturns(69,96);

        /**
         *WILDCARDS
         *
         * in such following scenarios wildcars will be useful for us
        System.out.println("Integer can be sub class of object but List of integers is not subclass list of objects");
         */

        System.out.println("================WILD-CARDS========================");

        List<Integer> intList = new ArrayList<>();
        intList.add(25);
        /**
         * print_List_Objets(intList);
         *
         * will be getting following error
         *
         * Required type:
         * List
         * <Objects>
         * Provided:
         * List
         * <Integer>
         *
         *     but if use wildcarded method
         */
        print_List_wildcards(intList);



        //wildCards
        List<?> wildCard;
        wildCard= new ArrayList<String>();

        wildCard = new LinkedList<>();

        System.out.println(wildCard);


        //purely method generics
        new other().trial_only_method("mazza ajaeyga");

        //String s = new String(); used to see String class

    }

}