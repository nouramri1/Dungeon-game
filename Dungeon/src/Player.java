import java.util.HashMap;

public class Player {

    private Room location;


    public Room getLocation() {
        return location;
    }

    public void setLocation(Room loc) {
        location = loc;
    }
    private HashMap<String, Item> inventory = new HashMap<>();

    public void addItem(Item item) {
        inventory.put(item.getName(), item);
    }
    public void removeItem(String name) {
        inventory.remove(name);
    }

    public boolean hasItem(String name) {
        return inventory.containsKey(name);
    }
    public Item getItem(String name) {
        return inventory.get(name);
    }

    /* Code that we haven't covered yet */
    public void printInventory() {
        System.out.print("Inventory: ");
        for(Item item : inventory.values()) {
            System.out.print(item.getName() + " ");
        }
        System.out.println();
    }
}
