package com.driver;

public class DeluxePizza extends Pizza {
//    int cheeseCount = 0;
    public DeluxePizza(Boolean isVeg) {
        super(isVeg);
        // your code goes here
        super.addExtraCheese();
        super.addExtraToppings();
    }

    public void addExtraCheese(){

    }

    public void addExtraToppings(){

    }
}
