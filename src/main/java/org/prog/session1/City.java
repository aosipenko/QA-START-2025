import org.prog.session1.Actor;
import org.prog.session1.Car;

public class City {

    public static void main(String[] args) {
        Actor leadActor = new Actor();
        Actor supportActor = new Actor();

        leadActor.name = "Michael Brown";
        supportActor.name = "Jane Brown";

        leadActor.say("Hello, my name is Michael Brown");
        supportActor.say("Hello, my name is Jane Brown");

        leadActor.say("This is my first concert");
        supportActor.say("This is my second concert");

        leadActor.walkTo("edge of scene");
        supportActor.walkTo("edge of scene");

        Car car = new Car();
        car.color = "red";
        car.goTo("Kyiv");
        car.color = "blue";
        car.goTo("Odessa");
    }
}
