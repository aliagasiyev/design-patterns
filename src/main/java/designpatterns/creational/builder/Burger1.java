package designpatterns.creational.builder;

public class Burger1 {
    private String bread;
    private String meat;
    private String cheese;
    private boolean lettuce;
    private boolean tomato;
    private boolean onion;
    private String sauce;

    public Burger1(String bread, String meat, String cheese, boolean lettuce, boolean tomato, boolean onion, String sauce) {
        this.bread = bread;
        this.meat = meat;
        this.cheese = cheese;
        this.lettuce = lettuce;
        this.tomato = tomato;
        this.onion = onion;
        this.sauce = sauce;
    }

    public Burger1(String white, String chicken, String cow, boolean lettuce, boolean tomato) {
        this.bread = white;
        this.meat = chicken;
        this.cheese = cow;
        this.lettuce = lettuce;
        this.tomato = tomato;
    }

    public Burger1(String white, String chicken, String cow, boolean b, boolean b1, boolean b2) {
        this.bread = white;
        this.meat = chicken;
        this.cheese = cow;
        this.lettuce = b1;
        this.tomato = b2;

    }
    @Override
    public String toString() {
        return "{" +
                "bread='" + bread + '\'' +
                ", meat='" + meat + '\'' +
                ", cheese='" + cheese + '\'' +
                ", lettuce=" + lettuce +
                ", tomato=" + tomato +
                ", onion=" + onion +
                ", sauce='" + sauce + '\'' +
                '}';
    }
}
