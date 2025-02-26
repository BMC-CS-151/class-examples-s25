import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Iterators {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(); //note the ADT
        list.add("Apple");
        list.add("Banana");
        list.add("Orange");

        System.out.println(list); 

        for (int i=0; i<10000; i++) {
            if (i == 100) {
                list.add("kiwi");
            } else {
                list.add("fruit " + i);
            }
        }
        

        //TODO: rewrite with iterators
        //step 1: create an iterator
        Iterator<String> itr = list.iterator();
        Iterator<String> itr2 = list.iterator();

        //step 2: loop 

        //loop until we find "kiwi"
        //for (int i=0; i<list.size(); i++) {
        while (itr.hasNext()) {
            String curFruit = itr.next();
            if (curFruit.equals("kiwi")) {
                System.out.println("found kiwi");
                //list.set(i, "kiwifruit");
            }
        }

        itr.hasNext(); // FALSE
        itr2.hasNext(); // TRUE 

        System.out.println(list); 
        
    }
}

