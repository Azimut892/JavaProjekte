package daniel.basics;

import java.util.Scanner;

public class PrimfaktorZerlegung {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("gib mir eine natürliche zahl: ");
        int zahl = scanner.nextInt();
        int count = 0;

        while (zahl % 2 == 0 && zahl != 2) {
            zahl /= 2;
            System.out.println(zahl);
            count++;
            }
        String zwei = "2 * ".repeat(count);
        System.out.println("primfaktor ist " + zwei + zahl);

        }
}
