package com.PA.lab5;
public class Main {
    public static void main(String args[]) {
        Main app = new Main();
        app.testCreateSave();
        app.testLoadView();
    }

    private void testCreateSave() {
        Catalog catalog =
                new Catalog("MyRefs");
        var book = new Item("article1", … );
        var article = new Item("book1", … );
        catalog.add(book);
        catalog.add(article);

        CatalogUtil.save(catalog, "d:/research/catalog.json");
    }

    private void testLoadView() {
        Catalog catalog = CatalogUtil.load("d:/research/catalog.json");
        CatalogUtil.view(catalog.findById("article1"));
    }
}