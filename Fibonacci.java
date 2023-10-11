package daniel.basics;

import java.math.BigInteger;

public class Fibonacci {

    public static void main(String[] args) {
        //variable n auf 100 um die ersten 100 nummern der fibonacci sequenz zu generieren
        //dann eine liste erstellen wo diese n nummer an fibonacci nummern enthalten werden
        int n = 100;
        BigInteger[] fibonacci = new BigInteger[n];
        //die ersten 2 elemente derl liste manuel definieren
        fibonacci[0] = BigInteger.ZERO;
        fibonacci[1] = BigInteger.ONE;

        //for loop der den rest der liste generiet
        for (int i = 2; i < n; i++) {
            fibonacci[i] = fibonacci[i - 1].add(fibonacci[i -2]);
            System.out.println(fibonacci[i]);
        }
    }
}
