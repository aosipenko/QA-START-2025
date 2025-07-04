package org.prog.session1;

public class CarTest {
    public static void main(String[] args) {
        Car car1 = new Car();
        car1.color = "Black";
        car1.model = "Bugatti";

        Car car2 = new Car();
        car2.color = "Blue";
        car2.model = "Tesla";

        car1.goTo();
        System.out.println(car1);
        System.out.println("car1 equals car2? " + car1.equals(car2));

        System.out.println("car1 hashCode: " + car1.hashCode());
        System.out.println("car2 hashCode: " + car2.hashCode());
    }
}
