import java.util.Scanner;

public class exerciseEight {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double AA, AB, OA, OB, D;

        System.out.println("Abcisa A: ");
            AA = scanner.nextInt();

        System.out.println("Abcisa B: ");
            AB = scanner.nextInt();

        System.out.println("Ordenada A: ");
            OA = scanner.nextInt();

        System.out.println("Ordenada B: ");
            OB = scanner.nextInt();

        D = Math.pow(AB - AA, 2) + Math.pow(OB - OA, 2);

        System.out.println("Distancia: " + D);
        scanner.close();
    }
}