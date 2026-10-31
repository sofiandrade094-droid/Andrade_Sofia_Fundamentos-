//SOFIA ANDRADE
import java.util.Scanner;

public class T1_P3_Cifras {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese un numero de tres cifras: ");
        int numero = entrada.nextInt();

        int centenas = numero / 100;
        int decenas = (numero / 10) % 10;
        int unidades = numero % 10;

        System.out.println("Centenas: " + centenas);
        System.out.println("Decenas: " + decenas);
        System.out.println("Unidades: " + unidades);
        entrada.close();
    }
}