import java.util.Scanner;

public class exercise18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numeroEntero, cocienteEntero, residuo;

        System.out.println("Numero (diferente a cero):");
            numeroEntero = scanner.nextInt();

        cocienteEntero = numeroEntero / 2;
        residuo = numeroEntero - (cocienteEntero * 2);

        if (residuo == 0) {
            System.out.println("El numero es par");
        } 
        else{
            System.out.println("El numero es impar");
        }
        scanner.close();
    }
}