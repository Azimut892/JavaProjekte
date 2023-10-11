
public class ZahlenDreieck {
    public static void main(String[] args) {
        //definire die start ziffer
        int start = 0;
        //while loop der laufen soll solange start kleiner oder gleich 10 ist
        while (start <= 10) {
            //sagen das i gleich 0 ist und bei jedem durchlauf wo i kleiner oder gleich start ist 1 addiern soll
            for (int i = 0; i <= start; i++) {
                System.out.print(i + " ");
            }
            //hier addieren wir 1 an start dammit beim nächsten durchlauf wir eine grössere i bekommen und der loop eine
            // ziffer dazu generiert und das alles bis start die 10 ereicht
            System.out.println();
            start++;
        }
    }
}
