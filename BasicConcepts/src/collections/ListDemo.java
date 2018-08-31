package collections;

import java.util.ArrayList;
import java.util.Iterator;

public class ListDemo {

    public static void main(String[] args){
        ArrayList<String> al=new ArrayList<String>();
        al.add("Ravi");
        al.add("Vijay");
        al.add("Ajay");
        ArrayList<String> al2=new ArrayList<String>();
        al2.add("Ravi");
        al2.add("Hanumat");
        al2.removeAll(al2);
        System.out.println("iterating the elements after removing the elements of al2...");
        Iterator itr=al2.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }

//        Removes from this list all of its elements that are contained in the
//     * specified collection.
    }
}
