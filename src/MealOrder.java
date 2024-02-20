public class MealOrder {

    private Burger burger;
    private Drink drink;
    private SideItem sideItem;

    public MealOrder(){
        this(new Hamburger(), new Cola("Small"), new FrenchFries());
    }
    public MealOrder(Burger burger, Drink drink, SideItem sideItem) {
        this.burger = burger;
        this.drink = drink;
        this.sideItem = sideItem;
    }

    public void getCheck(){

       String extras =  "";

       if (Burger.getCount() > 0){
           extras = "Extras to burger: " + "\n";
       }

        String check = burger.getClass().getSimpleName() + " - $" + burger.getNetPrice() + "\n" +
                extras +
                burger.getStringBuilder() +
                drink.getClass().getSimpleName() + " - $" + drink.getPrice() + "\n" +
                sideItem.getClass().getSimpleName() + " - $" + sideItem.getPrice() + "\n" +
                "--------------" + "\n" +
                "Total price is: $" + (burger.getPrice() + drink.getPrice() + sideItem.getPrice());

        System.out.println(check);

    }


    @Override
    public String toString() {
        return "MealOrder{" +
                "burger=" + burger +
                ", drink=" + drink +
                ", sideItem=" + sideItem +
                '}';
    }
}
