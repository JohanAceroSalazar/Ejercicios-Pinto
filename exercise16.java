import java.util.Scanner;

public class exercise16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numeroEntero;

        System.out.println("Numero Entero: ");
            numeroEntero = scanner.nextInt();

        switch (numeroEntero) {
            case 1:
                System.out.println("Vocal: A");
                break;
            case 2:
                System.out.println("Vocal: E");
                break;
            case 3:
                System.out.println("Vocal: I");
                break;
            case 4:
                System.out.println("Vocal: O");
                break;
            case 5:
                System.out.println("Vocal: U");
                break;
            default:
                System.out.println("Valor Incorrecto");
                break;
        }
        scanner.close();
    }
}