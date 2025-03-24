package designpatterns.creational.builder;

public class Burger2 {
    private String bread;
    private String meat;
    private String cheese;
    private boolean lettuce;
    private boolean tomato;
    private boolean onion;
    private String sauce;


    // Bax burda deyirik ki Burger2 obyektin yaradilmasi bir-basa BurgerBuilder vasitesi ile olacaqki
    //Men onun obyektin yaradan zaman Builder Patternden istifade ede bilim
    // +Burger2 oz konstruktorun yazsaq gerek her defe yene elave constructor yaza budaki builder pattern
    // prinsipin pozacaq
    public Burger2(BurgerBuilder builder) {
        this.bread = builder.getBread();
        this.meat = builder.getMeat();
        this.cheese = builder.getCheese();
        this.lettuce = builder.isLettuce();
        this.tomato = builder.isTomato();
        this.onion = builder.isOnion();
        this.sauce = builder.getSauce();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Burger{");

        if (bread != null) sb.append("bread='").append(bread).append("', ");
        if (meat != null) sb.append("meat='").append(meat).append("', ");
        if (cheese != null) sb.append("cheese='").append(cheese).append("', ");
        if (lettuce) sb.append("lettuce=true, ");
        if (tomato) sb.append("tomato=true, ");
        if (onion) sb.append("onion=true, ");
        if (sauce != null) sb.append("sauce='").append(sauce).append("', ");


        if (sb.lastIndexOf(", ") == sb.length() - 2)
            sb.delete(sb.length() - 2, sb.length());

        sb.append("}");
        return sb.toString();
    }

}
