package designpatterns.creational.prototype;

public class MainWithoutPrototype {
    public static void main(String[] args) {
        LicenseFormWithoutPrototype form1 = new LicenseFormWithoutPrototype("Ali", "Toyota", "90-AA-123");
        LicenseFormWithoutPrototype form2 = new LicenseFormWithoutPrototype("Veli", "Hyundai", "10-BB-456");

        // Bütün parametrləri dəfələrlə set etmək lazım gələ bilər.
        System.out.println(form1);
        System.out.println(form2);

    }
}