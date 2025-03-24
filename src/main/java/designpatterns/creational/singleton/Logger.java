package designpatterns.creational.singleton;

public class Logger {

    public Logger() {
        System.out.println("Logger obyekti yaradıldı");
    }

    public void log(String message) {
        System.out.println("[LOG] " + message);
    }
}
