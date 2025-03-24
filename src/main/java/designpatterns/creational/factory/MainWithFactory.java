package designpatterns.creational.factory;

public class MainWithFactory {

    public static void main(String[] args) {
        Car1 car1 = CarFactory.getCar("SUV1");
        car1.drive();

        Car1 car2 = CarFactory.getCar("SEDAN1");
        car2.drive();

        Car1 car3 = CarFactory.getCar("SUV1");
        car3.drive();
    }
}
