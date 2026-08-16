
class Calculator {
    String msg = "Calculator Activated -";

    // constructor
    Calculator(){
        System.out.println(msg);
    }

    // method
    public int add(int n1, int n2) {
        return n1+n2;
    }
}

public class Basics {
    public static void main(String[] args) {
        int n1 = 10;
        int n2 = 20;

        // reference variable <- object
        Calculator calc = new Calculator();

        int result = calc.add(n1, n2);
        System.out.println("Result: " + result);
    }
}
