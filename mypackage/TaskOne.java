package mypackage;

import java.util.Scanner;

public class TaskOne {
    public static void main(String[] args) {
        System.out.println("Please, enter your inches and press Enter");
        Scanner in = new Scanner(System.in);
        float inches = in.nextFloat();
        float meter = 0.0254f;
        System.out.println(inches + " inch is " + inches*meter + " meters");
    }
}