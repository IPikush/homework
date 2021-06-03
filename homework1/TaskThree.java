package homework1;

import java.util.Scanner;

public class TaskThree {
    public static void main(String[] args) {
        System.out.println("Please, enter your pounds and press Enter");
        Scanner in = new Scanner(System.in);
        int pounds = in.nextInt(); //452
        System.out.println("Please, enter your inches and press Enter");
        int inches = in.nextInt(); //72
        double kg = pounds*0.453592d;
        double meters = inches*0.0254d;
        System.out.println("Body Mass Index is " + kg/Math.pow(meters,2));
    }
}
