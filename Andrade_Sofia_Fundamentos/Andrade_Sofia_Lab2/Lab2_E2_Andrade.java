// Autor: Sofia Andrade | NRC 37712 | Fecha: 30/10/2026
// Ejercicio 2: leer temperaturas hasta ingresar un valor negativo (centinela) y mostrar
// cantidad de lecturas, promedio, maximo y minimo con 2 decimales.

import java.util.Locale;
import java.util.Scanner;

public class Lab2_E2_Andrade {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner entrada = new Scanner(System.in);

        int contador = 0;
        double suma = 0;
        double maximo = 0;
        double minimo = 0;

        System.out.print("Ingrese una lectura (negativo para terminar): ");
        double lectura = entrada.nextDouble();

        while (lectura >= 0) {
            if (contador == 0) {
                maximo = lectura;
                minimo = lectura;
            } else {
                if (lectura > maximo) {
                    maximo = lectura;
                }
                if (lectura < minimo) {
                    minimo = lectura;
                }
            }
            contador++;
            suma += lectura;

            System.out.print("Ingrese una lectura (negativo para terminar): ");
            lectura = entrada.nextDouble();
        }

        if (contador == 0) {
            System.out.println("No hubo lecturas validas.");
        } else {
            System.out.printf("Lecturas: %d Promedio: %.2f Max: %.2f Min: %.2f%n",
                    contador, suma / contador, maximo, minimo);
        }
        entrada.close();
    }
}
