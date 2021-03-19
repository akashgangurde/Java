package com.aakash;

public class Hamburger {

    private String name;
    private String rollType;
    private String meat;
    private int price;
    private int finalPrice;

    public Hamburger(String name, String rollType, String meat) {
        this.name = name;
        this.rollType = rollType;
        this.meat = meat;
        this.price = 20;
    }

    public void addAdditions (int choice) {
        if (choice > 0 && choice < 5) {
            switch (choice) {
                case 1:
                    int lettucePrice = 2;
                    this.setFinalPrice(this.getFinalPrice() + lettucePrice);
                    System.out.println("Lettuce Added");
                    break;
                case 2:
                    int tomatoPrice = 4;
                    this.setFinalPrice(this.getFinalPrice() + tomatoPrice);
                    System.out.println("Tomato Added");
                    break;
                case 3:
                    int carrotPrice = 2;
                    this.setFinalPrice(this.getFinalPrice() + carrotPrice);
                    System.out.println("Carrot Added");
                    break;
                case 4:
                    int cheesePrice = 4;
                    this.setFinalPrice(this.getFinalPrice() + cheesePrice);
                    System.out.println("Cheese Added");
                    break;
            }
        }
    }

    public void getTotalPrice() {
        int totalPrice = getPrice() + getFinalPrice();
        System.out.println("Burger:    " + getName() + " Price " + getPrice() + " with additions Price " + totalPrice);
    }



    public void setFinalPrice(int additionPrice) {
        this.finalPrice = additionPrice;
    }

    public int getFinalPrice() {
        return finalPrice;
    }

    public String getName() {
        return name;
    }

    public String getRollType() {
        return rollType;
    }

    public String getMeat() {
        return meat;
    }

    public int getPrice() {
        return price;
    }
}
