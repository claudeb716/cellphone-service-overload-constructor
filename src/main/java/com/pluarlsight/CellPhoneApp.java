package com.pluarlsight;

import java.util.Scanner;

public class CellPhoneApp {
    public static void main(String[] args) {
        // Create a new instance of CellPhone
        CellPhone cellPhone1 = new CellPhone();

        // Create a scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Prompt user for cell phone information and set the properties
        System.out.print("What is the serial number? ");
        int serialNumber = scanner.nextInt();  // Read integer value
        cellPhone1.setSerialNumber(serialNumber);
        scanner.nextLine();  // Consume newline

        System.out.print("What model is the phone? ");
        String model = scanner.nextLine();  // Read entire line till newline
        cellPhone1.setModel(model);

        System.out.print("Who is the carrier? ");
        String carrier = scanner.nextLine();
        cellPhone1.setCarrier(carrier);

        System.out.print("What is the phone number? ");
        String phoneNumber = scanner.nextLine();
        cellPhone1.setPhoneNumber(phoneNumber);

        System.out.print("Who is the owner of the phone? ");
        String owner = scanner.nextLine();
        cellPhone1.setOwner(owner);

        // create object for overload
        CellPhone fullPhoneInfo = new CellPhone(cellPhone1.getSerialNumber(), cellPhone1.getModel(), cellPhone1.getCarrier(), cellPhone1.getPhoneNumber(), cellPhone1.getOwner());

        // Close the scanner
        scanner.close();

        // Display the properties of the phone using getters

    }
}
