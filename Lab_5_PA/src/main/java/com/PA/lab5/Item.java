package com.PA.lab5;

public abstract class Item implements Serializable {
    private String id;
    private String title;
    private String location; //file name or Web page

    private Map<String, Object> tags = new HashMap<>();
    //…
    public void addTag(String key, Object obj) {
        tags.put(key, obj);
    }
//…
}
}