// Autor: Sofia Andrade | NRC 37712 | Fecha: 30/10/2026
// Ejercicio 4: leer un numero impar positivo n (validado con do-while) y dibujar un rombo de n filas.

import java.util.Scanner;

public class Lab2_E4_Andrade {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int n;

        do {
            System.out.print("Ingrese un numero impar positivo: ");
            n = entrada.nextInt();
            if (n <= 0 || n % 2 == 0) {
                System.out.println("Valor invalido. Intente de nuevo.");
            }
        } while (n <= 0 || n % 2 == 0);

        int mitad = n / 2;

        for (int fila = 0; fila < n; fila++) {
            int d = (fila <= mitad) ? fila : n - 1 - fila;
            int espacios = mitad - d;
            int asteriscos = 2 * d + 1;

            for (int e = 0; e < espacios; e++) {
                System.out.print(" ");
            }
            for (int a = 0; a < asteriscos; a++) {
                System.out.print("*");
            }
            System.out.println();
        }
        entrada.close();
    }
}

