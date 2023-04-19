package main.shoppinglist;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ItemList {
    private ArrayList<Item> items = new ArrayList<>();
    private static ItemList itemList = null;
    private boolean emptyList = true;


    private ItemList(){
    }

    public ArrayList<Item> getItems() {
        return items;
    }

    public ArrayList<Item> sortAlphabetical() {
        Collections.sort(items, new Comparator<Item>() {
            @Override
            public int compare(Item item, Item i1) {
                return item.getName().compareToIgnoreCase(i1.getName());
            }
        });
        return items;
    }
    public ArrayList<Item> sortByTime() {
        Collections.sort(items, new Comparator<Item>() {
            @Override
            public int compare(Item item, Item i1) {
                return Integer.compare(item.getId(), i1.getId());
            }
        });
        return items;
    }
    public void addItem(Item item) {
        items.add(item);
        emptyList = false;
        }

    public boolean isEmptyList() {
        return emptyList;
    }

    public void removeItem(int id) {
        int i = 0;
        for (Item a : items) {
            if(a.getId() == id) {
                break;
            }
            i++;
        }
        items.remove(i);
    }
    public static ItemList getInstance(){
        if(itemList == null){
            itemList = new ItemList();
        }
        return (itemList);
    }
    public Item getItemById(int id){
        return items.get(id);
    }

}
