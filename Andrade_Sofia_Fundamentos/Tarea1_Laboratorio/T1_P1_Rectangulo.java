// 

import java.util.Scanner;
import java.util.Locale;

public class T1_P1_Rectangulo {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner entrada = new Scanner(System.in);

        double base, altura, area, perimetro;

        System.out.print("Ingrese la base: ");
        base = entrada.nextDouble();
        System.out.print("Ingrese la altura: ");
        altura = entrada.nextDouble();

        area = base * altura;
        perimetro = 2 * (base + altura);

        System.out.println("Area: " + area);
        System.out.println("Perimetro: " + perimetro);
        entrada.close();
    }
}