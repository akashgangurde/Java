package com.aakash;

public class HealthyBurger extends Hamburger{
    public HealthyBurger() {
        super("Healthy Burger", "Brown Rye Roll", "Lean Meat");
    }

    @Override
    public void addAdditions(int choice) {
        super.addAdditions(choice);
        if (choice > 0 && choice < 7) {
            switch (choice) {
                case 5:
                    int baconPrice = 5;
                    setFinalPrice(getFinalPrice() + baconPrice);
                    System.out.println("Bacon Added");
                    break;
                case 6:
                    int onionPrice = 2;
                    setFinalPrice(getFinalPrice() + onionPrice);
                    System.out.println("Onion Added");
                    break;
            }
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
}
