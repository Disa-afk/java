package task10;

import task10.builders.PizzaBuilder;
import task10.builders.PizzaRecipeBuilder;
import task10.director.Director;

public class Solution {
    public static void main(String[] args) {
        Director director = new Director();

        PizzaBuilder pizzaBuilder = new PizzaBuilder();
        director.makeHawaiianPizza(pizzaBuilder);
        Pizza pizza = pizzaBuilder.getResult();
        System.out.println(pizza);

        PizzaRecipeBuilder recipeBuilder = new PizzaRecipeBuilder();
        director.makeSpicyPizza(recipeBuilder);
        Recipe recipe = recipeBuilder.getResult();
        System.out.println(recipe);
    }
}
