package designpatterns.creational.factory;

public class CarFactory {

    public static Car1 getCar(String carType) {
        if (carType == null) {
            return null;
        }
        if (carType.equalsIgnoreCase("SEDAN1")) {
            return new Sedan1();
        } else if (carType.equalsIgnoreCase("SUV1")) {
            return new SUV1();
        }
        return null;
    }
}
