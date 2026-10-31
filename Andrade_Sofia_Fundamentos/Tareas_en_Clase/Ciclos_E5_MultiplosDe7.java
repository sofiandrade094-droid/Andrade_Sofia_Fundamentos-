// Autor: Sofia Andrade | NRC 37712 | Fecha: 30/10/2026
// Ejercicio 5: imprimir los multiplos de 7 entre 1 y 100 y cuantos son.

public class Ciclos_E5_MultiplosDe7 {
    public static void main(String[] args) {
        int cantidad = 0;

        System.out.println("Multiplos de 7 entre 1 y 100:");
        // for: el rango es conocido (1 a 100)
        for (int i = 1; i <= 100; i++) {
            if (i % 7 == 0) {
                System.out.print(i + " ");
                cantidad++;
            }
        }
        System.out.println();
        System.out.println("Cantidad: " + cantidad);
    }
}