// Nome: Caio Augusto Vicente da Cruz
// Matrícula: 1261936785

import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Distancia (km): ");
        double distancia = scanner.nextDouble();

        System.out.println("Velocidade média (km/h): ");
        double velocidade = scanner.nextDouble();

        double tempoHoras = distancia / velocidade;
        int horas = (int) tempoHoras;
        int minutos = (int) ((tempoHoras - horas) * 60);

        System.out.println("Tempo estimado: " + horas + " horas e " + minutos + " minutos ");

        scanner.close();


    }
}
