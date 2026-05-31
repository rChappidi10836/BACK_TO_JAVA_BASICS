package Collections;

import java.util.LinkedList;
import java.util.List;

public class Only_Linked {

    public static void main(String[] args) {


        var okay_Let_Try_Plain_Vanilla = new  LinkedList();// this will generic type without <> and data type of the input will be stored as it is



        okay_Let_Try_Plain_Vanilla.addFirst("Hello");
        okay_Let_Try_Plain_Vanilla.add(1000);
        okay_Let_Try_Plain_Vanilla.addFirst(true);

        System.out.println(okay_Let_Try_Plain_Vanilla);
        okay_Let_Try_Plain_Vanilla.remove(1);

        var remove_Test = new LinkedList<Integer>(List.of(2,4,1,9,4,0,3,7,0));

        remove_Test.remove(0);// removes 0th indexed element
        remove_Test.remove(Integer.valueOf(0));//removes 0 from the list

        System.out.println(remove_Test);
    }

}
