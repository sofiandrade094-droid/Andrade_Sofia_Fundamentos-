// Autor: Sofia Andrade | NRC 37712 | Fecha: 30/10/2026
// Ejercicio 1: ecuacion cuadratica ax^2 + bx + c = 0 segun el discriminante.

import java.util.Locale;
import java.util.Scanner;

public class Guiada_E1_Cuadratica {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese a: ");
        double a = sc.nextDouble();
        System.out.print("Ingrese b: ");
        double b = sc.nextDouble();
        System.out.print("Ingrese c: ");
        double c = sc.nextDouble();

        if (a == 0) {
            System.out.println("Error: si a = 0 no es una ecuacion cuadratica.");
        } else {
            double discriminante = b * b - 4 * a * c;

            if (discriminante > 0) {
                double x1 = (-b + Math.sqrt(discriminante)) / (2 * a);
                double x2 = (-b - Math.sqrt(discriminante)) / (2 * a);
                System.out.printf("Dos raices reales: x1 = %.2f, x2 = %.2f%n", x1, x2);
            } else if (discriminante == 0) {
                double x = -b / (2 * a);
                System.out.printf("Raiz doble: x = %.2f%n", x);
            } else {
                System.out.println("Sin raices reales");
            }
        }
        sc.close();
    }
}