import java.util.Scanner;

public class Principal {

        static Scanner scanner = new Scanner(System.in);
        public static int opcion, a, b, c, d, e, f, calcular, calcular2, calcular3, contador, estado = 0;
        public static double A, B, C, D, N1, N2;
        public static char letras, SEMAF;

    public static void main(String[] args) {

        Principal pr = new Principal();

        do{
        System.out.println("Seleccione un ejercicio:");
        System.out.println("1. Calcular distancia");
        System.out.println("2. Calcular promedio de notas");
        System.out.println("3. Puntaje final de examen");
        System.out.println("4. Puntaje total de partidos");
        System.out.println("5. Planilla");
        System.out.println("6. Area de triangulo");
        System.out.println("7. Numero de CDs");
        System.out.println("8. Distancia en plano cartesiano");
        System.out.println("9. Edad");
        System.out.println("10. Diferencias de edades");
        System.out.println("11. Produccion total");
        System.out.println("12. Diferencias de edades");
        System.out.println("13. Tipo de triangulo");
        System.out.println("14. Equivalente en romanos");
        System.out.println("15. Monto de venta en un mes");
        System.out.println("16. a entero a vocal");
        System.out.println("17. Muestre a de unidades y decenas");
        System.out.println("18. a es par o impar");
        System.out.println("19. Numeros pares del 1 al 10");
        System.out.println("20. Sueldo promedio de grupo de empleados");
        System.out.println("21. Personas mayores y menores de edad");
        System.out.println("22. Producto de un numero");
        System.out.println("23. 10 primeros numeros impares");
        System.out.println("24. Serie menor a 1000");
        System.out.println("25. Letras a vocal");
        System.out.println("26. serie Fibonacci");
        System.out.println("27. Resultado de 2 numeros con un operador");
        System.out.println("28. Numero de vocales y consonantes");
        System.out.println("29. Ganador de elecciones");
        System.out.println("30. Promedio de 2 numeros");
        System.out.println("0 salir");
        System.out.print("Opción: ");

        opcion = scanner.nextInt();

        switch (opcion) {
            case 1:{
                leerDatos.ScannerDos();
                exerciseOne.Distancia();
            break;}

            case 2:{
                leerDatos.ScannerTres();
                exerciseTwo.Promedio();
            break;}

            case 3:{
                leerDatos.ScannerDos();
                exerciseThree.puntajeExamen();
            break;}

            case 4:{
                leerDatos.ScannerDos();
                exerciseFour.puntajeTotalPartidos();
            break;}

            case 5:{
                leerDatos.ScannerDos();
                exerciseFive.horasLaboradasMes();
            break;}

            case 6:{
                leerDatos.ScannerTresD();
                exerciseSix.areaDeTriangulo();
            break;}

            case 7:{
                leerDatos.ScannerUnoD();
                exerciseSeven.numeroCd();
            break;}

            case 8:{
                leerDatos.ScannerCuatroD();
                exerciseEight.distanciaPlanoCartesiano();
            break;}

            case 9:{
                leerDatos.ScannerDos();
                exerciseNine.edad();
            break;}

            case 10:{
                leerDatos.ScannerDos();
                exerciseTen.diferenciaDeEdad();
            break;}

            case 11:{
                leerDatos.ScannerSeis();
                exercise11.produccionPromedia();
            break;}

            case 12:{
                leerDatos.ScannerTres();
                exercise12.numeroMayor();
            break;}

            case 13:{
                leerDatos.ScannerTres();
                exercise13.tipoDeTriangulo();
            break;}

            case 14:{
                leerDatos.Scanneruno();
                exercise14.numeroRomano();
            break;}

            case 15:{
                leerDatos.Scanneruno();
                exercise15.montoVenta();
            break;}

            case 16:{
                leerDatos.Scanneruno();
                exercise16.vocales();
            break;}

            case 17:{
                leerDatos.Scanneruno();
                exercise17.cocienteEntero();
            break;}

            case 18:{
                leerDatos.Scanneruno();
                exercise18.numeroParImpar();
            break;}

            case 19:{
                leerDatos.Scanneruno();
                exercise19.diezPar();
            break;}

            case 20:{
                leerDatos.Scanneruno();
                exercise20.sueldoPromedio();
            break;}

            case 21:{
                leerDatos.Scanneruno();
                exercise21.mayorOMenor();
            break;}

            case 22:{
                leerDatos.ScannerDos();
                exercise22.suma();
            break;}

            case 23:{
                leerDatos.ScannerDos();
                exercise23.diezNumerosImpares();
            break;}

            case 24:{
                leerDatos.Scanneruno();
                exercise24.serie();
            break;}

            case 25:{
                leerDatos.ScannerChar();
                exercise25.vocal();
            break;}

            case 26:{
                exercise26.fibonacci();
            break;}

            case 27:{
                leerDatos.ScannerDos();
                leerDatos.ScannerChar();
                exercise27.operacionConOperador();
            break;}

            case 28:{
                leerDatos.ScannerChar();
                exercise28.contadorVocalesConsonantes();
            break;}

            case 29:{
                exercise29.votaciones();
            break;}

            case 30:{
                leerDatos.ScannerDos();
                exercise30.promedioDosNumeros();
            break;}

            case 0: {
                    System.out.println("¡Hasta pronto!");
                    estado = 1; 
                    break;}

            default:
                System.out.println("Opción inválida.");
            }
            
        } while(estado==0);
        
    scanner.close();
    }  
}