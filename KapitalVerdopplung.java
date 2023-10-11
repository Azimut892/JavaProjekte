package daniel.basics;

import java.util.Scanner;

public class KapitalVerdopplung {

    public static void main(String[] args){
        //definiere den scanner
        Scanner scanner = new Scanner(System.in);
        //user fragen was sein kapital ist
        System.out.println("wie hoch ist dein kapital?");
        float startKapital = scanner.nextFloat();
        //user fragen was sein jahres zins ist
        System.out.println("was ist dein jahre zins");
        float zinsSatz = scanner.nextFloat();
        //variable jahr und variable kapital erstellen von kapital und startkapital gleich sind
        int jahr = 0;
        float kapital = startKapital;
        //while loop mit kondizion dass das kapital kleiner sein muss als 2 mal das startKapital und so lange durchführen
        //bis dieses ziel ereicht wurde wo jahr mit jedem durchlauf um eins inkrementiert wird und uns anzeigt wie oft
        //der loop durchlaufen wurde
        while (kapital < 2 * startKapital) {
            kapital = kapital * (1 + zinsSatz / 100);
            jahr++;
        }
        System.out.println("dein kapital hat sich nach " + jahr + " jahren verdoppelt mit einem ergebnis von " + kapital + " euro");
    }
}
