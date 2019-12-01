package ua.epam.receiptPrinter;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class AppView {

    private static final String START_MSG = "Enter total amount:";

    public void start() {
        BusinessLogic businessLogic = new BusinessLogic();

        System.out.println(START_MSG);
        Scanner scanner = new Scanner(System.in);
        double sum = scanner.nextDouble();

        Receipt receipt = businessLogic.generateReceipt(sum);
        System.out.println(prettyPrinter(receipt));
    }

    private String prettyPrinter(Receipt receipt) {
        return "        Receipt" + "\n" +
                "Date: " + dateFormat(receipt.getDate()) + "\n" +
                "__________________________" + "\n" +
                "Total amount: " + receipt.getTotalAmount() + "\n" +
                "Discount: " + receipt.getDiscount() + " %" + "\n" +
                "Pay: " + receipt.getAmountToPay();
    }

    private String dateFormat(Date date) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd, HH:mm:ss");
        return sdf.format(date);
    }

}
