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
class TaskTwo {
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
class TaskThree{
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
class TaskFour{
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
class TaskFive {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please, enter up limit and press Enter");
        int up = in.nextInt();
        System.out.println("Please, enter down limit and press Enter");
        int down = in.nextInt();
        //Math.random chooses random double from [0,1) default
        int random = (int) (Math.random()*(up-down)) + down;
        System.out.println(random);
    }
}