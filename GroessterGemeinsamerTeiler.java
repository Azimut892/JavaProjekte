
import java.util.Scanner;

public class GroessterGemeinsamerTeiler {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("gib mir 3 ganze zahlen ");
        int zahl1 = scanner.nextInt();
        int zahl2 = scanner.nextInt();
        int zahl3 = scanner.nextInt();
        int min = Math.min(Math.min(zahl1, zahl2), zahl3);
        int ggt = 1;

    for (int i = 2; i <= min; i++) {
        if(zahl1 % i == 0 && zahl2 % i == 0 && zahl3% i == 0){
            ggt = i;
            }
        }

        System.out.println("divisor ist  " + ggt );
    }
}
