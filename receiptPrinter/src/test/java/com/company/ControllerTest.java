package com.company;

import org.junit.Test;
import static org.junit.Assert.*;

public class ControllerTest {

    @Test
    public void testController() {
        Controller controller = new Controller();

        Receipt receipt1 = controller.getReceipt(450);
        assertEquals(receipt1.getDiscount(), 5);
        assertEquals(receipt1.getAmountToPay(), 427.5, 0.01);

        Receipt receipt2 = controller.getReceipt(780);
        assertEquals(receipt2.getDiscount(), 10);
        assertEquals(receipt2.getAmountToPay(), 702, 0.01);

        Receipt receipt3 = controller.getReceipt(1250);
        assertEquals(receipt3.getDiscount(), 15);
        assertEquals(receipt3.getAmountToPay(), 1062.5, 0.01);
    }
}
