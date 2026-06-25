package Exercise4.answer_key;

public class Main {
    private static int num = 2;
    public static void main(String[] args) {

        addOneToNum();
        System.out.println(num);

        int numSquared = getNumSquared();

        System.out.println("number squared: " + numSquared);

        System.out.println(getString());

        System.out.println("My grade is: " + myGrade());

        System.out.println(returnInverseValue(false));

        double x = 52.5235;
        System.out.println(num + " divided by (2 times " + x +") = " + getNumDividedBy2Custom(x));
    }

    private static void addOneToNum() {
        num = num + 1;
    }

    private static int getNumSquared(){
        return num * num;
    }

    private static String getString(){
        return "Hello World";
    }

    private static char myGrade(){
        return 'A';
    }

    private static boolean returnInverseValue(boolean value) {
        return !value;
    }
    
    private static double getNumDividedBy2Custom(double x) {
        return num / (2 * x);
    }
}

