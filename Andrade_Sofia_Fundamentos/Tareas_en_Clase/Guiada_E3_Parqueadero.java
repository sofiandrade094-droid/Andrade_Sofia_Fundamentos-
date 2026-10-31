// Autor: Sofia Andrade | NRC 37712 | Fecha: 30/10/2026
// Ejercicio 3: tarifa de parqueadero: primera hora $1.00, cada hora adicional $0.50, tope diario $6.00.

import java.util.Locale;
import java.util.Scanner;

public class Guiada_E3_Parqueadero {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        final double PRIMERA_HORA = 1.00;
        final double HORA_ADICIONAL = 0.50;
        final double TOPE_DIARIO = 6.00;

        System.out.print("Ingrese las horas de parqueo (1 a 24): ");
        int horas = sc.nextInt();

        if (horas < 1 || horas > 24) {
            System.out.println("Error: las horas deben estar entre 1 y 24.");
        } else {
            double tarifa = PRIMERA_HORA + (horas - 1) * HORA_ADICIONAL;

            // el valor a pagar nunca supera el tope diario
            if (tarifa > TOPE_DIARIO) {
                tarifa = TOPE_DIARIO;
            }
            System.out.printf("Horas: %d  Total a pagar: $%.2f%n", horas, tarifa);
        }
        sc.close();
    }
}