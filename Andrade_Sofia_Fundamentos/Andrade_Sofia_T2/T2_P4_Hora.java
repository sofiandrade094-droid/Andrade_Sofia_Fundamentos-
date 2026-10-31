// Autor: Sofia Andrade | NRC 37712 | Fecha: 30/10/2026
// Problema 4: leer una hora hh mm ss y mostrar la hora un segundo despues.

import java.util.Scanner;

public class T2_P4_Hora {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese la hora (hh mm ss): ");
        int hh = sc.nextInt();
        int mm = sc.nextInt();
        int ss = sc.nextInt();

        // validacion de rangos: hh 0-23, mm 0-59, ss 0-59
        if (hh < 0 || hh > 23 || mm < 0 || mm > 59 || ss < 0 || ss > 59) {
            System.out.println("Error: hora fuera de rango.");
        } else {
            ss++;
            if (ss == 60) {
                ss = 0;
                mm++;
                if (mm == 60) {
                    mm = 0;
                    hh++;
                    if (hh == 24) {
                        hh = 0;
                    }
                }
            }
            System.out.printf("%02d:%02d:%02d%n", hh, mm, ss);
        }
        sc.close();
    }
}