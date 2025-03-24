package designpatterns.creational.singleton;

public class MainWithPattern {
    public static void main(String[] args) {
        Logger1 logger1 = Logger1.getInstance();
        //logger1.log("Hello World");

        Logger1 logger2 = Logger1.getInstance();
        //logger2.log("Hello World");

        System.out.println(logger1.hashCode());
        System.out.println(logger2.hashCode());

        System.out.println(logger1==logger2);


    }
}
