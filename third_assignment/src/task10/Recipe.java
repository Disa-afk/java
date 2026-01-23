package task10;

public class Recipe {
    private final PizzaType type;
    private final String dough;
    private final String sauce;
    private final String topping;

    public Recipe(PizzaType type, String dough, String sauce, String topping) {
        this.type = type;
        this.dough = dough;
        this.sauce = sauce;
        this.topping = topping;
    }

    @Override
    public String toString() {
        return "Recipe{" +
                "type=" + type +
                ", dough='" + dough + '\'' +
                ", sauce='" + sauce + '\'' +
                ", topping='" + topping + '\'' +
                '}';
    }
}
