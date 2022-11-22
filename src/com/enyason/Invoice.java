package com.enyason;

import com.enyason.table.Table;

public class Invoice {

    Table table;
    int quantity;
    final double DISCOUNT = 0.05;
    double moneyPaid;

    public Invoice(Table table, int quantity, double moneyPaid) {
        this.table = table;
        this.quantity = quantity;
        this.moneyPaid = moneyPaid;
    }


    private double calculatePrice() {
        double price = table.getPrice() * quantity;

        double netPrice;

        if (shouldApplyDiscount()) {
            netPrice = price - (price * DISCOUNT);
        } else {
            netPrice = price;
        }

        return netPrice;
    }

    private double getUserBalance(){
        return moneyPaid - calculatePrice();
    }


    public void printInvoice() {
        System.out.println(


        );
    }

    boolean shouldApplyDiscount() {
        return quantity > 1;
    }


}
