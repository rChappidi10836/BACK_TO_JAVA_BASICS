package Collections;

import java.util.*;

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

        Iterator<String> it = cars.iterator();
        System.out.println("ITERATOR");
        while(it.hasNext()){
            System.out.println(it.next());
        }


        Spliterator<String> sit2 = cars.spliterator();
        System.out.println("SPLITERATOR");
        while(sit2.tryAdvance((n) -> System.out.println(n)));
        /**
         * The syntax while( it1.tryAdvance( (n) -> { System.out.println(n); } ) ); is equivalent to:
         *
         * boolean x = it1.tryAdvance( (n) -> { System.out.println(n); });
         * while(x) {
         *   x = it1.tryAdvance( (n) -> { System.out.println(n); });
         * }
         */


        System.out.println("TESTING");

        boolean x = sit2.tryAdvance( (n) -> { System.out.println(n); });
        while(x) {x = sit2.tryAdvance( (n) -> { System.out.println(n); });

        }

        System.out.println("cars = "+cars);

        System.out.println("cars in string "+ cars.toString());


        /**
         * what is the use of the spliterator when we have iterator?
         * in first place we do we even need these both as ultimatly we are using loop for them to print or access right?
         *
         * This is a great question because it gets to the purpose of abstraction in Java.
         *
         * At first glance, it seems like:
         *
         * "Why not just use a for loop? Why do we need Iterator and Spliterator?"
         *
         * The answer is that loops don't know how to traverse every kind of collection.
         *
         * 1. Without Iterator
         *
         * Suppose Java only had arrays.
         *
         * int[] arr = {10, 20, 30};
         *
         * for (int i = 0; i < arr.length; i++) {
         *     System.out.println(arr[i]);
         * }
         *
         * This works because arrays support indexing.
         *
         * Now imagine a LinkedList.
         *
         * 10 -> 20 -> 30 -> 40
         *
         * Can you write
         *
         * list[2]
         *
         * No.
         *
         * A linked list doesn't support indexing efficiently.
         *
         * So every collection would require a different loop.
         *
         * 2. Iterator gives a common way
         *
         * Every collection says:
         *
         * "I'll provide an iterator."
         *
         * Then your code becomes
         *
         * Iterator<Integer> it = collection.iterator();
         *
         * while (it.hasNext()) {
         *     System.out.println(it.next());
         * }
         *
         * Notice something important.
         *
         * Your code doesn't care whether collection is
         *
         * ArrayList
         * LinkedList
         * HashSet
         * TreeSet
         *
         * The iterator hides all those implementation details.
         *
         * 3. Enhanced for-loop uses Iterator!
         *
         * When you write
         *
         * for (Integer n : list) {
         *     System.out.println(n);
         * }
         *
         * Java secretly converts it to something like
         *
         * Iterator<Integer> it = list.iterator();
         *
         * while (it.hasNext()) {
         *     Integer n = it.next();
         *     System.out.println(n);
         * }
         *
         * So you're already using Iterator every day.
         *
         * 4. Then why Spliterator?
         *
         * When Java 8 introduced Streams, they wanted to support parallel processing.
         *
         * Imagine a list of one million numbers.
         *
         * With an iterator:
         *
         * 1 2 3 4 5 6 7 8 ...
         * ^
         *
         * There is only one cursor.
         *
         * One thread must process
         *
         * 1
         * 2
         * 3
         * 4
         * 5
         * ...
         *
         * Sequentially.
         *
         * A Spliterator can split itself.
         *
         * Original
         *
         * 1 2 3 4 5 6 7 8
         *
         * ↓
         *
         * Left:  1 2 3 4
         * Right: 5 6 7 8
         *
         * Now
         *
         * Thread 1 processes
         * 1 2 3 4
         * Thread 2 processes
         * 5 6 7 8
         *
         * This is why it's called a Spliterator (Split + Iterator).
         *
         * Its key method is
         *
         * trySplit()
         *
         * which returns another spliterator over part of the data.
         *
         * 5. Streams use Spliterator
         *
         * When you write
         *
         * list.parallelStream()
         *     .map(x -> x * 2)
         *     .forEach(System.out::println);
         *
         * Internally Java roughly does
         *
         * Collection
         *       ↓
         *  Spliterator
         *       ↓
         * Split
         *  ↓      ↓
         * Thread1 Thread2
         *  ↓      ↓
         * Combine results
         *
         * An ordinary Iterator cannot do this because it only moves forward one element at a time.
         *
         * 6. Why not just use loops?
         *
         * Because loops only describe what your code does, not how the collection is traversed.
         *
         * For example,
         *
         * for (Employee e : employees)
         *
         * works whether employees is
         *
         * ArrayList
         * LinkedList
         * HashSet
         * TreeSet
         *
         * without changing your code.
         *
         * The collection decides how traversal happens.
         *
         * Summary
         * Feature	                Iterator	Spliterator
         * Sequential traversal	        ✅	      ✅
         * Parallel traversal	        ❌	      ✅
         * Can split work	            ❌	      ✅ (trySplit())
         * Used by enhanced for loop	✅	      ❌
         * Used by Streams	          Rarely	  ✅
         *
         * So you can think of them like this:
         *
         * Iterator = "Give me the next element."
         * Spliterator = "Give me the next element, and if needed, split yourself so multiple threads can process different parts simultaneously."
         *
         * That's the main reason Spliterator was introduced in Java 8 alongside the Streams API.
         */

    }
}
