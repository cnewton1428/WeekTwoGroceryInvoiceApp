package com.company;

public class Person {
    private String ItemName;
    private int Price;
    private int Quantity;
    private int Cost;

    public Person(int price, int quantity) {
    }

    public Person(int price, int quantity, int cost){
        this.ItemName = ItemName;
        this.Price = Price;
        this.Quantity= Quantity;
        this.Cost = Cost;
    }

    public String getItemName() {
        return ItemName;
    }

    public void setItemName(String itemName) {
        this.ItemName = itemName;
    }

    public int getPrice() {
        return Price;
    }

    public void setPrice(int price) {
        this.Price = price;
    }

    public int getQuantity() {
        return Quantity;
    }

    public void setQuantity(int quantity) {
        this.Quantity = quantity;
    }

    public int getCost() {
        return Cost;
    }

    public void setCost(int cost) {
        this.Cost = cost;
    }
}
