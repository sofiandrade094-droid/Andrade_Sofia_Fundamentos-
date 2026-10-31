// Autor: Sofia Andrade | NRC 37712 | Fecha: 30/10/2026
// Problema 3: promedio de tres notas parciales (sobre 20) y condicion final del estudiante.

import java.util.Locale;
import java.util.Scanner;

public class T2_P3_NotaFinal {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese la nota 1 (sobre 20): ");
        double n1 = sc.nextDouble();
        System.out.print("Ingrese la nota 2 (sobre 20): ");
        double n2 = sc.nextDouble();
        System.out.print("Ingrese la nota 3 (sobre 20): ");
        double n3 = sc.nextDouble();

        // validacion: cada nota debe estar entre 0 y 20
        if (n1 < 0 || n1 > 20 || n2 < 0 || n2 > 20 || n3 < 0 || n3 > 20) {
            System.out.println("Error: las notas deben estar entre 0 y 20.");
        } else {
            double promedio = (n1 + n2 + n3) / 3;
            System.out.printf("Promedio: %.2f%n", promedio);

            if (promedio >= 14) {
                System.out.println("Aprobado");
            } else if (promedio >= 9) {
                System.out.println("Supletorio");
            } else {
                System.out.println("Reprobado");
            }
        }
        sc.close();
    }
}