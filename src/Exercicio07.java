// Nome: Caio Augusto Vicente da Cruz
// Matrícula: 1261936785

import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a distancia percorrida em (km): ");
        double distancia = scanner.nextDouble();

        System.out.println("Combustível gasto (litros): ");
        double combustivel = scanner.nextDouble();

        double consumoMedio = distancia / combustivel;

        System.out.println("Consumo medio: " + consumoMedio +  "km/l");

        scanner.close();

    }
}
