public class Drink {

    private String type;
    protected String size;
    private double price;


    public Drink(String type, String size) {
        this.type = type;
        this.size = size;
        this.price = setPriceForSize();
    }

    public double setPriceForSize() {
        return 0.0;
    }

   public static Drink drink(String type, String size){
        return switch (type){
            case "Cola" -> new Cola(size);
            case "Sprite" -> new Sprite(size);
            default -> new Drink("Default", "None");
        };
   }


    public double getPrice() {
        return price;
    }



    @Override
    public String toString() {
        return "Drink{" +
                "type='" + type + '\'' +
                ", size='" + size + '\'' +
                ", price=" + price +
                '}';
    }
}

class Cola extends Drink{

    public Cola(String size) {
        super("Cola", size);
    }

    @Override
    public double setPriceForSize() {
        return switch (super.size){
            case "Small" -> 1;
            case "Medium" -> 2;
            case "Big" -> 3;
            default -> -1;
        };
    }
}

class Sprite extends Drink{

    public Sprite(String size) {
        super("Sprite", size);
    }

    @Override
    public double setPriceForSize() {
        return switch (size){
            case "Small" -> 1.1;
            case "Medium" -> 2.2;
            case "Big" -> 3.3;
            default -> -1;
        };
    }
}
