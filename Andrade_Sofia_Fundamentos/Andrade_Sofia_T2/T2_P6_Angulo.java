// Autor: Sofia Andrade | NRC 37712 | Fecha: 30/10/2026
// Problema 6: clasificar un angulo en grados (agudo, recto, obtuso, llano, concavo o completo).

import java.util.Locale;
import java.util.Scanner;

public class T2_P6_Angulo {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el angulo en grados: ");
        double angulo = sc.nextDouble();

        if (angulo < 0) {
            System.out.println("Error: el angulo no puede ser negativo.");
        } else {
            // si es mayor que 360 se reduce con %; un multiplo exacto de 360 es un angulo completo
            if (angulo > 360) {
                angulo = angulo % 360;
                if (angulo == 0) {
                    angulo = 360;
                }
                System.out.println("Angulo reducido: " + angulo);
            }

            if (angulo == 0) {
                System.out.println("Angulo nulo (0 grados): no esta en las categorias.");
            } else if (angulo < 90) {
                System.out.println("Agudo");
            } else if (angulo == 90) {
                System.out.println("Recto");
            } else if (angulo < 180) {
                System.out.println("Obtuso");
            } else if (angulo == 180) {
                System.out.println("Llano");
            } else if (angulo < 360) {
                System.out.println("Concavo");
            } else {
                System.out.println("Completo");
            }
        }
        sc.close();
    }
}