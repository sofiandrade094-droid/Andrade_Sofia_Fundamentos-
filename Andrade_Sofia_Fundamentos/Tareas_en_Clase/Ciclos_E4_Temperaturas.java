// Autor: Sofia Andrade | NRC 37712 | Fecha: 30/10/2026
// Ejercicio 4: leer temperaturas hasta -999 (centinela) y mostrar la mayor, la menor y el promedio.

import java.util.Locale;
import java.util.Scanner;

public class Ciclos_E4_Temperaturas {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        final double CENTINELA = -999;
        int contador = 0;
        double suma = 0;
        double mayor = 0;
        double menor = 0;

        System.out.print("Ingrese una temperatura (-999 para terminar): ");
        double temp = sc.nextDouble();

        // while con centinela: no se sabe cuantas lecturas habra
        while (temp != CENTINELA) {
            if (contador == 0) {
                mayor = temp;
                menor = temp;
            } else {
                if (temp > mayor) {
                    mayor = temp;
                }
                if (temp < menor) {
                    menor = temp;
                }
            }
            suma += temp;
            contador++;

            System.out.print("Ingrese una temperatura (-999 para terminar): ");
            temp = sc.nextDouble();
        }

        if (contador == 0) {
            System.out.println("No se ingresaron temperaturas.");
        } else {
            System.out.printf("Mayor: %.2f  Menor: %.2f  Promedio: %.2f%n", mayor, menor, suma / contador);
        }
        sc.close();
    }
}