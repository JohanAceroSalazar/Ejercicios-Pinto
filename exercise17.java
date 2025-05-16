import java.util.Scanner;

public class exercise17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numeroEntero, numeroDecenas, numeroUnidades;

        System.out.println("Numero entero: ");
            numeroEntero = scanner.nextInt();

        numeroDecenas =  numeroEntero / 10;
        numeroUnidades = numeroEntero - (numeroDecenas * 10);

        System.out.println("Numero de decenas: " + numeroDecenas);
        System.out.println("Numero de unidades: " + numeroUnidades);

        scanner.close();
    }
}
