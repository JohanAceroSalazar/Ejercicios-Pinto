import java.util.Scanner;

public class exercise21 {

    public static Principal pr = new Principal();

    public static void mayorOMenor() {

        Scanner scanner = new Scanner(System.in);

        for(pr.contador = 1; pr.contador <= 10; pr.contador++){
            System.out.println("Ingrese edad de la persona " + pr.contador + ": ");
                pr.a = scanner.nextInt();

                if (pr.a < 18){
                    pr.calcular++;
                }
                else{
                    pr.calcular2++;
                }
        }
        System.out.println("Total de personas mayores de edad: " + pr.calcular2);
        System.out.println("Total de personas menores de edad: " + pr.calcular);

        scanner.close();
    }
}