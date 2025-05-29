import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

public class swicthEjercicios {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            int opcion, estado = 0, a, b, c, d, calculate;
            double A, B, C, D, lineal, cuadratica, logLineal ,logCuadratica;

        do{
        System.out.println("Seleccione un ejercicio:");
        System.out.println("1. diferencia de f(n) y g(n)");
        System.out.println("2. log(a) / log(b)");
        System.out.println("3. Comparador de funciones");
        System.out.println("4. Calcular el orden exacto funcion t(n)");
        System.out.println("5. Un numero es triangular");
        System.out.println("6. Programa de entrada despues de 3 horas");
        System.out.println("7. Programa de entrada 100 veces mas rapida");
        System.out.println("8. Valores maximo y minimo de un vector");
        System.out.println("9. ");
        System.out.println("0 salir");
        System.out.print("Opción: ");

        opcion = scanner.nextInt();

        switch (opcion) {
            case 1:{  
                System.out.println("Ingrese un valor para n: ");
                a = scanner.nextInt();
                System.out.println("coeficiente de b para f(n) = b*n: ");
                b = scanner.nextInt();//b * n
                System.out.println("constante c de f(n) = b*n + c: ");
                c = scanner.nextInt();

                //f(n) = b*n + c
                calculate = b * a + c;
                //g(n)= n
                d = a;
                //Diferencia f(n) - g(n)
                D = calculate - d;

                System.out.println("Resultados: ");
                System.out.println("f(n) = " + b + "*n + " + c + " = " + calculate);
                System.out.println("g(n) = n = " + d);
                System.out.println("f(n) - h(n) = " + D);
                
                if (D == 5) {
                    System.out.println("La diferencia constante es (5), entonces f(n) es o(n).");//crecimiento más lento que n sentido asintotico
                } else if (D == a || D == b * a) {
                    System.out.println("La diferencia crece proporcionalmente con n, entonces f(n) es 0(n).");//crecimiento del mismo orden
                } else {
                    System.out.println("Analizar el comportamiento según los valores de b y c.");
                }
            break;}

            case 2:{
                System.out.print("Ingrese el valor de a: ");
                a = scanner.nextInt();
                System.out.print("Ingrese la base b: ");
                b = scanner.nextInt();

                if (a > 0 && b > 1) {
                D = Math.log(a) / Math.log(b); 
                    System.out.println("Resultado: " + D);
                } else {
                    System.out.println("Error: a debe ser > 0 y b debe ser > 1.");
                }
            break;}

            case 3:{
                System.out.print("Ingrese valor de n: ");
                A = scanner.nextInt();
                System.out.println("Ingrese base logarítmica: ");
                B = scanner.nextInt();

                lineal = A;
                cuadratica = Math.pow(A, 2);
                logLineal = Math.log(A) / Math.log(B);
                logCuadratica = (2 * Math.log(A)) / Math.log(B);

                System.out.println("Lineal (n): " + lineal);
                System.out.println("Cuadrática (n²): " + cuadratica);
                System.out.println("Log lineal b(n): " + logLineal);
                System.out.println("Log cuadrático b(n²): " + logCuadratica);

                //comparacion
                System.out.println("log_b(n²) = 2 * log_b(n), por tanto tienen el mismo orden asintótico (0(log n)).");
            break;}

            case 4:{
                System.out.print("Ingrese n: ");
                    int n = scanner.nextInt();
                    int[] contador = {0};

                    class ContadorRecursivo {
                        int contar(int x) {
                            for (int i = 1; i <= x; i++) {
                                for (int j = 1; j <= i; j++) {
                                    contador[0]++;
                                }
                            }

                            if (x > 1) {
                                for (int k = 0; k < 4; k++) {
                                    contador[0] += contar(x / 2);
                                }
                            }
                            return contador[0];
                        }
                    }

                    int total = new ContadorRecursivo().contar(n);
                    System.out.println("Total operaciones: " + total);
                    System.out.println("Aproximación teórica (8n²/3): " + (8.0 * n * n / 3));
            break;}
            case 5:{
                System.out.println("Ingrese un numero mayor o igual a 1: ");
                a = scanner.nextInt();
                if(a < 1){
                    System.out.println("El Numero debe ser mayor a 1");
                    return;
                }
                b = 0;
                c = 1;

                while(b < a){
                    b += c;
                    c++;
                }
                    if(b == a){
                        System.out.println(a + " Es un numero triangular");
                    }
                    else{
                        System.out.println(a + " No es un numero triangular");
                    }
                
            break;}

            case 6:{
                System.out.println("Ingrese el tamaño maximo de entrada para 1 hora (n): ");
                a = scanner.nextInt();
                b = 1;
                c = 3;

                calculate = a * c / b;
                System.out.println("Mayor tamaño de entrada con 3 horas (lineal): " + calculate );
            break;}

            
            case 7:{
                System.out.println("Ingrese el tamaño máximo de entrada actual (n): ");
                a = scanner.nextInt();
                //maquina 100 veces mas rapida
                b = 100;
                //caso (a) lineal= n * b
                A = a * 100; 
                //caso (b) Cuadrático: n'^2 = b * n^2 => n' = sqrt(b) * n
                B = Math.sqrt(b) * a;
                //caso (c) Exponencial: 10^n' = b * 10^n => n' = n + log10(b)
                C = a +Math.log10(b);
                System.out.println("Resultados para máquina 100 veces más rápida y 1 hora:");
                System.out.println("(A) lineal: tamaño máximo = " + A);
                System.out.println("(B) cuadrática: tamaño máximo = " + B);
                System.out.println("(C) exponencial: tamaño máximo = " + C);
            break;}

            case 8:{
                System.out.print("Ingrese números separados por espacios: ");
                    scanner.nextLine();
                    String[] numerosStr = scanner.nextLine().split(" ");
                    int[] numeros = new int[numerosStr.length];

                    try {
                        for (int i = 0; i < numerosStr.length; i++) {
                            numeros[i] = Integer.parseInt(numerosStr[i]);
                        }
                    } catch (NumberFormatException e) {
                        System.out.println("Error: ingrese solo números válidos.");
                        break;
                    }

                    if (numeros.length == 0) {
                        System.out.println("No se ingresaron números.");
                        break;
                    }

                    int min = numeros[0];
                    int max = numeros[0];
                    int comparaciones = 0;

                    for (int i = 1; i < numeros.length; i++) {
                        comparaciones++;
                        if (numeros[i] < min) {
                            min = numeros[i];
                        } else {
                            comparaciones++;
                            if (numeros[i] > max) {
                                max = numeros[i];
                            }
                        }
                    }

                    System.out.println("\nResultados:");
                    System.out.println("Mínimo: " + min);
                    System.out.println("Máximo: " + max);
                    System.out.println("Comparaciones: " + comparaciones);
                    System.out.println("Límite teórico (3n/2): " + (1.5 * numeros.length));
                    break;
                }

                case 9: {
                    System.out.print("Ingrese n (>0): ");
                    int n = scanner.nextInt();

                    if (n <= 0) {
                        System.out.println("Error: n debe ser >0.");
                        break;
                    }

                    class Recurrencia {
                        double calcular(int x, double c) {
                            if (x <= 1) return c;
                            double logn = Math.log(x) / Math.log(2);
                            return 2 * calcular(x / 4, c) + logn;
                        }
                    }

                    double resultado = new Recurrencia().calcular(n, 1);
                    System.out.printf("T(%d) = %.2f%n", n, resultado);
                    System.out.println("Orden asintótico: Θ(√n)");
                    break;
                }

                case 10: {
                    System.out.print("Ingrese n (>0): ");
                    int n = scanner.nextInt();

                    if (n <= 0) {
                        System.out.println("Error: n debe ser >0.");
                        break;
                    }

                    class CalculoRecursivo {
                        int parcial(int m) {
                            if (m == 1) return 1;
                            return 2 * parcial(m - 1);
                        }

                        int total(int x) {
                            if (x == 1) return 1;
                            return total(x - 1) + 2 * parcial(x - 1);
                        }
                    }

                    int resultado = new CalculoRecursivo().total(n);
                    System.out.println("total(" + n + ") = " + resultado);
                    System.out.println("Orden asintótico: O(n²)");
                    break;
                }

                case 11: {
                    System.out.print("Ingrese cadena principal: ");
                    scanner.nextLine();
                    String cadena = scanner.nextLine();
                    System.out.print("Ingrese subcadena a buscar: ");
                    String subcadena = scanner.nextLine();

                    if (subcadena.length() > cadena.length() || subcadena.isEmpty()) {
                        System.out.println("Subcadena no válida.");
                        break;
                    }

                    int comparaciones = 0;
                    int posicion = -1;

                    for (int i = 0; i <= cadena.length() - subcadena.length(); i++) {
                        boolean coincide = true;
                        for (int j = 0; j < subcadena.length(); j++) {
                            comparaciones++;
                            if (cadena.charAt(i + j) != subcadena.charAt(j)) {
                                coincide = false;
                                break;
                            }
                        }
                        if (coincide) {
                            posicion = i;
                            break;
                        }
                    }

                    if (posicion != -1) {
                        System.out.println("Subcadena encontrada en posición: " + posicion);
                    } else {
                        System.out.println("Subcadena no encontrada");
                    }
                    System.out.println("Comparaciones realizadas: " + comparaciones);
                    System.out.println("Complejidad: O(n*m) donde n = longitud cadena, m = longitud subcadena");
                    break;
                }

                case 12: {
                    System.out.print("Ingrese cantidad de elementos: ");
                    int tamaño = scanner.nextInt();

                    if (tamaño <= 0) {
                        System.out.println("Error: tamaño debe ser >0.");
                        break;
                    }

                    System.out.print("Ingrese " + tamaño + " números separados por espacios: ");
                    scanner.nextLine();
                    String[] elementos = scanner.nextLine().split(" ");

                    if (elementos.length != tamaño) {
                        System.out.println("Error: cantidad de números incorrecta.");
                        break;
                    }

                    int[] vector = new int[tamaño];
                    try {
                        for (int i = 0; i < tamaño; i++) {
                            vector[i] = Integer.parseInt(elementos[i]);
                        }
                    } catch (NumberFormatException e) {
                        System.out.println("Error: ingrese solo números válidos.");
                        break;
                    }

                    System.out.println("Vector original: " + Arrays.toString(vector));

                    // Algoritmo MultiMergeSort
                    int comparaciones = 0;

                    // Paso 1: Ordenar pares
                    for (int i = 0; i < tamaño - 1; i += 2) {
                        comparaciones++;
                        if (vector[i] > vector[i + 1]) {
                            int temp = vector[i];
                            vector[i] = vector[i + 1];
                            vector[i + 1] = temp;
                        }
                    }

                    // Paso 2: Crear colas ordenadas
                    List<Queue<Integer>> colas = new ArrayList<>();
                    for (int i = 0; i < tamaño; i += 2) {
                        Queue<Integer> cola = new LinkedList<>();
                        cola.add(vector[i]);
                        if (i + 1 < tamaño) {
                            cola.add(vector[i + 1]);
                        }
                        colas.add(cola);
                    }

                    // Paso 3: Mezclar colas
                    for (int i = 0; i < tamaño; i++) {
                        int minValor = Integer.MAX_VALUE;
                        int minIndice = -1;

                        for (int j = 0; j < colas.size(); j++) {
                            if (!colas.get(j).isEmpty()) {
                                comparaciones++;
                                if (colas.get(j).peek() < minValor) {
                                    minValor = colas.get(j).peek();
                                    minIndice = j;
                                }
                            }
                        }

                        if (minIndice != -1) {
                            vector[i] = colas.get(minIndice).poll();
                            if (colas.get(minIndice).isEmpty()) {
                                colas.remove(minIndice);
                            }
                        }
                    }

                    System.out.println("Vector ordenado: " + Arrays.toString(vector));
                    System.out.println("Comparaciones realizadas: " + comparaciones);
                    System.out.println("Complejidad: O(n²)");
                    break;
                }

                case 13: {
                    System.out.print("Ingrese una cadena: ");
                    scanner.nextLine();
                    String cadena = scanner.nextLine().toLowerCase().replaceAll("[^a-z0-9]", "");

                    if (cadena.isEmpty()) {
                        System.out.println("Cadena no válida.");
                        break;
                    }

                    boolean esPalindromo = true;
                    int izquierda = 0;
                    int derecha = cadena.length() - 1;
                    int comparaciones = 0;

                    while (izquierda < derecha) {
                        comparaciones++;
                        if (cadena.charAt(izquierda) != cadena.charAt(derecha)) {
                            esPalindromo = false;
                            break;
                        }
                        izquierda++;
                        derecha--;
                    }

                    System.out.println("La cadena " + (esPalindromo ? "ES" : "NO es") + " palíndromo");
                    System.out.println("Comparaciones realizadas: " + comparaciones);
                    System.out.println("Complejidad: O(n)");
                    break;
                }

                case 14: {
                    System.out.print("Ingrese un número n (>0): ");
                    int n = scanner.nextInt();

                    if (n <= 0) {
                        System.out.println("Error: n debe ser >0.");
                        break;
                    }

                    // Aproximación para T(n) = 2T(n/2) + 2n*log2(n)
                    // La solución es Θ(n log n), usamos una estimación simple
                    double logN = Math.log(n) / Math.log(2);
                    double resultado = 2 * n * logN; // Aproximación dominante

                    System.out.printf("T(%d) ≈ %.2f (estimación)%n", n, resultado);
                    System.out.println("Orden asintótico: Θ(n log n)");
                    break;
                }

                case 15: {
                    System.out.print("Ingrese números separados por espacios: ");
                    scanner.nextLine();
                    String[] numerosStr = scanner.nextLine().split(" ");
                    int[] numeros = new int[numerosStr.length];

                    try {
                        for (int k = 0; k < numerosStr.length; k++) {
                            numeros[k] = Integer.parseInt(numerosStr[k]);
                        }
                    } catch (NumberFormatException e) {
                        System.out.println("Error: ingrese solo números válidos.");
                        break;
                    }

                    if (numeros.length < 2) {
                        System.out.println("Error: ingrese al menos dos números.");
                        break;
                    }

                    // Encontrar max y min con un solo recorrido
                    int min = numeros[0];
                    int max = numeros[0];
                    int comparaciones = 0;

                    for (int i = 1; i < numeros.length; i++) {
                        comparaciones++;
                        if (numeros[i] < min) {
                            min = numeros[i];
                        } else {
                            comparaciones++;
                            if (numeros[i] > max) {
                                max = numeros[i];
                            }
                        }
                    }

                    System.out.println("\nResultados:");
                    System.out.println("Máximo: " + max);
                    System.out.println("Mínimo: " + min);
                    System.out.println("Comparaciones realizadas: " + comparaciones);
                    System.out.println("Comparaciones teóricas (3n/2 - 2): " + (3.0 * numeros.length / 2 - 2));
                    break;
                }
            }
        } while(estado != 0);
        System.out.println("Hasta luego");
    scanner.close();
    }
}