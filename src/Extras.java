public class Extras {

    private String type;
    private double price;

    public Extras(String type, double price) {
        this.type = type;
        this.price = price;
    }

    public String getType() {
        return type;
    }

    public double getPrice() {
        return price;
    }

    public static Extras extras(String type){
        return switch (type){
            case "Cheese" -> new Cheese();
            case "Cutlet" -> new Cutlet();
            default -> new Extras("Default", 0.0);
        };
    }
}

class Cheese extends Extras{

    public Cheese() {
        super("Cheese", 0.5);
    }

}

class Cutlet extends Extras {

    public Cutlet() {
        super("Cutlet", 1.0);
    }


    }

