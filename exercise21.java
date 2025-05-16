import java.util.Scanner;

public class exercise21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int edadPersona, contador;
        int menores = 0;
        int mayores = 0;

        for(contador = 1; contador <= 200; contador++){
            System.out.println("Ingrese edad de las personas: " + contador + ": ");
                edadPersona = scanner.nextInt();
                if (edadPersona < 18){
                    menores = menores + 1;
                }
                else{
                    mayores = mayores + 1;
                }
        }
        System.out.println("Total de personas mayores de edad: " + mayores);
        System.out.println("Total de personas menores de edad: " + menores);
        
    }
}