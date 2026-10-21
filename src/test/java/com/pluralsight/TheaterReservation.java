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

        String firstName = fullName[0];
        String middleName ="";
        String lastName= "";

        if (fullName.length == 2){
            lastName = fullName[1];
        } else {
            ;lastName = fullName [2];
            middleName = fullName [1];
        }

        System.out.println("what date will you be coming? ");
        String dateString = myScanner.nextLine();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        LocalDate showDate = LocalDate.parse(dateString,formatter);



    }
}
