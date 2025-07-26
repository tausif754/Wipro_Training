// Create an ArrayList to store numbers (add elements of type Integer):
import java.util.ArrayList;
import java.util.Collections;

public class ArrayListNumber {
    public static void main(String[]args){
        ArrayList<Integer> number=new ArrayList<Integer>();
         ArrayList<String> names = new ArrayList<String>();
        number.add(10);
        number.add(20);
        number.add(30);
        number.add(40);
        number.add(50);
        System.out.println("ArrayList of Numbers: " + number);
        // number.remove(0); // Removing the first element
        // System.out.println("ArrayList after removal: " + number);
        // Sort an ArrayList of Strings:
       
        names.add("John");
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");
        names.add("Eve");
        System.out.println("ArrayList of Names (Before Sorting): " + names);
        Collections.sort(names); // Sorting the ArrayList
        System.out.println("ArrayList of Names (After Sorting): " + names);
        for (String name : names) {
            System.out.println(name); // Displaying each name in the sorted list
        }
        
        System.out.println("ArrayList of Names (After Sorting): " + names);
    }

    
}
