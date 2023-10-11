
import java.util.Scanner;

public class Collatzfolge {

    public static void main(String[] args) {
        //definieren die variablen laut PAP und noch einen scanner hinzugefügt
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        int groesste = 0;
        System.out.println("gib mir eine zahl ");
        int nummer = scanner.nextInt();


        //folgen den anweisungen des PaP wo controlliert wird ob nummer ungleich 1 ist
        while (nummer != 1) {
            // sollte die nummer größer als variable groesser sein wird diese ersetzt
            if (nummer > groesste) {
                groesste = nummer;
            }
            //ist die nummer dur 2 teilbar ohne rest wird diese nummer durch 2 geteilt ohne rest wird dies gemacht
            //und die schleife wird erneut gestartet
            if (nummer % 2 == 0) {
                nummer = nummer / 2;
            //ist die zahl aber nicht teilbar wird sie moltiplizert durch 3 un 1 wird ihr hinzugefüght und dann startet
            // die schleife noch mal
            } else {
                nummer = nummer * 3 + 1;

            }
            //hier wird kontrolliert wie oft die schleife durchgelaufen ist bevor die kondizion erfühllt wurde
            count++;
        }

        System.out.println("es hat " + count + " mal gedauert um die 1 zu ereichen");
        System.out.println("die größte zahl war " + groesste);
    }
}

