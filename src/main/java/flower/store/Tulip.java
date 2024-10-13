package flower.store;

public class Tulip extends Flower {
    public Tulip(double price, double sepalLength, FlowerColor color) {
        this.setColor(color);
        this.setPrice(price);
        this.setSepalLength(sepalLength);
        this.setFlowerType(FlowerType.TULIP);
    }
    
}
