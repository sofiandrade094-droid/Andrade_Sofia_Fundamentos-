// Autor: Sofia Andrade | NRC 37712 | Fecha: 30/10/2026
// Problema 2: total a pagar por sacos de cemento con descuento por volumen e IVA del 15%.

import java.util.Locale;
import java.util.Scanner;

public class T2_P2_Descuento {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        final double PRECIO_SACO = 8.50;
        final double DESC_MEDIO = 0.05;   // 21 a 50 sacos
        final double DESC_ALTO = 0.10;    // mas de 50 sacos
        final double IVA = 0.15;

        System.out.print("Ingrese la cantidad de sacos: ");
        int sacos = sc.nextInt();

        if (sacos <= 0) {
            System.out.println("Error: la cantidad debe ser mayor que cero.");
        } else {
            double porcentaje;
            if (sacos <= 20) {
                porcentaje = 0;
            } else if (sacos <= 50) {
                porcentaje = DESC_MEDIO;
            } else {
                porcentaje = DESC_ALTO;
            }

            double subtotal = sacos * PRECIO_SACO;
            double descuento = subtotal * porcentaje;
            double baseImponible = subtotal - descuento;
            double valorIva = baseImponible * IVA;
            double total = baseImponible + valorIva;

            System.out.printf("%-20s%10.2f%n", "Subtotal", subtotal);
            System.out.printf("%-20s%10.2f%n", "Descuento", descuento);
            System.out.printf("%-20s%10.2f%n", "IVA 15%", valorIva);
            System.out.printf("%-20s%10.2f%n", "TOTAL", total);
        }
        sc.close();
    }
}
