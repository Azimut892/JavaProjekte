
import java.util.Scanner;


public class UmwandlerTemperatures {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        System.out.println("Celcius of Fahrenheite");
        String temperatureChosen = inputScanner.nextLine();


        if (!temperatureChosen.equalsIgnoreCase("Celcius") && !temperatureChosen.equalsIgnoreCase("Fahrenheit")) {
            System.out.println("invalid input");
        }

        System.out.println("enter value");
        float userTemperature = inputScanner.nextFloat();
        if (temperatureChosen.equalsIgnoreCase("Celcius")) {
            float converted = (userTemperature * 9/5) + 32;
            System.out.println(converted + "Fahrenheit");

        } else {
            float converted = (userTemperature - 32) * 5/9;
            System.out.println(converted + "Celsius");
        }

        inputScanner.close();

    }

}
