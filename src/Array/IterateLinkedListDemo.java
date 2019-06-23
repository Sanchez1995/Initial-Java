package Array;

import java.util.Iterator;
import java.util.LinkedList;

public class IterateLinkedListDemo {

    public static void main(String[] args) {
        LinkedList<String> humanSpecies = new LinkedList<>();

        humanSpecies.add("Homo Sapiens");
        humanSpecies.add("Homo Neanderthal");
        humanSpecies.add("Homo Erectus");
        humanSpecies.add("Homo Habilis");


        System.out.println("=== iterate over a linked using Java 8  forEach and lambda ");
        humanSpecies.forEach(name-> System.out.println(name));


        System.out.println("\n=== iterate over linkedlist using descendingiterator");
        Iterator<String> descendinghumanit = humanSpecies.descendingIterator();
        while (descendinghumanit.hasNext()){
            String speciesName = descendinghumanit.next();
            System.out.println(speciesName);
        }

        System.out.println("\n=== iterate over a linkedlist using simple foreach loop ===");

       /* for (var speciesName:humanSpecies){*/
           /* System.out.println(speciesName);*/
        }

    }
