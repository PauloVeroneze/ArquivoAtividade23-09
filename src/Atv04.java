import java.util.Scanner;

class ValidarIdade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int idade;

        // Loop do-while para solicitar uma idade válida
        do {
            System.out.print("Digite sua idade (maior que 0): ");
            idade = scanner.nextInt();

            if (idade <= 0) {
                System.out.println("Idade inválida. Tente novamente.");
            }
        } while (idade <= 0); // Repete o loop enquanto a idade for inválida

        // Exibe a idade válida fornecida
        System.out.println("Idade válida fornecida: " + idade);

        scanner.close();
    }
}
