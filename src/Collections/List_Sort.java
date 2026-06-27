package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class List_Sort {

    public static void main(String[] args) {

        List_All la= new List_All();
        var for_Sort_List = la.generate_Random_Words_List();
        System.out.println(for_Sort_List);

        Collections.shuffle(for_Sort_List);
        System.out.println(for_Sort_List);

        Collections.sort(for_Sort_List);
        System.out.println(for_Sort_List);

        Collections.sort(for_Sort_List,Collections.reverseOrder());
        System.out.println(for_Sort_List);


        List<String> cars = new ArrayList<>(List.of("hello","cab","BYD","BMW","MG","GM"));
        System.out.println(cars.get(1));
        cars.set(1,"car");
        System.out.println(cars);


    }
}
