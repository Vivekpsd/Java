class Car {
    String color;      // fields -> stored on HEAP (inside object)
    int speed;

    void drive() {
        System.out.println(color + " " + speed);
    }

    void increaseSpeed() {          // overload 1: no args
        speed += 10;
    }

    void increaseSpeed(int by) {    // overload 2: different param list
        speed += by;
    }
}

public class StackHeap {
    public static void main(String[] args) {
        // car1, car2 -> references on STACK
        // new Car()  -> actual object on HEAP
        Car car1 = new Car();
        Car car2 = new Car();

        car1.speed = 100;
        car2.speed = 150;

        car1.increaseSpeed();     // -> 110
        car2.increaseSpeed(50);   // -> 200
        // separate heap objects -> independent, no effect on each other

        Car car3 = car1;          // NO new object, just copies car1's address
        car3.speed = 999;

        System.out.println(car1.speed); // 999 (same object as car3)
        System.out.println(car2.speed); // 200 (untouched, different object)
    }
}