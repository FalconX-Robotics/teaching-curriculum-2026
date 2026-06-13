package Exercise3.answer_key;

public class Main {
    public static void main(String[] args) {
        double x = 59324.4;
        double y = 38295.78;
        
        double sum = add(x, y);
        double diffrence = subtract(x, y);
        double product = multiply(x, y);
        double quotient = divide(x, y);

        System.out.println(sum);
        System.out.println(diffrence);
        System.out.println(product);
        System.out.println(quotient);
       
    }

    public static double add(double x, double y) {
        return x + y;
    }
    
    public static double subtract(double x, double y) {
        return x - y;
    }
    public static double multiply(double x, double y){
        return x * y;
    }
    
    public static double divide(double x, double y){
        return x/y;
    }
}
