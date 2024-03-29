package homework2;
import java.util.Scanner;

public class TaskAboutMonth {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a month number");
        int numberOfMonth = in.nextInt();
        System.out.println("Enter a year");
        int year = in.nextInt();
        String[] months = {"January", "February", "March", "April", "May",
                "June", "Jule", "August", "September", "October",
                "November", "December"
        };
        int days=0;
        switch (numberOfMonth) {
            case 1, 3, 5, 7, 8, 10, 12:
                days = 31;
                break;
            case 4, 6, 9, 11:
                days = 30;
                break;
            case 2:
                if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
                    days = 29;
                } else {
                    days = 28;
                }
        }
        System.out.println(months[numberOfMonth-1] +" " + year + " has " + days + " days");

        }
    }
