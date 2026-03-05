// Nome: Caio Augusto Vicente da Cruz
// Matrícula: 1261936785

import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a nota 1: ");
        double nota1 = scanner.nextDouble();

        System.out.println("Digite a nota 2: ");
        double nota2 = scanner.nextDouble();

        System.out.println("Digite a nota 2: ");
        double nota3 = scanner.nextDouble();

        double media = (nota1 + nota2 + nota3) / 3;

        System.out.printf("Média: %.2f%n", media);

        scanner.close();
    }
}