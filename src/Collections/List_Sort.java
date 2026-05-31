package Collections;

import java.util.Collections;

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

    }
}
