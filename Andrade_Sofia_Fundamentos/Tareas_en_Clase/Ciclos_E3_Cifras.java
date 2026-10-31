// Autor: Sofia Andrade | NRC 37712 | Fecha: 30/10/2026
// Ejercicio 3: contar las cifras de un entero y calcular su suma (while con n /= 10).

import java.util.Scanner;

public class Ciclos_E3_Cifras {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese un numero entero: ");
        int numero = sc.nextInt();

        int n = Math.abs(numero);   // se trabaja con el valor absoluto
        int cantidad = 0;
        int suma = 0;

        if (n == 0) {
            cantidad = 1;           // el 0 tiene una cifra
        }

        // while: no se sabe cuantas cifras tiene el numero
        while (n > 0) {
            suma += n % 10;         // ultima cifra
            cantidad++;
            n /= 10;                // se elimina la ultima cifra
        }

        System.out.println("Cantidad de cifras: " + cantidad);
        System.out.println("Suma de cifras: " + suma);
        sc.close();
    }
}