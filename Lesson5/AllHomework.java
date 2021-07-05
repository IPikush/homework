package Lesson5;

import homework1.AllTasks;

import java.util.Scanner;

public class AllHomework {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Which homework do you want to start?");
        String homework = in.nextLine();
        switch (homework) {
            case "1":
                System.out.println("Which task of homework1 do you want to start?");
                String task = in.nextLine();
                switch (task){
                    case "1":
                        AllTasks.taskOne();
                        break;
                    case "2":
                        AllTasks.taskTwo();
                        break;
                    case "3":
                        AllTasks.taskThree();
                        break;
                    case "4":
                        AllTasks.taskFour();
                        break;
                    case "5":
                        AllTasks.taskFive();
                        break;
                    default:
                        System.out.println("This homework has 5 tasks");
                }
                break;
            case "2":
                homeworkTwo();
                break;
            default:
                System.out.println("This task includes first two homeworks");
        }
    }
    private static void homeworkTwo(){
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
