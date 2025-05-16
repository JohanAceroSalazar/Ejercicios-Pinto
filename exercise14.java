import java.util.Scanner;

public class exercise14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numeroEntero;

        System.out.println("numero Entero: ");
            numeroEntero = scanner.nextInt(); 

        switch (numeroEntero) {
            case 1: 
                System.out.println("Numero Romano: I");
                break;
            case 2: 
                System.out.println("Numero Romano: II");
                break;
            case 3: 
                System.out.println("Numero Romano: III");
                break;
            case 4: 
                System.out.println("Numero Romano: IV");
                break;
            case 5: 
                System.out.println("Numero Romano: V");
                break;
            case 6:
                System.out.println("Numero Romano: VI");
                break;
            case 7: 
                System.out.println("Numero Romano: VII");
                break;
            case 8: 
                System.out.println("Numero Romano: VIII");
                break;
            case 9: 
                System.out.println("Numero Romano: IX");
                break;
            case 10: 
                System.out.println("Numero Romano: X");
                break;
            default:
                System.out.println("Numero incorrecto");
                break;
        }
        scanner.close();
    }
}