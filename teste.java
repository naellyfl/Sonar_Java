import java.util.Scanner;

public class CalculadoraMedia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Calculadora de Média");
        System.out.println("Digite três números:");

        System.out.print("Número 1: ");
        double numero1 = scanner.nextDouble();

        System.out.print("Número 2: ");
        double numero2 = scanner.nextDouble();

        System.out.print("Número 3: ");
        double numero3 = scanner.nextDouble();

        double media = (numero1 + numero2 + numero3) / 3;

        System.out.println("A média dos números é: " + media);

        scanner.close();
    }
}
