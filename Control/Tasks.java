package Control;

import java.util.Scanner;

public class Tasks {
    public static void main(String[] array) {
    }
    public static boolean taskOne() {
        boolean result=true;
        System.out.println("Please, enter your number and press Enter");
        Scanner in = new Scanner(System.in);
        int number=in.nextInt();
        if (number%2==0){
            result=true;
        }else if (number%2!=0){
            result=false;
        }else{
            System.out.println("This is not integer or number is not valid");
        }
        return result;
    }
    public static boolean taskTwo(){
        boolean result=true;
        int newNum=0;
        int sum=0;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number to check if it is Armstrong number");
        String num=in.nextLine();
        String[] newArr=num.split("");
        for(int i=0;i< newArr.length;i++){
            newNum=Integer.parseInt(newArr[i]);
            sum= (int) (sum+Math.pow(newNum,newArr.length));
        }if(Integer.parseInt(num)==sum){
            result=true;
        }else{result=false;}
        return result;
    }
    public static String taskThree(){
        System.out.println("Please, enter your string and press Enter");
        Scanner in = new Scanner(System.in);
        String toReverse=in.nextLine();
        String newStr="";
        String[] newArray=toReverse.split("");
        for(int i=newArray.length-1;i>=0;i--){
            newStr=newStr+newArray[i];
        }
        return newStr;
    }
    public static long taskFour(){

        long f1=0;
        long f2=1;
        for(int i=0;i<100;i++){
            long f3=f2+f1;
            f1=f2;
            f2=f3;
            System.out.println(f3);
        }return 0;
    }
    public static String taskFive(){
        System.out.println("Please, enter your string and press Enter");
        Scanner in = new Scanner(System.in);
        String str=in.nextLine();
        String newStr = "";
        String newString = "";
        if (str.length()<=30) {
            newStr = str.replace('a', '@');
            newString = newStr.replace('o', '0');
        }else{newString="This string contains >30 symbols";
        }
        return newString;
    }
}


