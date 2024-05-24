public class Item {

    private String name;

    private String description;

    public String getName(){return name;}

    public void setName(String items) {
        if (!items.equals("")) {
            name = items;
        }
    }
    public String getDescription() {return description;}

    public void setDescription(String d) {
        if (!d.equals("")) {
            description = d;
        }
    }


        }

