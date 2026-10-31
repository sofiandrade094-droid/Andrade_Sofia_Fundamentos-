// Autor: Sofia Andrade | NRC 37712 | Fecha: 30/10/2026
// Ejercicio 2: anio bisiesto = divisible para 4 y no para 100, o divisible para 400.

import java.util.Scanner;

public class Guiada_E2_Bisiesto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese un anio: ");
        int anio = sc.nextInt();

        if (anio <= 0) {
            System.out.println("Error: el anio debe ser positivo.");
        } else {
            boolean bisiesto = (anio % 4 == 0 && anio % 100 != 0) || anio % 400 == 0;

            if (bisiesto) {
                System.out.println(anio + " es bisiesto");
            } else {
                System.out.println(anio + " no es bisiesto");
            }
        }
        sc.close();
    }
}