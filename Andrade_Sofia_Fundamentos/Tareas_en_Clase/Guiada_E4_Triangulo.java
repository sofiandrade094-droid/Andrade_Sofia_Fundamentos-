// Autor: Sofia Andrade | NRC 37712 | Fecha: 30/10/2026
// Ejercicio 4: clasificar un triangulo por sus lados (equilatero, isosceles, escaleno) y validar que exista.

import java.util.Locale;
import java.util.Scanner;

public class Guiada_E4_Triangulo {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el lado 1: ");
        double a = sc.nextDouble();
        System.out.print("Ingrese el lado 2: ");
        double b = sc.nextDouble();
        System.out.print("Ingrese el lado 3: ");
        double c = sc.nextDouble();

        if (a <= 0 || b <= 0 || c <= 0) {
            System.out.println("Error: los lados deben ser positivos.");
        } else if (a + b <= c || a + c <= b || b + c <= a) {
            // desigualdad triangular: cada lado debe ser menor que la suma de los otros dos
            System.out.println("Los lados no forman un triangulo.");
        } else if (a == b && b == c) {
            System.out.println("Triangulo equilatero");
        } else if (a == b || a == c || b == c) {
            System.out.println("Triangulo isosceles");
        } else {
            System.out.println("Triangulo escaleno");
        }
        sc.close();
    }
}