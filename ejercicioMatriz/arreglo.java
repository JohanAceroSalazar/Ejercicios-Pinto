package ejercicioMatriz;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class arreglo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[][] matriz = new String[3][3];
        int[][] matrizInt = new int[3][3];
        Random random = new Random();

        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
            int numero = random.nextInt(5) + 1;         
            matriz[i][j] = String.valueOf(numero);
            System.out.println(matriz[i][j]);
            }
        }
        System.out.println("Matriz generada: ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrizInt[i][j] = Integer.parseInt(matriz[i][j]);
                System.out.print(matrizInt[i][j] + " ");
            }
            System.out.println();
        }
        ArrayList<Integer> todosLosNumeros = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                todosLosNumeros.add(matrizInt[i][j]);
            }
        }

        System.out.println("Ingrese un numero de 1 a 45");
            int numero = sc.nextInt();
            
        boolean encontrado = false;
        int n = todosLosNumeros.size();

        for (int selector = 1; selector < (1 << n); selector++) {
            ArrayList<Integer> combinacion = new ArrayList<>();
            int suma = 0;

            for (int k = 0; k < n; k++) {
                if ((selector & (1 << k)) != 0) {
                    suma += todosLosNumeros.get(k);
                    combinacion.add(todosLosNumeros.get(k));
                }
            }

            if (suma == numero) {
                System.out.println("Combinación encontrada que suma " + numero + ":");
                System.out.println(combinacion);
                encontrado = true;
                break; 
            }
        }
        if (!encontrado) {
            System.out.println("No se encontró ninguna combinación que sume " + numero);
        }
    }
}