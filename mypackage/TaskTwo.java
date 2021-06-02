package mypackage;

import java.util.Scanner;

public class TaskTwo {
    public static void main(String[] args) {
        System.out.println("Please, enter your minutes and press Enter");
        Scanner in = new Scanner(System.in);
        int minutes = in.nextInt();
        //int hours = minutes/60;
        //int day = hours/24;
        int years = minutes/60/24/365;
        int days = minutes/60/24%365;
        System.out.println(minutes + " minutes is approximately " + years + " years and " + days + " days ");
    }
}

