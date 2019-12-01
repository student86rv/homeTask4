package ua.epam.receiptPrinter;

import java.util.Date;

public class BusinessLogic {

    public Receipt generateReceipt(double totalAmount) {
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
}
