package com.pluralsight;

import java.util.Scanner;

public class CellPhoneApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CellPhone cellPhone1 = new CellPhone();

        System.out.print("What is the serial number? ");
        int serialNumber = scanner.nextInt();
        scanner.nextLine();
        cellPhone1.setSerialNumber(serialNumber);

        System.out.println("What model is the phone? ");
        String model = scanner.nextLine();
        cellPhone1.setModel(model);

        System.out.println("Who is the carrier? ");
        String carrier = scanner.nextLine();
        cellPhone1.setCarrier(carrier);

        System.out.println("What is the phone number? ");
        String phoneNumber = scanner.nextLine();
        cellPhone1.setPhoneNumber(phoneNumber);

        System.out.println("Who is the owner of the phone? ");
        String owner = scanner.nextLine();
        cellPhone1.setOwner(owner);

        System.out.println(cellPhone1.getSerialNumber());
        System.out.println(cellPhone1.getModel());
        System.out.println(cellPhone1.getCarrier());
        System.out.println(cellPhone1.getPhoneNumber());
        System.out.println(cellPhone1.getOwner());
        scanner.close();
    }
}
