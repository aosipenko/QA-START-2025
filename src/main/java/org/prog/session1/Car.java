package org.prog.session1;

//TODO: HW4: add String model and make equals & hashCode work by model and color
public class Car {

    public String color;

    public void goTo(String destination) {
        System.out.println(color + " car goes to + destination");
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Car) {
            Car car = (Car) obj;
            return this.color.equals(car.color);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return color.hashCode();
    }

    @Override
    public String toString() {
        return "Car : " + color;
    }

    public String getColor() {
        return color;
    }
}