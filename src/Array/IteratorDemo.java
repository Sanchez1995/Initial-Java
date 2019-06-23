package Array;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class IteratorDemo {

    public static void main(String[] args) {
        Collection<String> coll = new ArrayList<>();
        coll.add("Edinburgh");
        coll.add("Glasgow");
        coll.add("Aberdeen");
        coll.add("Dundee");

        Iterator<String> it = coll.iterator();
        while (it.hasNext()) {
            System.out.print(it.next().toUpperCase() + " ");
        }
        System.out.println();

    }
}
