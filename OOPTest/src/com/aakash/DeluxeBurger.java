package com.aakash;

public class DeluxeBurger extends Hamburger{

    private boolean deluxeAdditions;

    public DeluxeBurger() {
        super("Deluxe Burger", "Italian Roll", "Premium Pork");
        this.deluxeAdditions = true;
        if (deluxeAdditions) {
            int chipsPrice = 7;
            int drinksPrice = 5;
            setFinalPrice(getFinalPrice() + chipsPrice + drinksPrice);
            System.out.println("Chips and Drinks added with deluxe burger");
        }
    }


    @Override
    public void getTotalPrice() {
        super.getTotalPrice();
    }

    @Override
    public void setFinalPrice(int finalPrice) {
        super.setFinalPrice(finalPrice);
    }

    @Override
    public int getFinalPrice() {
        return super.getFinalPrice();
    }
}
