
interface InterfaceExample {
    void display();
    void config(); // Adding a method to the interface
}

class InterfaceDemoImpl implements InterfaceExample {
    public void display() {
        System.out.println("Display method implementation");
    }
    public void config() {
        System.out.println("Config method implementation");
    }
}

public class InterfaceDemo {
    public static void main(String[] args) {
        // System.out.println("Interface Demo Running");
        InterfaceExample obj = new InterfaceDemoImpl();// Creating an instance of the implementing class
        InterfaceDemoImpl imp = new InterfaceDemoImpl(); // Creating an instance of the implementing class
        // obj.display();
        imp.display(); // Calling the display method
        imp.config(); // Calling the config method
    }
}