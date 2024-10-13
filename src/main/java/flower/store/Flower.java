package flower.store;

public class Flower {
    private double sepalLength;
    private FlowerColor color;
    private double price;
    private FlowerType flowerType;

    public void setPrice(double price) {
        this.price = price;
    }
    public void setColor(FlowerColor color) {
        this.color = color;
    }
    public void setFlowerType(FlowerType flowerType) {
        this.flowerType = flowerType;
    }
    public void setSepalLength(double sepalLength) {
        this.sepalLength = sepalLength;
    }

    public double getPrice() {
        return price;
    }
    public double getSepalLength() {
        return sepalLength;
    }
    public String getFlowerType() {
        return flowerType.toString();
    }

    public String getColor() {
        return color.toString();
    }
}
