package model;

import model.constants.Colour;

public class Apple extends Food implements Discountable{
    String color;

    public Apple (int amount, double price, String color) {
        super(amount, price);
        this.color = color;
        this.isVegetarian = true;
    }

    @Override
    public double getDiscount() {
        if (this.color == Colour.RED_APPLE) {
            return 60;
        }
        return 0;
    }

    @Override
    public double getTotalPrice() {
        return amount * price;
    }
}
