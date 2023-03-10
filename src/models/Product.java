package models;

import java.io.Serializable;

public class Product implements Serializable {
    private int id;
    private String name;
    private int price;
    private int amount;
    private String mota;

    public Product() {
    }

    public Product(int id, String name, int price, int amount, String mota) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.amount = amount;
        this.mota = mota;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getMota() {
        return mota;
    }

    public void setMota(String mota) {
        this.mota = mota;
    }

    @Override
    public String toString() {
        return "Thông tin sản phẩm [" +
                "id=" + id +
                ", name= " + name +
                ", price= " + price +
                ", amount= " + amount +
                ", mota= " + mota +
                ']';
    }
}