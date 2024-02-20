public class SideItem {

    private String type;

    private double price;

    public SideItem(String type, double price) {
        this.type = type;
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public static SideItem sideItem(String type){
        return switch (type){
            case "French fries" -> new FrenchFries();
            case "Chicken" -> new Chicken();
            default -> new SideItem("Default", 0.0);
        };
    }

    @Override
    public String toString() {
        return "SideItem{" +
                "type='" + type + '\'' +
                ", price=" + price +
                '}';
    }
}

class FrenchFries extends SideItem{

    public FrenchFries() {
        super("French fries", 4.0);
    }
}

class Chicken extends SideItem{

    public Chicken() {
        super("Chicken",5.0);
    }
}
