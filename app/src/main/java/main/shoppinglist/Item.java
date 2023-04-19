package main.shoppinglist;

public class Item {
    private String name;
    private String info;
    private int id;
    private boolean important;

    public Item(String name, String info, boolean important, int id) {
        this.name = name;
        this.info = info;
        this.important = important;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public String getInfo() {
        return info;
    }

    public boolean isImportant() {
        return important;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public int getId() {
        return id;
    }
}
