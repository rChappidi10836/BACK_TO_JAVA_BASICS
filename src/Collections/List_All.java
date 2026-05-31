package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class List_All {

    /**
     * add(element) / add(index/element)
     *
     * set (index/ element)
     *
     * get(index)
     *
     * remove(index)
     *
     * size() to get length
     *
     * clear() remove all elements
     *
     * sort() sorts
     */

    public void array_List(){
        /**
         * use Math random
         *
         * take 10 items and add to array list
         *
         * remove 4th item
         *
         * exchange 2 items in 2 random indexes
         *
         * /complex
         *
         * for any value which is divisible by 2, add a number beside using math.random
         *
         *
         * for any value which is divible by 5, replace it with 1
         *
         *
         * for , replace them with their sqrts
         */

        List<Double> ftl = new ArrayList<>(); //ftl -> first time list

        //adding 10 items to list
        for(int i=0;i<5;i++){
            ftl.add(Math.random()*10000);
        }

        System.out.println("List after 10 rand elements "+ ftl);

        //removing 4th items
        ftl.remove(3);

        System.out.println("List after REMOVING 3rd "+ ftl);


        //exchange 2 items in 2 random indexes
        var ind1= (int)(Math.random()*(ftl.size()));var ind2 = (int)(Math.random()*(ftl.size()));
        System.out.println(ind1+ " "+ ind2);
        var t = ftl.get(ind1);

        var t2 = ftl.get(ind2);

        ftl.set(ind2,t);
        ftl.set(ind1,t2);

        System.out.println("after swapping elements at "+t +" and "+t2+" is "+ftl);

        //for any value which is divisible by 2, add a number beside using math.random
        int i=0;
        String temp;
        char x;
        while(i< ftl.size()){
            temp=Double.toString(ftl.get(i));
            x=temp.charAt(temp.length()-1);

            if((x-'0')%2==0){
                System.out.println( ftl.get(i) + " is even");
                ftl.add(++i, Math.random());
            }
            else{
                System.out.println( ftl.get(i) + " is odd");
            }
//            if((ftl.get(i)%2)==0 && (ftl.get(i)%2)<0){
//                ftl.add(++i,Math.random());
//                System.out.println("add cheysa nayya i= "+ i);
//            }
            i++;
        }
        System.out.println("ftl after 2 divisible question = "+ftl);

        //for any value which is divisible by 5, replace it with 1
        i=0;
        while(i< ftl.size()){
            temp=Double.toString(ftl.get(i));
            x=temp.charAt(temp.length()-1);
            if((x == '0') || (x=='5')){
                ftl.set(i, 1.0);
            }
            i++;
        }
        System.out.println("ftl after replacing 5 divisible with 1.0 = "+ ftl);

        //replacing each item with its sqrt
        int k=0;
        while(k<ftl.size()){
            ftl.set(k,Math.sqrt(ftl.get(k)));
            k++;
        }
        System.out.println("replacing elements with their sqrts = "+ftl);

        //at last sorting the array list
        Collections.sort(ftl);
        System.out.println("Sorted ArrayList by Collections = "+ ftl);

        System.out.println("ftl after collections sort "+ftl);
        /**
         * Start with an empty list
         *
         * Add milk, bread, apples
         *
         * Check the third item
         *
         * Replace the third item with oranges
         *
         * Add eggs, rice
         *
         * Remove the second item
         *
         * Remove snack biscuits
         *
         * Check the number of items
         *
         * Replace rice with basmati rice
         *
         * Insert butter after milk
         *
         * Try to get an item at index 10 on a 3-item list (expect error)
         *
         * Try to remove an item from an empty list (expect error)
         */
    }

    public void linked_List(){

    }

    public static void main(String[] args) {

        List_All arr = new List_All();
        arr.array_List();


    }
}
