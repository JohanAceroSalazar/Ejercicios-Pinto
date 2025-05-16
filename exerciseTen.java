import java.util.Scanner;

public class exerciseTen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int E1, E2, D1, D2;

        System.out.println("Edad primer hermano: ");
            E1 = scanner.nextInt();

        System.out.println("Edad segundo hermano: ");
            E2 = scanner.nextInt();

        D1 = E1 - E2;
        D2 = E2 - E1;

        if(E1 > E2){
            System.out.println("El primer hermano es el mayor, por: " + D1);
        }
        else{
            System.out.println("El segundo hermano es el mayor, por: " + D2);

        scanner.close();
        }
    }
}
