package Lesson6;

public class Phone {

    String number="+380660157066";
    String model="model";
    Integer weight=100;
    public String receiveCall(String name){
        String message = "Calling "+ name;
        return message;
    }
    public String getWeight(){
        return "Weight "+ weight+" gramm";
    }
    public String setNumber(String number){
        return "+380"+number;
    }
    public String getNumber(){
        return number;
    }
}
