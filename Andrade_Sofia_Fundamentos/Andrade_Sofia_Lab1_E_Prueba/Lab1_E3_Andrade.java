// Autor: Sofia Andrade | NRC 37712 | Fecha: 30/10/2026
// Ejercicio 3: leer un entero de cuatro cifras y mostrar la suma de sus cifras, el numero invertido y si es par.

import java.util.Scanner;

public class Lab1_E3_Andrade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese un numero de cuatro cifras: ");
        int n = sc.nextInt();

        int millares = n / 1000;
        int centenas = (n / 100) % 10;
        int decenas = (n / 10) % 10;
        int unidades = n % 10;

        int suma = millares + centenas + decenas + unidades;
        // el invertido es un entero, por eso 2580 se muestra como 852 (no existe el 0 inicial)
        int invertido = unidades * 1000 + decenas * 100 + centenas * 10 + millares;
        boolean esPar = n % 2 == 0;

        System.out.println("Suma de cifras: " + suma);
        System.out.println("Invertido: " + invertido);
        System.out.println("Es par: " + esPar);

        sc.close();
    }
}