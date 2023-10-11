
import java.util.Scanner;


public class UmwandlerMetric {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        System.out.println("Kilometer or Miles");
        String systemChosen = inputScanner.nextLine();
        float exchangeRate = 0.0f;

        if (systemChosen.equalsIgnoreCase("Kilometer")) {
            exchangeRate = 0.621371f;
        } else if (systemChosen.equalsIgnoreCase("Miles")) {
            exchangeRate = 1.60934f;
        } else {
            System.out.println("invalid input");
        }

        System.out.println("enter value");
        float userValue = inputScanner.nextFloat();
        if (systemChosen.equalsIgnoreCase("Kilometer")) {
            float converted = userValue * exchangeRate;
            System.out.println(converted + "Miles");

        } else {
            float converted = userValue * exchangeRate;
            System.out.println(converted + "Kilometer");
        }

        inputScanner.close();

    }

}
