import java.util.Scanner;

public class exerciseFour {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int PG, PE, PP, PPG, PPE, PT;

        System.out.println("Numero de partidos ganados: ");
            PG = scanner.nextInt();

        System.out.println("Numero de partidos empatados: ");
            PE = scanner.nextInt();

        System.out.println("Numero de partidos perdidos: ");
            PP = scanner.nextInt();

        PPG = PG * 3;
        PPE = PE * 1;
        PT = PPG + PPE;

        System.out.println("Puntaje Total: " + PT);

        scanner.close();
        }
    }