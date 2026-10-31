// Autor: Sofia Andrade | NRC 37712 | Fecha: 30/10/2026
// Ejercicio 1: imprimir la tabla de multiplicar del 1 al 10 en matriz de 10x10, alineada a la derecha.

public class Lab2_E1_Andrade {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.printf("%4d", i * j);
            }
            System.out.println();
        }
    }
}