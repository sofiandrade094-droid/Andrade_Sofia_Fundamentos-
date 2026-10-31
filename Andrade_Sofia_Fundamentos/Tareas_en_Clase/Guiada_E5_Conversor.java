// Autor: Sofia Andrade | NRC 37712 | Fecha: 30/10/2026
// Ejercicio 5: menu con switch para convertir unidades: 1) m a ft, 2) kg a lb, 3) C a F.

import java.util.Locale;
import java.util.Scanner;

public class Guiada_E5_Conversor {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("--- CONVERSOR DE UNIDADES ---");
        System.out.println("1) Metros a pies (m -> ft)");
        System.out.println("2) Kilogramos a libras (kg -> lb)");
        System.out.println("3) Celsius a Fahrenheit (C -> F)");
        System.out.print("Opcion: ");
        int opcion = sc.nextInt();

        switch (opcion) {
            case 1:
                System.out.print("Ingrese los metros: ");
                double metros = sc.nextDouble();
                System.out.printf("%.2f m = %.2f ft%n", metros, metros * 3.28084);
                break;
            case 2:
                System.out.print("Ingrese los kilogramos: ");
                double kilos = sc.nextDouble();
                System.out.printf("%.2f kg = %.2f lb%n", kilos, kilos * 2.20462);
                break;
            case 3:
                System.out.print("Ingrese los grados Celsius: ");
                double celsius = sc.nextDouble();
                System.out.printf("%.2f C = %.2f F%n", celsius, celsius * 9.0 / 5.0 + 32);
                break;
            default:
                System.out.println("Opcion invalida");
        }
        sc.close();
    }
}