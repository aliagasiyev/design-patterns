package designpatterns.creational.builder;

public class BurgerBuilder {
    private String bread;
    private String meat;
    private String cheese;
    private boolean lettuce;
    private boolean tomato;
    private boolean onion;
    private String sauce;

    public BurgerBuilder setBread(String bread) {
        this.bread = bread;
        return this;
    }

    public BurgerBuilder setMeat(String meat) {
        this.meat = meat;
        return this;
    }

    public BurgerBuilder setCheese(String cheese) {
        this.cheese = cheese;
        return this;
    }

    public BurgerBuilder setLettuce(boolean lettuce) {
        this.lettuce = lettuce;
        return this;
    }

    public BurgerBuilder setTomato(boolean tomato) {
        this.tomato = tomato;
        return this;
    }

    public BurgerBuilder setOnion(boolean onion) {
        this.onion = onion;
        return this;
    }

    public BurgerBuilder setSauce(String sauce) {
        this.sauce = sauce;
        return this;
    }

    public Burger2 build() {
        return new Burger2(this);
    }

    // Getter methods
    public String getBread() { return bread; }
    public String getMeat() { return meat; }
    public String getCheese() { return cheese; }
    public boolean isLettuce() { return lettuce; }
    public boolean isTomato() { return tomato; }
    public boolean isOnion() { return onion; }
    public String getSauce() { return sauce; }
}
