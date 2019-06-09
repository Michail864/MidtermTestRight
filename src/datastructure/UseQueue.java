package datastructure;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class UseQueue {

    public static void main(String[] args) {
        /*
         * Demonstrate how to use Queue that includes add,peek,remove,pool elements.
         * Use For Each loop and while loop with Iterator to retrieve data.
         *
         */

        Queue<Integer> Q = new LinkedList<Integer>();
        Q.add(348);
        Q.add(358);
        Q.add(379);
        Q.add(455);
        Q.remove(455);

        System.out.println(Q);

        System.out.println(Q.peek());

        for (Integer item: Q){
            System.out.println(item);
        }

        Iterator<Integer> itr = Q.iterator();

        while (itr.hasNext()){
            System.out.println(itr.next());
        }

    }

}
