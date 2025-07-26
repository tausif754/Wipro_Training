import java.util.ArrayList;

public class ArrayListNumber {
    public static void main(String[]args){
        ArrayList<Integer> number=new ArrayList<Integer>();
        number.add(10);
        number.add(20);
        number.add(30);
    
        System.out.println("ArrayList of Numbers: " + number);
        number.remove(0); // Removing the first element
        System.out.println("ArrayList after removal: " + number);
    }

    
}
