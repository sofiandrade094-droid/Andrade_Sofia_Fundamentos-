// sofia andrade
import java.util.Scanner;

public class T1_P2_PAR {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese un numero entero: ");
        int numero = entrada.nextInt();

        System.out.println(numero % 2 == 0);
        entrada.close();
    }
}