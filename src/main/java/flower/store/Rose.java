package flower.store;
public class Rose extends Flower {
    public Rose(double price, double sepalLength, FlowerColor color) {
        this.setColor(color);
        this.setPrice(price);
        this.setSepalLength(sepalLength);
        this.setFlowerType(FlowerType.ROSE);
    }

    public Rose() {
        super();
    }
    
}
