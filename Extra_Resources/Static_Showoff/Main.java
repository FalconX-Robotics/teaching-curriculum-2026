
public class Main {
    //NOTE: To run this code, run exactly the following in the terminal: (after you made sure you are in "Static_Showoff" "folder" or directory in terminal)
    // "javac Main.java Subset.java"
    // "java Main"
    public static void main(String[] args) {
        //creating instances and assigning them to variables
        Subset instance = new Subset();
        Subset instance2 = new Subset();
        Subset instance3 = new Subset();
        //instance variable 'y' - reference via variable holding instance
        instance.y = 5;
        //static variable 'x' - reference via class name
        Subset.x = 88;

        System.out.println(Subset.x);
        System.out.println(instance.y);
        System.out.println(instance2.y);
    }
}
