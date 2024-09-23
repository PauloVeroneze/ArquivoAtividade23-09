import java.util.Scanner;

public class Fatorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário que insira um número
        System.out.print("Digite um número para calcular o fatorial: ");
        int numero = scanner.nextInt();

        int fatorial = 1;
        int i = numero;

        // Loop do-while para calcular o fatorial
        do {
            fatorial *= i; // Multiplica o valor atual do fatorial pelo valor de i
            i--;           // Decrementa i
        } while (i > 0);

        // Exibe o resultado
        System.out.println("O fatorial de " + numero + " é: " + fatorial);

        scanner.close();
    }
}
