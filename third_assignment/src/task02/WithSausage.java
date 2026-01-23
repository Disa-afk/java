package task02;

public class WithSausage extends PizzaDecorator {

    public WithSausage(Pizza pizza) {
        super(pizza);
    }

    @Override
    public double getCost() {
        return super.getCost() + 25;
    }

    @Override
    public String getIngredients() {
        return super.getIngredients() + ", колбаса";
    }
}
