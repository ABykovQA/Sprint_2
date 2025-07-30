package model;

import model.constants.Colour;
import model.constants.Discount;

public class Apple extends Food {
    String color;

    public Apple (int amount, double price, String color) {
        super(amount, price);
        this.color = color;
        this.isVegetarian = true;
    }

    @Override
    public double getDiscount() {
        if (this.color.equals(Colour.RED_APPLE)) {
            return Discount.DISCOUNT;
        }
        return 0;
    }

    @Override
    public double getTotalPrice() {
        return amount * price;
    }
}
