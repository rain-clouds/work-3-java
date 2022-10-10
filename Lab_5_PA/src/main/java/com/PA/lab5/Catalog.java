package com.PA.lab5;

public class Catalog implements Serializable {
    private String name;
    private List<Item> items = new ArrayList<>();

    //…
    public void add(Item item) {
        items.add(item);
    }
    public Item findById(String id) {
        //…
    }
}
