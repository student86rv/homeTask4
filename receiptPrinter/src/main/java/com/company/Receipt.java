package com.company;

import java.util.Date;

public class Receipt {

    private Date date;
    private double totalAmount;
    private int discount;
    private double amountToPay;

    public Receipt() {
    }

    public Receipt(Date date, double totalAmount, int discount, double amountToPay) {
        this.date = date;
        this.totalAmount = totalAmount;
        this.discount = discount;
        this.amountToPay = amountToPay;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(double totalAmount) {
        this.totalAmount = totalAmount;
    }

    public int getDiscount() {
        return discount;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }

    public double getAmountToPay() {
        return amountToPay;
    }

    public void setAmountToPay(double amountToPay) {
        this.amountToPay = amountToPay;
    }

    @Override
    public String toString() {
        return "Receipt{" +
                "date=" + date +
                ", totalAmount=" + totalAmount +
                ", discount=" + discount +
                ", amountToPay=" + amountToPay +
                '}';
    }
}
