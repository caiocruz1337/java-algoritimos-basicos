// Nome: Caio Augusto Vicente da Cruz
// Matrícula: 1261936785

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) throws Exception {
      
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        double numero1= scanner.nextDouble();

        System.out.println("Digite o segundo número: ");
        double numero2= scanner.nextDouble();

        double soma = numero1 + numero2;
        double sub = numero1 - numero2;
        double mult = numero1 * numero2;
        double div = numero1 / numero2;

        System.out.println("Adição: " + soma);
        System.out.println("Subtração: " + sub);
        System.out.println("Multiplicação: " + mult);
        System.out.println("Divisão: " + div);

        scanner.close();
    }
}
