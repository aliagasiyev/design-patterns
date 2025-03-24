package designpatterns.creational.singleton;

public class MainWithOutPattern {
    public static void main(String[] args) {
        Logger logger1 = new Logger();
        logger1.log("Sistem başladı");

        Logger logger2 = new Logger();
        logger2.log("İstifadəçi daxil oldu");

        Logger logger3 = new Logger();
        logger3.log("Data yükləndi");

        System.out.println(logger1 == logger2); // false
    }
}
