package task10;

public class Pizza {
    private final PizzaType type;
    private final String dough;
    private final String sauce;
    private final String topping;

    public Pizza(PizzaType type, String dough, String sauce, String topping) {
        this.type = type;
        this.dough = dough;
        this.sauce = sauce;
        this.topping = topping;
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "type=" + type +
                ", dough='" + dough + '\'' +
                ", sauce='" + sauce + '\'' +
                ", topping='" + topping + '\'' +
                '}';
    }
}
