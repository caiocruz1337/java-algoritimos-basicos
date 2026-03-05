// Nome: Caio Augusto Vicente da Cruz
// Matrícula: 1261936785

import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a base (em cm): ");
        double base = scanner.nextDouble();

        System.out.println("Digite a altura (em cm): ");
        double altura = scanner.nextDouble();

        double area = base * altura;

        System.out.println("A area do retangulo é igual a: " + area + "cm2");

        scanner.close();

    }
}
