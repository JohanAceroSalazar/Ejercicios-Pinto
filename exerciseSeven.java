import java.util.Scanner;

public class exerciseSeven {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double MG, GB, CD;

        System.out.print("Ingrese la GB: ");
        GB = scanner.nextInt();

        MG = GB * 1024;
        CD = Math.floor(MG / 700) + 1;

        System.out.println("Numero de CDs: " + CD);
        scanner.close();
    }
}