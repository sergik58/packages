package ru.netology.sqr.packages.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class SQRServiceTest {
    @Test
    public void testOfSQR() {
        SQRService service = new SQRService();
        int expected = 3;
        int actual = service.calculateSQR(200, 300);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testOfSQRAnotherScore() {
        SQRService service = new SQRService();
        int expected = 1;
        int actual = service.calculateSQR(0, 100);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testOfSQRScore() {
        SQRService service = new SQRService();
        int expected = 1;
        int actual = service.calculateSQR(100, 100);
        Assertions.assertEquals(expected, actual);
    }

@Test
    public void testOfSQRMax(){
        SQRService service = new SQRService();
        int expected = 0;
                int actual = service.calculateSQR(20, 70);
        Assertions.assertEquals(expected, actual);
}
}
