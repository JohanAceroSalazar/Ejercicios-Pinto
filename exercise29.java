import java.util.Scanner;

public class exercise29 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int candidato1 = 0;
        int candidato2 = 0;
        int candidato3 = 0;
        int nuloBlanco = 0;
        int voto, ganador, contador;

        for (contador = 1; contador <= 8; contador++) {
            System.out.print("Ingrese el voto del elector" + contador + ": ");
            voto = scanner.nextInt();

            if (voto == 1) {
                candidato1++;
            } else if (voto == 2) {
                candidato2++;
            } else if (voto == 3) {
                candidato3++;
            } else {
                nuloBlanco++;
            }
        }

        if (candidato1 > candidato2 && candidato1 > candidato3) {
            ganador = 1;
        } else if (candidato2 > candidato1 && candidato2 > candidato3) {
            ganador = 2;
        } else if (candidato3 > candidato1 && candidato3 > candidato2) {
            ganador = 3;
        } else {
            ganador = 0; 
        }

        System.out.println("Resultados del escrutinio:");
        System.out.println("Candidato 1: " + candidato1 + " votos");
        System.out.println("Candidato 2: " + candidato2 + " votos");
        System.out.println("Candidato 3: " + candidato3 + " votos");
        System.out.println("Votos nulos o en blanco: " + nuloBlanco);

        if (ganador == 0) {
            System.out.println("No hay un ganador claro, hubo un empate");
        } else {
            System.out.println("El ganador es el Candidato " + ganador);
        }
    }
}