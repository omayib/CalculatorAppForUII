package id.co.technomotion.calculatorapp;

/**
 * Created by omayib on 7/6/15.
 */
public class Calculator {

    public static String add(String number1,String number2){

        double hasil=Double.parseDouble(number1)+Double.parseDouble(number2);

        return String.valueOf(hasil);
    }
    public static String substract(String number1,String number2){

        double hasil=Double.parseDouble(number1)-Double.parseDouble(number2);

        return String.valueOf(hasil);
    }
    public static String multiply(String number1,String number2){

        double hasil=Double.parseDouble(number1)*Double.parseDouble(number2);

        return String.valueOf(hasil);
    }
    public static String divide(String number1,String number2){

        double hasil=Double.parseDouble(number1)/Double.parseDouble(number2);

        return String.valueOf(hasil);
    }
}
