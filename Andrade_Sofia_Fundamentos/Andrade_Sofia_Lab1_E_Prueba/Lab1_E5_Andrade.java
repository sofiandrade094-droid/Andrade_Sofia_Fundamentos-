// Autor: Sofia Andrade | NRC 37712 | Fecha: 30/10/2026
// Ejercicio 5: imprimir el valor de cuatro expresiones para compararlo con la evaluacion a mano.

public class Lab1_E5_Andrade {
    public static void main(String[] args) {
        int a = 9, b = 4;

        System.out.println("1. a / b + a % b * 2 = " + (a / b + a % b * 2));
        System.out.println("2. 10 - 3 * 2 > 3 && 5 % 2 == 1 = " + (10 - 3 * 2 > 3 && 5 % 2 == 1));
        System.out.println("3. (double) 7 / 2 + 7 / 2 = " + ((double) 7 / 2 + 7 / 2));
        System.out.println("4. !(4 >= 4) || 2 * 3 != 6 = " + (!(4 >= 4) || 2 * 3 != 6));
    }
}