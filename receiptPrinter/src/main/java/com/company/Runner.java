package com.company;

import java.util.Scanner;

public class Runner {

    public static void main(String[] args) {
        Controller controller = new Controller();

        System.out.println("Enter sum:");
        Scanner scanner = new Scanner(System.in);
        double sum = scanner.nextDouble();

        Receipt receipt = controller.getReceipt(sum);

        System.out.println(Controller.prettyPrinter(receipt));
    }
}
