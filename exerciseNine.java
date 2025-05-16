import java.util.Scanner;

public class exerciseNine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int AN, AA, E;

        System.out.println("Año de nacimiento: ");
            AN = scanner.nextInt();

        System.out.println("Año actual: ");
            AA = scanner.nextInt();

        E = AA - AN;

        if(E > 17){
            System.out.println("Debe solicitar su CUIL");
        }
        else{
            System.out.println("No debes solicitar su CUIL aun");

        scanner.close();
        }
    }
}