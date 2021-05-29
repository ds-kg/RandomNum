package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Random randomNum = new Random();

        for (int i = 0; i<1; i++){
            System.out.println(randomNum.nextInt(107) + 1);
        }

    }
}
