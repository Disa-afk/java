package task02;

public abstract class PizzaDecorator implements Pizza {

    private final Pizza decoratedPizza;

    protected PizzaDecorator(Pizza decoratedPizza) {
        this.decoratedPizza = decoratedPizza;
    }

    @Override
    public double getCost() {
        return decoratedPizza.getCost();
    }

    @Override
    public String getIngredients() {
        return decoratedPizza.getIngredients();
    }
}
