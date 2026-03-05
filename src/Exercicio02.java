// Nome: Caio Augusto Vicente da Cruz
// Matrícula: 1261936785

import java.util.Scanner;

public class Exercicio02 {
        public static void main(String[] args) throws Exception {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o x: ");
        int x = scanner.nextInt();

        System.out.println("Digite o y: ");
        int y = scanner.nextInt();

        int restoDiv = x % y; 

        System.out.printf("O resto da divisão de %d por %d é: %d%n", x, y, restoDiv);

        scanner.close();
    }
}
