import java.util.Scanner;

public class StrcFor3 {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número inteiro: ");
            int numero = scanner.nextInt();

        System.out.println("A tabela de 1 a " + numero + " ao quadrado é: ");
            for (int a = 1; a <= numero; a++) {
                int quadrado = a * a;
        System.out.println(a + "² = " + quadrado);
        }

        scanner.close();

    }
}