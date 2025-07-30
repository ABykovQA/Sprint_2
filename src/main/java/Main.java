import model.Apple;
import model.Food;
import model.Meat;
import model.constants.Colour;
import service.ShoppingCart;

public class Main {
    public static void main(String[] args) {
        Food meat = new Meat(5, 100);
        Food redApple = new Apple(10, 50, Colour.RED_APPLE);
        Food greenApple = new Apple(8, 60, Colour.GREEN_APPLE);


        Food[] basket = {meat, redApple, greenApple};
        ShoppingCart cart = new ShoppingCart(basket);

        System.out.println("Общая сумма: " + cart.getTotalPrice());
        System.out.println("Общая сумма с учетом скидки: " + cart.getTotalPriceWithDiscount());
        System.out.println("Сумма вегетарианских продуктов без скидки: " + cart.getTotalVeget());
    }
}
