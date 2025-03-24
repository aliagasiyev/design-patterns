package designpatterns.creational.builder;

public class BurgerAppNoPattern {
    public static void main(String[] args) {

         // Üstəlik, hər hansı yeni parametr əlavə etsək,
        // bütün konstruktorları dəyişməli oluruq.


         Burger1 burger1ForAli = new Burger1("White", "Chicken", "Cow", true, true);
        System.out.println("Burger For Ali " + burger1ForAli);


        Burger1 burger1ForSaiq = new Burger1("White", "Chicken", "Cow", true, true, true);
        System.out.println("Burger For Saiq " + burger1ForSaiq);

    }
}
