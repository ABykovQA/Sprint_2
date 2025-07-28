package model;

public abstract class Food {
    protected int amount;
    protected double price;
    protected boolean isVegetarian;

    public Food(int amount, double price) {
        this.amount = amount;
        this.price = price;
    }

    public abstract double getTotalPrice();

    public boolean isVegetarian() {
        return isVegetarian;
    }

}
