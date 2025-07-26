
import java.util.ArrayList;
public class ArrayListExample {


    public static void main(String[] args) {
        ArrayList<String> name = new ArrayList<String>();
        name.add("Tausf");
        name.add("Zeeshan");
        name.add("Ali");
        name.add("Hassan");
        name.add("Tariq");
        System.out.println(name);
        System.out.println("Size of the ArrayList: " + name.size());
        System.out.println("Is the ArrayList empty? " + name.isEmpty());
        System.out.println("Element at index 2: " + name.get(2));
        
        name.remove(3); // Removing element at index 3
        System.out.println("ArrayList after removal: " + name);
        
        name.set(1, "UpdatedName"); // Updating element at index 1
        System.out.println("ArrayList after update: " + name);
        
    }
}
