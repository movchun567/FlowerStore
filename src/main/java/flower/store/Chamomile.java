package flower.store;

public class Chamomile extends Flower {
    public Chamomile(double price, double sepalLength, FlowerColor color) {
        this.setColor(color);
        this.setPrice(price);
        this.setSepalLength(sepalLength);
        this.setFlowerType(FlowerType.CHAMOMILE);
    }
    public Chamomile() {
        super();
    }
}
