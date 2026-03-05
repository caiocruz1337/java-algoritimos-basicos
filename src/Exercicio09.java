// Nome: Caio Augusto Vicente da Cruz
// Matrícula: 1261936785

import java.util.Scanner;

public class Exercicio09 {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Preço do produto: ");
        double preco = scanner.nextDouble();

        System.out.println("Valor pago: ");
        double valorPago = scanner.nextDouble();

         if (valorPago >=preco) {

        double troco = valorPago - preco;

        System.out.println("Troco: " + troco);

        } else {
        System.out.println("Valor pago insuficiente.");
        }

        scanner.close();

    }
}
