// Autor: Sofia Andrade | NRC 37712 | Fecha: 30/10/2026
// Ejercicio 4: leer producto, cantidad y precio unitario; calcular subtotal, IVA (15%) y total en columnas alineadas.

import java.util.Locale;
import java.util.Scanner;

public class Lab1_E4_Andrade {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        final double IVA = 0.15;

        // el nombre se lee primero con nextLine() porque puede tener espacios
        System.out.print("Ingrese el nombre del producto: ");
        String producto = sc.nextLine();
        System.out.print("Ingrese la cantidad: ");
        int cantidad = sc.nextInt();
        System.out.print("Ingrese el precio unitario: ");
        double precio = sc.nextDouble();

        double subtotal = cantidad * precio;
        double valorIva = subtotal * IVA;
        double total = subtotal + valorIva;

        System.out.println();
        System.out.println("Producto: " + producto);
        System.out.printf("%-25s%10.2f%n", "Subtotal", subtotal);
        System.out.printf("%-25s%10.2f%n", "IVA 15%", valorIva);
        System.out.printf("%-25s%10.2f%n", "TOTAL", total);

        sc.close();
    }
}