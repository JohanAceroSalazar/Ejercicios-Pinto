import java.util.Scanner;

public class exercise13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int L1, L2, L3;
        String TT;

        System.out.println("Lado uno: ");
            L1 = scanner.nextInt();

        System.out.println("Lado dos: ");
            L2 = scanner.nextInt();

        System.out.println("Lado tres: ");
            L3 = scanner.nextInt();

        if (L1 != L2 && L2 != L3 && L3 != L1){
            TT = "Escaleno";
        } 
        else if(L1 == L2 && L2 == L3){
            TT = "Equilátero";
        } 
        else {
            TT = "Isósceles";
        }
        System.out.println("Tipo de triangulo: " + TT);

        scanner.close();
    }
}