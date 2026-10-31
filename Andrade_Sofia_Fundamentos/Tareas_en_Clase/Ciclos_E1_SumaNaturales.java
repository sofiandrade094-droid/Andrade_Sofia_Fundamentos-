// Autor: Sofia Andrade | NRC 37712 | Fecha: 30/10/2026
// Ejercicio 1: suma de los n primeros numeros naturales y comparacion con la formula n(n+1)/2.

import java.util.Scanner;

public class Ciclos_E1_SumaNaturales {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese n (entero positivo): ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Error: n debe ser mayor que cero.");
        } else {
            // for: se conoce el numero de repeticiones (n)
            long sumaCiclo = 0;
            for (int i = 1; i <= n; i++) {
                sumaCiclo += i;
            }

            long sumaFormula = (long) n * (n + 1) / 2;

            System.out.println("Suma con ciclo: " + sumaCiclo);
            System.out.println("Suma con formula n(n+1)/2: " + sumaFormula);
            System.out.println("Coinciden: " + (sumaCiclo == sumaFormula));
        }
        sc.close();
    }
}