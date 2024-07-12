
import java.util.Scanner;

class TrataExcecao {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Digite um numerador: ");
            int numerador = scanner.nextInt();

            System.out.println("Digite um divisor: ");
            int divisor = scanner.nextInt();

            int resultado = numerador / divisor;
            System.out.println("Resultado: " + resultado);
        } catch (ArithmeticException e) {
            System.err.println("Erro na divisao dos numeros. " + e.getMessage());
        } finally {
            System.out.println("Fim do Programa.");
        }
    }
}