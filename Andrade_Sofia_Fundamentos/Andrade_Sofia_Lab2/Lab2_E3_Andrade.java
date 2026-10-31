// Autor: Sofia Andrade | NRC 37712 | Fecha: 30/10/2026
// Ejercicio 3: adivinar un numero aleatorio entre 1 y 100 en maximo 7 intentos,
// indicando "mas alto" o "mas bajo" en cada intento.

import java.util.Random;
import java.util.Scanner;

public class Lab2_E3_Andrade {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Random azar = new Random();

        int secreto = azar.nextInt(100) + 1;
        final int MAX_INTENTOS = 7;
        int intentos = 0;
        boolean acerto = false;

        System.out.println("Adivine el numero entre 1 y 100. Tiene " + MAX_INTENTOS + " intentos.");

        do {
            System.out.print("Intento " + (intentos + 1) + ": ");
            int numero = entrada.nextInt();
            intentos++;

            if (numero == secreto) {
                acerto = true;
            } else if (numero < secreto) {
                System.out.println("Mas alto");
            } else {
                System.out.println("Mas bajo");
            }
        } while (!acerto && intentos < MAX_INTENTOS);

        if (acerto) {
            System.out.println("Acerto en " + intentos + " intentos.");
        } else {
            System.out.println("Perdio. El numero era " + secreto + ".");
        }
        entrada.close();
    }
}