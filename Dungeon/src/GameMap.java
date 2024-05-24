public class GameMap {

    // how to link rooms: we are going to make a record of
    // room1, direction = room2
    // how to do this? we could put this data in the room itself
    // so room1 has direction = room2 data

    // link two rooms together, don't "return" any value
    public void linkRooms(Room room1, Room room2, String direction) {
        room1.setLink(room2, direction);
    }

}
