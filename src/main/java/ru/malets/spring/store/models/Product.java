package ru.malets.spring.store.models;

public class Product {
    private int id;
    private int categoryId;
    private int price;
    private String name;
    private String url;

    public Product() {
    }

    public Product(int id, int categoryId, int price, String name, String url) {
        this.id = id;
        this.categoryId = categoryId;
        this.price = price;
        this.name = name;
        this.url = url;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "\nProduct{" +
                "id=" + id +
                ", categoryId=" + categoryId +
                ", price=" + price +
                ", name='" + name + '\'' +
                ", url='" + url + '\'' +
                '}';
    }
}
