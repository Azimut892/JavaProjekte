
import java.util.Scanner;


public class UmwandlerCurrency {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        System.out.println("doller or euro");
        String currencieChosen = inputScanner.nextLine();
        float exchangeRate = 0.0f;

        if (currencieChosen.equalsIgnoreCase("doller")) {
            exchangeRate = 0.95f;
        } else if (currencieChosen.equalsIgnoreCase("euro")) {
            exchangeRate = 1.04f;
        } else {
            System.out.println("invalid input");
        }

        System.out.println("enter value");
        float userMoney = inputScanner.nextFloat();
        if (currencieChosen.equalsIgnoreCase("doller")) {
            float converted = userMoney * exchangeRate;
            System.out.println(converted + "euro");

        } else {
            float converted = userMoney * exchangeRate;
            System.out.println(converted + "doller");
        }

        inputScanner.close();

    }

}
