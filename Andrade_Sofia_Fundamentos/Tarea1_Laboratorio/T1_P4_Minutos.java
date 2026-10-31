//SOFIA ANDRADE
import java.util.Scanner;

public class T1_P4_Minutos {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese los minutos: ");
        int minutos = entrada.nextInt();

        int horas = minutos / 60;
        int resto = minutos % 60;

        System.out.println("Horas: " + horas);
        System.out.println("Minutos restantes: " + resto);
        entrada.close();
    }
}