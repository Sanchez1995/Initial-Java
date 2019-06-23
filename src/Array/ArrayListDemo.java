package Array;

import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<String> coll1 = new ArrayList<>();
        coll1.add("London");
        coll1.add("Birmingham");
        coll1.add("Leeds");
        coll1.add("Reading");
        coll1.add("Newcastle");
        coll1.add("London");
        System.out.println("A list of cities in coll1: ");
        System.out.println(coll1);
        System.out.println("\nIs Leeds in coll1? " + coll1.contains("Leeds"));
        coll1.remove("Leeds");
        System.out.println("\n" + coll1.size() + " cities are in coll1 now.");

        ArrayList<String> coll2 = new ArrayList<>();
        coll2.add("Berlin");
        coll2.add("Dresden");
        coll2.add("Leipzig");
        coll2.add("Bremen");
        System.out.println("\nA list of cities in coll2");
        System.out.println(coll2);

        ArrayList<String> c1 = (ArrayList<String>)(coll1.clone());
        c1.addAll(coll2);
        System.out.println("\nCities in coll1 or coll2: ");
        System.out.println(c1);

    }
}
