package homework1;

import java.util.Scanner;

public class TaskFive {
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
