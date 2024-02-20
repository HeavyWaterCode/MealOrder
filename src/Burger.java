import java.util.Objects;

public class Burger {

    protected String type;

    private double price;

    protected double netPrice;

    protected StringBuilder stringBuilder;

    protected static int count;

    public Burger(String type, double price) {
        stringBuilder = new StringBuilder();
        this.type = type;
        this.price = price;
    }

    public void addExtras(Extras extras){
        count++;

        if (count > 3){
            System.out.println("Please stop, your burger is too big");
            return;
        }

        if (Objects.equals(extras.getType(), "Cheese")){
            price += extras.getPrice();

        }

        if (Objects.equals(extras.getType(), "Cutlet")){
            price += extras.getPrice();
        }

        appendExtras(extras);

    }

    protected StringBuilder appendExtras(Extras extras){
        stringBuilder.append("-").append(extras.getType()).append(" ");
        stringBuilder.append("$").append(extras.getPrice()).append("\n");
        return stringBuilder;
    }

    public double getPrice() {
        return price;
    }

    public double getNetPrice(){
        return 0;
    }

    public StringBuilder getStringBuilder() {
        return stringBuilder;
    }

    public static int getCount() {
        return count;
    }

    public static Burger burger(String type){
        return switch (type){
            case "Hamburger" -> new Hamburger();
            case "Cheeseburger" -> new Cheeseburger();
            case "DeluxeBurger" -> new DeluxeBurger();
            default -> new Burger("Default", 0.0);
        };
    }

    @Override
    public String toString() {
        return "Burger{" +
                "type='" + type + '\'' +
                ", price=" + price +
                '}';
    }
}

class Hamburger extends Burger{


    public Hamburger() {
        super("Hamburger", 2.0);
    }

    @Override
    public double getNetPrice(){
        return super.netPrice = 2.0;
    }
}

class Cheeseburger extends Burger{

    public Cheeseburger() {
        super("Cheeseburger", 3.0);
    }
   @Override
    public double getNetPrice(){
       return super.netPrice = 3.0;
    }

}

class DeluxeBurger extends Burger{

    public DeluxeBurger() {
        super("DeluxeBurger", 10.0);
    }

    @Override
    public double getNetPrice() {
        return super.netPrice = 10.0;
    }

    @Override
    protected StringBuilder appendExtras(Extras extras) {
        stringBuilder.append("-").append(extras.getType()).append("\n");
        return stringBuilder;
    }

    @Override
    public void addExtras(Extras extras) {
        count++;

        if (count > 5){
            System.out.println("Please stop, your burger is too big");
            return;
        }
        appendExtras(extras);
    }
}