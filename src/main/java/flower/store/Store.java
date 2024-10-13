package flower.store;

import java.util.ArrayList;
import java.util.List;


public class Store {
    private ArrayList<FlowerBucket> flowerBuckets;

    public Store() {
        this.flowerBuckets = new ArrayList<>();
    }

    public void add(FlowerBucket flowerBucket) {
        flowerBuckets.add(flowerBucket);
    }

    public List<FlowerBucket> search(FlowerType flowerType) {
        List<FlowerBucket> result = new ArrayList<>();
        for (FlowerBucket flowerBucket : flowerBuckets) {
            for (FlowerPack flowerPack : flowerBucket.getFlowerPacks()) {
                if (flowerPack.getFlower().getFlowerType().equals(flowerType)) {
                    result.add(flowerBucket);
                }
            }
        }
        return result;
    }
}
