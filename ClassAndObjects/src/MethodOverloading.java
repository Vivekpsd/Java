class Calculator {
    public int add(int n1, int n2) {
        return n1 + n2;
    }

    public double add(double n1, double n2) {
        return n1 + n2;
    }

    public int add(int n1, int n2, int n3) {
        return n1 + n2 + n3;
    }
}

public class MethodOverloading {
    
    public static void main(String[] args) {
        System.out.println("Performing Method Overloading");

        Calculator calc = new Calculator();

        System.out.println("Add two integers: " + calc.add(1, 2));
        System.out.println("Add two doubles: " + calc.add(0.5, 1.7));
        System.out.println("Add three integers: " + calc.add(1, 2, 3));
    }
}
/*
Performing Method Overloading
Add two integers: 3
Add two doubles: 2.2
Add three integers: 6
 */