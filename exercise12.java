import java.util.Scanner;

public class exercise12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N1, N2, N3; 
        String NM;

        System.out.println("Primer numero: ");
            N1 = scanner.nextInt();

        System.out.println("Segundo numero: ");
            N2 = scanner.nextInt();

        System.out.println("Tercer numero: ");
            N3 = scanner.nextInt();

        if(N1 > N2 && N1 > N3){
            NM = "Primer numero";
        }
        else if(N2 > N3){
            NM = "Segundo numero";
        }
        else{
            NM = "Tercer numero";
        }
        System.out.println("Numero Mayor: " + NM);

        scanner.close();
    }
}