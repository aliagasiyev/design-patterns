package designpatterns.creational.builder;

public class BurgerAppWithPattern {
    public static void main(String[] args) {

        Burger2 burgerForAli = new BurgerBuilder()
                .setBread("Sesame")
                .setMeat("Beef")
                .setCheese("Cheddar")
                .setLettuce(true)
                .setTomato(true)
                .setSauce("Ketchup")
                .build();
        System.out.println(burgerForAli);


        Burger2 burgerForSaiq = new BurgerBuilder()
                .setBread("Təndir Çorək")
                .setCheese("Saiq Pendirsiz Burger Yemek")
                .setTomato(true).build();
        System.out.println(burgerForSaiq);


        Burger2 burgerForResul = new BurgerBuilder()
                .setMeat("Qoyun Eti")
                .setCheese("Pednir")
                .setTomato(true).build();
        System.out.println(burgerForResul);
    }
}
