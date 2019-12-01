package ua.epam.receiptPrinter;

import org.junit.Test;
import static org.junit.Assert.*;

public class BusinessLogicTest {

    @Test
    public void testController() {
        BusinessLogic businessLogic = new BusinessLogic();

        Receipt receipt1 = businessLogic.generateReceipt(450);
        assertEquals(receipt1.getDiscount(), 5);
        assertEquals(receipt1.getAmountToPay(), 427.5, 0.01);

        Receipt receipt2 = businessLogic.generateReceipt(780);
        assertEquals(receipt2.getDiscount(), 10);
        assertEquals(receipt2.getAmountToPay(), 702, 0.01);

        Receipt receipt3 = businessLogic.generateReceipt(1250);
        assertEquals(receipt3.getDiscount(), 15);
        assertEquals(receipt3.getAmountToPay(), 1062.5, 0.01);
    }
}
