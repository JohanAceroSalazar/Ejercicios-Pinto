import java.util.Scanner;

public class exerciseSix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double ladoA, ladoB, ladoC, LS, AT;

        System.out.println("Longitud lado A: ");
            ladoA = scanner.nextInt();

        System.out.println("Longitud lado B: ");
            ladoB = scanner.nextInt();

        System.out.println("Longitud lado C: ");
            ladoC = scanner.nextInt();

        LS = (ladoA + ladoB + ladoC) / 2;
        AT = Math.sqrt (LS * (LS - ladoA) * (LS - ladoB) * (LS - ladoC));

        System.out.println("Area del triangulo: " + AT);

        scanner.close();
    }
}