// Autor: Sofia Andrade | NRC 37712 | Fecha: 30/10/2026
// Problema 1: resistencia equivalente de dos resistencias en serie (S) o paralelo (P).

import java.util.Locale;
import java.util.Scanner;

public class T2_P1_Resistencias {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese la resistencia 1 (ohmios): ");
        double r1 = sc.nextDouble();
        System.out.print("Ingrese la resistencia 2 (ohmios): ");
        double r2 = sc.nextDouble();

        // validacion: las resistencias deben ser positivas
        if (r1 <= 0 || r2 <= 0) {
            System.out.println("Error: las resistencias deben ser positivas.");
        } else {
            System.out.print("Conexion en serie (S) o paralelo (P): ");
            char tipo = Character.toUpperCase(sc.next().charAt(0));

            switch (tipo) {
                case 'S':
                    System.out.printf("Resistencia equivalente en serie: %.2f ohmios%n", r1 + r2);
                    break;
                case 'P':
                    System.out.printf("Resistencia equivalente en paralelo: %.2f ohmios%n", (r1 * r2) / (r1 + r2));
                    break;
                default:
                    System.out.println("Error: tipo de conexion invalido. Use S o P.");
            }
        }
        sc.close();
    }
}