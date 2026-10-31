// Autor: Sofia Andrade | NRC 37712 | Fecha: 30/10/2026
// Problema 5: leer tres numeros distintos e imprimirlos de mayor a menor usando solo condicionales.

import java.util.Locale;
import java.util.Scanner;

public class T2_P5_Mayor {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el numero 1: ");
        double a = sc.nextDouble();
        System.out.print("Ingrese el numero 2: ");
        double b = sc.nextDouble();
        System.out.print("Ingrese el numero 3: ");
        double c = sc.nextDouble();

        if (a == b || a == c || b == c) {
            System.out.println("Error: los tres numeros deben ser distintos.");
        } else {
            System.out.print("De mayor a menor: ");
            if (a > b && a > c) {
                // a es el mayor
                if (b > c) {
                    System.out.println(a + " " + b + " " + c);
                } else {
                    System.out.println(a + " " + c + " " + b);
                }
            } else if (b > a && b > c) {
                // b es el mayor
                if (a > c) {
                    System.out.println(b + " " + a + " " + c);
                } else {
                    System.out.println(b + " " + c + " " + a);
                }
            } else {
                // c es el mayor
                if (a > b) {
                    System.out.println(c + " " + a + " " + b);
                } else {
                    System.out.println(c + " " + b + " " + a);
                }
            }
        }
        sc.close();
    }
}