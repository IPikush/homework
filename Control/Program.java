package Control;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please, enter your login");
        String login = in.nextLine();
        System.out.println("Please, enter your password");
        String password = in.nextLine();
        String correctLogin = "correctUser";
        String correctPassword="pass123!";
        if (login.equals(correctLogin) && password.equals(correctPassword)){
            System.out.println("1.Even Number");
            System.out.println("2.Armstrong");
            System.out.println("3.Reverse");
            System.out.println("4.Fibonacci");
            System.out.println("5.Replace");
            ChoicePart();
        }else{
            System.out.println("Login or password is incorrect");
        }

    }
    public static void ChoicePart(){
        Scanner in = new Scanner(System.in);
        System.out.println("Which task do you want to start(enter number of task)?");
        String task = in.nextLine();
        switch (task){
            case "1":
                System.out.println(Tasks.taskOne());
                break;
            case "2":
                System.out.println(Tasks.taskTwo());
                break;
            case "3":
                System.out.println(Tasks.taskThree());
                break;
            case "4":
                System.out.println(Tasks.taskFour());
                break;
            case "5":
                System.out.println(Tasks.taskFive());
                break;
            default:
                System.out.println("Smth wrong");
        }
    }
}
