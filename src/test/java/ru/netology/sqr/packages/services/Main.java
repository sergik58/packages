package ru.netology.sqr.packages.services;

public class Main {
    public static void main(String[] args) {
        SQRService service = new SQRService();
        System.out.println(service.calculateSQR(200, 300));
    }
}
