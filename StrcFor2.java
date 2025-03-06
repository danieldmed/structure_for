import java.util.Scanner;

public class StrcFor2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número de 1 a 10 para ver a tabuada:");
        int numero = scanner.nextInt();

        if (numero < 1 || numero > 10) {
            System.out.println("Digite um número válido! (1 a 10)");
        } else {
            System.out.println("A tabuada de " + numero + " é:");
        }
        for (int a = 1; a <= 10; a++) {
            int resultado = numero * a;
            System.out.println(numero + " x " + a + " = " + resultado);
        }
    }
}