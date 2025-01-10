package FRQP2;

import java.util.Arrays;
import java.util.Collections;

public class FlowerShop {

    private Flower[] flowerInventory;

    // ADDED TO ENABLE TESTING
    public FlowerShop(Flower[] flowerInventory) {
        this.flowerInventory = flowerInventory;
    }

    // ADDED TO ENABLE TESTING
    public Flower[] getFlowerInventory() {
        return flowerInventory;
    }

    // IMPLEMENTATION ADDED TO ENABLE TESTING
    public Flower[] sortByQuantity(Flower[] arr) {
        Flower[] sortedCopy = new Flower[arr.length];
        for (int i = 0; i < sortedCopy.length; i++) {
            sortedCopy[i] = arr[i];
        }
        Arrays.sort(sortedCopy); // sorts low to high (increasing) based on quantity
        Collections.reverse(Arrays.asList(sortedCopy)); // reverses to sort in decreasing order
        return sortedCopy;
    }

    // part a
    public void updateInventory(Flower[] newInventory) {

        for (int i = 0; i < newInventory.length; i++) {
            flowerInventory[i].setQuantity((flowerInventory[i].getQuantity()) + newInventory[i].getQuantity());
        }
    }

    // part b
    public boolean topNSame(int n, Flower[] otherInventory) {
        Flower[] inv1 = new Flower[flowerInventory.length];
        Flower[] inv2 = new Flower[otherInventory.length];

        inv1 = sortByQuantity(flowerInventory);
        inv2 = sortByQuantity(otherInventory);

        for (int i = 0; i < n; i++) {
            if (!(inv1[i].getName() == inv2[i].getName())) {
                return false;
            }
        }
        return true;
    }

}