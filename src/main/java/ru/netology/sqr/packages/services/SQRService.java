package ru.netology.sqr.packages.services;

public class SQRService {
    public int calculateSQR(int minNumber, int maxNumber) {

        int score = 0;
        for (int i = 10; i <= 99; i++) {
            if (i * i < minNumber) {

                continue;
            }

            if (i * i > maxNumber) {
                break;
            }
            score++;

        }
        return score;
    }

}

