package mypackage;

import java.util.Scanner;

public class TaskFour {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please, enter distance in meters and press Enter");
        float distance = in.nextFloat();
        System.out.println("Please, enter hours was taken and press Enter");
        float hours = in.nextFloat();
        System.out.println("Please, enter minutes was taken and press Enter");
        float minuts = in.nextFloat();
        System.out.println("Please, enter seconds was taken and press Enter");
        float seconds = in.nextFloat();
        float allseconds = (hours*3600f) + (minuts*60f) + seconds;
        float speedmetinsec = (distance/allseconds);
        System.out.println("Your speed in meters/seconds is " + speedmetinsec);
        float metersinkm = distance*0.001f;
        float allhours = hours + minuts/60f + seconds/3600f;
        System.out.println("Your speed in km/h is " + metersinkm/allhours);
    }
}
