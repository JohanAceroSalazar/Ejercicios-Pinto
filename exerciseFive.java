import java.util.Scanner;

public class exerciseFive {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int HL, TH, P;

        System.out.println("Horas laboradas: ");
            HL = scanner.nextInt();

        System.out.println("Tarifa por hora: ");
            TH = scanner.nextInt();

        P = HL * TH;

        System.out.println("Planilla: " + P);

        scanner.close();
    }
}