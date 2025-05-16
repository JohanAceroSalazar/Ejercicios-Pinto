import java.util.Scanner;

public class exercise11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int PL, PMa, PMi, PJ, PV, PS, PT, PP;

        System.out.println("Produccion dia lunes: ");
            PL = scanner.nextInt();

        System.out.println("Produccion dia martes: ");
            PMa = scanner.nextInt();

        System.out.println("Produccion dia miercoles: ");
            PMi = scanner.nextInt();

        System.out.println("Produccion dia jueves: ");
            PJ = scanner.nextInt();

        System.out.println("Produccion dia viernes: ");
            PV = scanner.nextInt();

        System.out.println("Produccion dia sabado: ");
            PS = scanner.nextInt();

        PT = (PL + PMa + PMi + PJ + PV + PS);
        PP = PT / 6;

        if(PP >= 100){
            System.out.println("Recibira incentivos");
        }
        else{
            System.out.println("No recibira incentivos");
        }
        scanner.close();
    }
}
