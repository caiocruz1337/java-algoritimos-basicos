// Nome: Caio Augusto Vicente da Cruz
// Matrícula: 1261936785

import java.util.Scanner;

public class Exercicio08 {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a temperatura em Celsius: ");

        double celsius = scanner.nextDouble();

        double fahrenheit = (celsius * (9.0/5)) + 32;

        double kelvin = celsius + 273.15;

        System.out.println("Fahrenheit: " + fahrenheit + " F");
        System.out.println("Kelvin: " + kelvin + " K");

        scanner.close();

    }
}