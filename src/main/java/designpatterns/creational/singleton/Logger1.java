package designpatterns.creational.singleton;

public class Logger1 {

    //Yaradılmış yeganə Logger obyektini yadda saxlamaq və hamıya onu vermək.
    //Niye static cunki obyektin yaratmiriq
    private static Logger1 instance;

    private Logger1() {
        System.out.println("Logger yaradıldı");
    }

    public static Logger1 getInstance() {
        if (instance == null) {
            instance = new Logger1();
        }
        return instance;
    }

    public void log(String message) {
        System.out.println("[LOG] " + message);
    }
}
