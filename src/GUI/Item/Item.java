package GUI.Item;

import GUI.Enums.ItemType;

public class Item {
    private static int idCounter = 0;
    public int id;
    private ItemType itemType;
    private double surfaceItem;

    public Item(ItemType itemType, double surfaceItem) {
        this.id = idCounter++;
        this.itemType = itemType;
        this.surfaceItem = surfaceItem;
    }

    public double getSurfaceItem() {
        return surfaceItem;
    }

    public ItemType getItemType() {
        return itemType;
    }

    @Override
    public String toString() {
        return "ID: " + id +
                ", ItemType: " + itemType +
                ", SurfaceItem: " + surfaceItem;
    }
}
