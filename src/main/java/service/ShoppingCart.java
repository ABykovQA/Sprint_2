package service;

import model.Discountable;
import model.Food;

public class ShoppingCart {
    private Food[] items;

    public ShoppingCart(Food[] items) {
        this.items = items;
    }

    public double getTotalPrice() {
        double total = 0;
        for (Food item : items) {
            total += item.getTotalPrice();
        }
        return total;
    }

    public double getTotalPriceWithDiscount() {
        double total = 0;
        for (Food item : items) {
            total += item.getTotalPrice();
            if (item.isVegetarian()) {
                double discount = item.getDiscount();
                total -= item.getTotalPrice() * (discount / 100);
            }
        }
        return total;
    }

    public double getTotalVeget() {
        double total = 0;
        for (Food item : items) {
            if (item.isVegetarian()) {
                total += item.getTotalPrice();
            }
        }
        return total;
    }
}
