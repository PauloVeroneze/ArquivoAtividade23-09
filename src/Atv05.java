import java.util.Scanner;
import java.util.Random;

class JogoAdivinhacao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        // Gera um número aleatório entre 1 e 100
        int numeroAleatorio = random.nextInt(100) + 1;
        int palpite;

        System.out.println("Bem-vindo ao jogo de adivinhação!");
        System.out.println("Tente adivinhar o número entre 1 e 100.");

        // Loop até que o usuário adivinhe o número correto
        do {
            System.out.print("Digite seu palpite: ");
            palpite = scanner.nextInt();

            if (palpite > numeroAleatorio) {
                System.out.println("Muito alto! Tente um número menor.");
            } else if (palpite < numeroAleatorio) {
                System.out.println("Muito baixo! Tente um número maior.");
            }
        } while (palpite != numeroAleatorio); // Continua até que o palpite seja correto

        System.out.println("Parabéns! Você acertou o número: " + numeroAleatorio);

        scanner.close();
    }
}
