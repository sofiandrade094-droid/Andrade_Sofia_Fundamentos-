// Autor: Sofia Andrade | NRC 37712 | Fecha: 30/10/2026
// Ejercicio 2: factorial de n validando que n >= 0 con do-while.

import java.util.Scanner;

public class Ciclos_E2_Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;

        // do-while: se pide el dato al menos una vez y se repite mientras sea invalido.
        // Se limita a 20 porque 21! ya no cabe en un long (y 13! ya no cabe en un int).
        do {
            System.out.print("Ingrese n (entre 0 y 20): ");
            n = sc.nextInt();
            if (n < 0 || n > 20) {
                System.out.println("Valor invalido. Intente de nuevo.");
            }
        } while (n < 0 || n > 20);

        long factorial = 1;   // 0! = 1 (el ciclo no se ejecuta cuando n = 0)
        for (int i = 2; i <= n; i++) {
            factorial *= i;
        }

        System.out.println(n + "! = " + factorial);
        sc.close();
    }
}