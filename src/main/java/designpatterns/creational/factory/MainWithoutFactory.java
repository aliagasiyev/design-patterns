package designpatterns.creational.factory;

public class MainWithoutFactory {
    public static void main(String[] args) {
        // SUV lazımdırsa:
        Car car1 = new SUV();
        Car car2 = new SUV();
        Car car3 = new SUV();
        Car car4 = new SUV();
        Car car5 = new SUV();
        Car car6 = new SUV();
        Car car7 = new SUV();

        car1.drive();

        Car car8 = new Sedan();
        car8.drive();

    }
}
