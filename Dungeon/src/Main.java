import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // we call the "Room" the CLASS or template
        // and we call kitchen and livingroom the
        // instances of the class (or "OBJECTS")

        Room kitchen = new Room();
        kitchen.setName("Kitchen");
        kitchen.setDescription("A dank and dirty room buzzing with flies.");

        Room livingroom = new Room();
        livingroom.setName("Living Room");
        livingroom.setDescription("My dirty living room.");

        GameMap map = new GameMap();
        map.linkRooms(kitchen, livingroom, "northeast");
        map.linkRooms(livingroom, kitchen, "southwest");

        Item lamp = new Item();
        lamp.setName("lamp");
        lamp.setDescription("produces light");

        Item key = new Item();
        key.setName("key");
        key.setDescription("opens kitchen closet");
        kitchen.addItem(key);
        livingroom.addItem(lamp);

        Player p1 = new Player();
        p1.setLocation(kitchen);

        Scanner in = new Scanner(System.in);

        // "game loop"
        while (true) {
            // print location info
            System.out.println(p1.getLocation().getName());
            String command = in.next(); // single word
            if (command.equals("look")) {
                System.out.println(p1.getLocation().getDescription());

                /* Code that we haven't covered yet */
                // list items in room
                p1.getLocation().printItems();
            } else if (command.equals("go")) {
                String direction = in.next();
                // check if direction is valid for this room
                if (p1.getLocation().hasLink(direction)) {
                    p1.setLocation(p1.getLocation().getLinkedRoom(direction));
                } else {
                    System.out.println("Bad direction.");
                }
            } else if (command.equals("quit")) {
                break;
            } else if (command.equals("get")) {
                String itemName = in.next();
                if (p1.getLocation().hasItem(itemName)) {
                    Item item = p1.getLocation().getItem(itemName);
                    p1.getLocation().removeItem(itemName);
                    p1.addItem(item);
                }
            } else if (command.equals("drop")) {
                String itemName = in.next();
                if (p1.hasItem(itemName)) {
                    Item item = p1.getItem(itemName);
                    p1.removeItem(itemName);
                    p1.getLocation().addItem(item);
                }
            } else if (command.equals("inventory")) {
                /* Code that we haven't covered yet */
                // list items in player
                p1.printInventory();
            }
        }

    }
}


