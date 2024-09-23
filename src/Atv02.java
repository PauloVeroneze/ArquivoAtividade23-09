import java.util.Scanner;

class ContagemRegressiva {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário um número inicial
        System.out.print("Digite um número inicial: ");
        int numero = scanner.nextInt();

        // Loop while para contagem regressiva até 0
        while (numero >= 0) {
            System.out.println(numero);
            numero--; // Decrementa o número a cada iteração
        }

        scanner.close();
    }
}
