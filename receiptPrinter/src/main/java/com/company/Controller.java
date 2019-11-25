package com.company;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Controller {

    public Receipt getReceipt(double totalAmount) {
        int discount = discountCalc(totalAmount);
        double amountToPay = payCalc(totalAmount, discount);
        return new Receipt(new Date(), totalAmount, discount, amountToPay);
    }

    private int discountCalc(double totalAmount) {
        if (totalAmount <= 500) {
            return 5;
        }
        if (totalAmount > 500 && totalAmount <= 1000) {
            return 10;
        }
        if (totalAmount > 1000) {
            return 15;
        }
        return 0;
    }

    private double payCalc(double totalAmount, int discount) {
        return totalAmount - (totalAmount * 0.01 * discount);
    }

    public static String prettyPrinter(Receipt receipt) {
        return "        Receipt" + "\n" +
                "Date: " + dateFormat(receipt.getDate()) + "\n" +
                "__________________________" + "\n" +
                "Total amount: " + receipt.getTotalAmount() + "\n" +
                "Discount: " + receipt.getDiscount() + " %" + "\n" +
                "Pay: " + receipt.getAmountToPay();

    }

    private static String dateFormat(Date date) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd, HH:mm:ss");
        return sdf.format(date);
    }
}
