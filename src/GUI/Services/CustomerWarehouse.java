package GUI.Services;

import GUI.Exceptions.TooManyThingsException;
import GUI.Item.Item;

import java.util.LinkedList;

public class CustomerWarehouse extends ServiceWarehouse{

    double occupiedSurface;
    private LinkedList<Item> items = new LinkedList<>();

    public CustomerWarehouse(double surface) {
        super(surface);
    }

    public void isFreeSurface() {
        occupiedSurface = 0;
        for(Item item : items){
            occupiedSurface += item.getSurfaceItem();
        }
    }

    public void addItem(Item item) throws TooManyThingsException {

        if(occupiedSurface + item.getSurfaceItem() <= surface) {
            System.out.println(item.getItemType() + " was added.");
            items.add(item);
            isFreeSurface();
        }else  {
            try {
                throw new TooManyThingsException();
            }catch (TooManyThingsException e) {
                System.out.println(e.getMessage());
            }
            System.out.println("This item does not fit, not enough space.");
        }
    }

    public void removeItem(Item item) {
        items.remove(item);
    }

    @Override
    public String toString() {

        return super.toString() +
                ", Item: " + items;
    }
}
