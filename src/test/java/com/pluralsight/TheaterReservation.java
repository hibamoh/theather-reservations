package com.pluralsight;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Scanner;

public class TheaterReservation {
    public static void main(String[] args) {

        Scanner myScanner = new Scanner(System.in);

        System.out.println("please enter your full name: ");
        String[] fullName = myScanner.nextLine().trim().split(" ");


        String firstName = "";
        String middleName ="";
        String lastName= "";

        if (fullName.length == 1){
            firstName = fullName[0];

        } else if (fullName.length == 2){
            firstName = fullName [0];
            lastName = fullName [1];
        } else {
            firstName = fullName [0];
            middleName = fullName[1];
            lastName = fullName [2];
        }

        System.out.println("what date will you be coming? MM/dd/yyyy");
        String dateString = myScanner.nextLine();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        LocalDate showDate = LocalDate.parse(dateString,formatter);

        System.out.println("how many tickets would you like? ");
        int numberOfTickets = myScanner.nextInt();

        System.out.println(numberOfTickets + " " + "ticket(s)" + " reserved for " + showDate + " under " +
            firstName + " " + middleName + " " + lastName);

    }
}
