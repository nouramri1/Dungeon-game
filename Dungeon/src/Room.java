import java.util.HashMap;

public class Room {
    private String name;
    private String description;

    public String getName() {
        return name;
    }

    public void setName(String n) {
        if (!n.equals("")) {
            name = n;
        }
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String d) {
        if (!d.equals("")) {
            description = d;
        }
    }

    public HashMap<String, Room> links = new HashMap<>();

    public void setLink(Room room2, String direction) {
        // we need a "data structure" that can hold
        // a "key" (direction) and a "value" (room2)
        // (in Python this would a dictionary)
        // (in Java, this is called a Map)
        links.put(direction, room2);
    }

    public boolean hasLink(String direction) {
        // look in hashmap to see if direction is a key
        return links.containsKey(direction);
    }

    public Room getLinkedRoom(String direction) {
        return links.get(direction);
    }

    private HashMap<String, Item> items = new HashMap<>();

    public void addItem(Item item) {
        items.put(item.getName(), item);
    }
    public void removeItem(String name) {
       items.remove(name);
    }
    public boolean hasItem(String name) {
        return items.containsKey(name);
    }
    public Item getItem(String name) {
        return items.get(name);
    }

    /* Code that we haven't covered yet */
    public void printItems() {
        System.out.print("Items here: ");
        for(Item item : items.values()) {
            System.out.print(item.getName() + " ");
        }
        System.out.println();
    }

}
