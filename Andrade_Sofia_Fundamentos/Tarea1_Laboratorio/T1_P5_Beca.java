//SOFIA ANDRADE
import java.util.Scanner;
import java.util.Locale;

public class T1_P5_Beca {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese la edad: ");
        int edad = entrada.nextInt();
        System.out.print("Ingrese el promedio: ");
        double promedio = entrada.nextDouble();

        System.out.println(edad <= 25 && promedio >= 8.5);
         entrada.close();
    }
}