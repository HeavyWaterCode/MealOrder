public class Main {
    public static void main(String[] args) {

        Burger burger = Burger.burger("Hamburger");
        burger.addExtras(Extras.extras("Cheese"));
        burger.addExtras(Extras.extras("Cutlet"));
        burger.addExtras(Extras.extras("Cheese"));

        Drink drink = Drink.drink("Cola", "Small");

        SideItem sideItem = SideItem.sideItem("French fries");

        MealOrder mealOrder = new MealOrder(burger, drink, sideItem);

        mealOrder.getCheck();

    }
}
