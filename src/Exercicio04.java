// Nome: Caio Augusto Vicente da Cruz
// Matrícula: 1261936785

import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o salário atual: ");
        double salario = scanner.nextDouble();

        double novoSalario = salario * 1.07;

        System.out.printf("Salário original: R$ %.2f%n", salario);

        System.out.printf("O Novo Salario é: R$ %.2f%n", novoSalario);

        scanner.close();

    }
}
