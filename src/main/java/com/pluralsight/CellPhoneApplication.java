package com.pluralsight;

import java.util.Scanner;

public class CellPhoneApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CellPhone cellPhone1 = new CellPhone();

        System.out.print("What is the serial number? ");
        int serialNumber = scanner.nextInt();
        cellPhone1.setSerialNumber(serialNumber);

        System.out.println("What model is the phone? ");



        scanner.close();
    }
}
