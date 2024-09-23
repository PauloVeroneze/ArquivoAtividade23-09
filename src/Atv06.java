import java.util.Scanner;

class MediaNumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário o número de entradas
        System.out.print("Quantos números você deseja inserir? ");
        int n = scanner.nextInt();

        double soma = 0;

        // Loop para inserir os números e calcular a soma
        for (int i = 1; i <= n; i++) {
            System.out.print("Digite o número " + i + ": ");
            double numero = scanner.nextDouble();
            soma += numero; // Soma os números fornecidos
        }

        // Calcula a média
        double media = soma / n;

        // Exibe a média
        System.out.println("A média dos números inseridos é: " + media);

        scanner.close();
    }
}
