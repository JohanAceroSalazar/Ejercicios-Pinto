import java.util.Scanner;

    public class Main{
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int opcion, a, b, c, d, e, f, MV, TB, C, edad, l, contador, impresos, menores, mayores, estado = 0;
            int operador, numeroVocales, numeroConsonantes, blanco, ganador, voto;
            double sueldoEmpleado, promedio, N1, N2, sumaSueldos = 0, resultado;
            String numeroMayor, tipoTriangulo, letras, letra, SEMAF = "V";

        do{
        System.out.println("Seleccione un ejercicio:");
        System.out.println("1. Calcular distancia");
        System.out.println("2. Calcular promedio de notas");
        System.out.println("3. Puntaje final de examen");
        System.out.println("4. Puntaje total de partidos");
        System.out.println("5. Planilla");
        System.out.println("6. Puntaje total de partidos");
        System.out.println("7. a de CDs");
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
                System.out.println("Velocidad");
                a = scanner.nextInt();
                System.out.println("Tiempo");
                b = scanner.nextInt();
                System.out.println("resultado: " + (a * b));
            break;}

            case 2:{
                System.out.println("Primera nota");
                a = scanner.nextInt();
                System.out.println("Segunda nota");
                b = scanner.nextInt();
                System.out.println("Tercera nota");
                c = scanner.nextInt();
                System.out.println("resultado: " + (a+b+c)/3);
            break;}

            case 3:{
                System.out.println("Respuestas correctas");
                a = scanner.nextInt();
                System.out.println("Respuestas incorrectas");
                b = scanner.nextInt();
                System.out.println("Respuestas en blanco");
                c = scanner.nextInt();
                System.out.println("Resultado: " + ((a * 4) + (b * 1)));
            break;}

            case 4:{
                System.out.println("Partidos ganados");
                a = scanner.nextInt();
                System.out.println("Partidos perdidos");
                b = scanner.nextInt();
                System.out.println("Partidos empatados");
                c = scanner.nextInt();
                System.out.println("Resultado: " + ((a * 3) + (b * 1)));
            break;}

            case 5:{
                System.out.println("Horas laboradas");
                a = scanner.nextInt();
                System.out.println("Tarifa por hora");
                b = scanner.nextInt();
                System.out.println("Resultado: " + (a * b));
            break;}

            case 6:{
                System.out.println("Longitud lado A");
                a = scanner.nextInt();
                System.out.println("Longitud lado B");
                b = scanner.nextInt();
                System.out.println("Longitud lado C");
                c = scanner.nextInt();
                l = (a + b + c)/2;
                System.out.println("Resultado: " + Math.sqrt (l * (l - a) * (l - b) * (l - c)));
            break;}

            case 7:{
                System.out.println("GB del disco duro");
                a = scanner.nextInt();
                l = a * 1024;
                System.out.println("Resultado: " + (Math.floor(l / 700) + 1));
            break;}

            case 8:{
                System.out.println("Abcisa A");
                a = scanner.nextInt();
                System.out.println("Abcisa B");
                b = scanner.nextInt();
                System.out.println("Ordenada A");
                c = scanner.nextInt();
                System.out.println("Ordenada B");
                d = scanner.nextInt();
                System.out.println("Resultado: " + (Math.pow(b - a, 2) + Math.pow(d - c, 2)));
            break;}

            case 9:{
                System.out.println("Año de nacimiento");
                a = scanner.nextInt();
                System.out.println("Año actual");
                b = scanner.nextInt();
                edad = b - a;

                if(edad > 17){
                    System.out.println("Debe solicitar su CUIL");
                } 
                else{
                    System.out.println("No debe solicitar su CUIL aun");
                }
            break;}

            case 10:{
                System.out.println("Edad del primer hermano");
                a = scanner.nextInt();
                System.out.println("Edad del segundo hermano");
                b = scanner.nextInt();
                edad = a - b;

                if(a > b){
                    System.out.println("El primer hermano es mayor");
                }
                else{
                    System.out.println("El segundo hermano es mayor");
                }
            break;}

            case 11:{
                System.out.println("Produccion lunes");
                a = scanner.nextInt();
                System.out.println("Produccion martes");
                b = scanner.nextInt();
                System.out.println("Produccion miercoles");
                c = scanner.nextInt();
                System.out.println("Produccion jueves");
                d = scanner.nextInt();
                System.out.println("Produccion viernes");
                e = scanner.nextInt();
                System.out.println("Produccion sabado");
                f = scanner.nextInt();
                
                l = (a+b+c+d+e+f)/6;

                if(l >= 100){
                    System.out.println("Recibira incentivos");
                }
                else{
                    System.out.println("No recibira incentivos");
                }
            break;}

            case 12:{
                System.out.println("Primer a");
                a = scanner.nextInt();
                System.out.println("Segundo a");
                b = scanner.nextInt();
                System.out.println("Tercer a");
                c = scanner.nextInt();
                
                if(a > b && a > c){
                    numeroMayor = "Primer a";
                }
                else if(b > c){
                    numeroMayor = "Segundo a";
                }
                else{
                    numeroMayor = "Tercer a";
                }
                    System.out.println("a Mayor: " + numeroMayor);
            break;}

            case 13:{
                System.out.println("Primer lado");
                a = scanner.nextInt();
                System.out.println("Segundo lado");
                b = scanner.nextInt();
                System.out.println("Tercer lado");
                c = scanner.nextInt();
                
                if(a != b && b != c && c != a){
                    tipoTriangulo = "Escaleno";
                }
                else if(a == b && b == c){
                    tipoTriangulo = "Equilatero";
                }
                else{
                    tipoTriangulo = "Isosceles";
                }
                    System.out.println("Tipo de triangulo: " + tipoTriangulo);
            break;}

            case 14:{
                System.out.print("Ingrese un número del 1 al 10: ");
                a = scanner.nextInt();
                switch ((int) a) {
                    case 1:
                        System.out.println("I");
                        break;
                    case 2:
                            System.out.println("II");
                            break;
                    case 3:
                        System.out.println("III");
                        break;
                    case 4:
                        System.out.println("IV");
                        break;
                    case 5:
                        System.out.println("V");
                        break;
                    case 6:
                        System.out.println("VI");
                        break;
                    case 7:
                        System.out.println("VII");
                        break;
                    case 8:
                        System.out.println("VIII");
                        break;
                    case 9:
                        System.out.println("IX");
                        break;
                    case 10:
                        System.out.println("X");
                        break;
                    default:
                        System.out.println("Fuera de rango");
                    }
                    break;}

            case 15:{
                System.out.print("Ingrese monto de venta: ");
                MV = scanner.nextInt();
                if (MV >= 0 && MV < 1000){
            C = 1;
        } else if (MV >= 1000 && MV < 5000) {
            C = 2;
        } else if (MV >= 5000 && MV < 20000) {
            C = 3;
        } else if (MV >= 20000) {
            C = 4;
        } else {
            C = 0; 
        }

        switch (C) {
            case 1:
                TB = (0 * MV) / 100;
                break;
            case 2:
                TB = (3 * MV) / 100;
                break;
            case 3:
                TB = (5 * MV) / 100;
                break;
            case 4:
                TB = (8 * MV) / 100;
                break;
            default:
                TB = 0;
                System.out.println("Monto inválido.");
                break;
        }
            System.out.println("Bonficanion Total: " + TB);
            break;}

            case 16:{
                System.out.println("a entero");
                a = scanner.nextInt();
                switch (a) {
            case 1:
                System.out.println("Vocal: A");
                break;
            case 2:
                System.out.println("Vocal: E");
                break;
            case 3:
                System.out.println("Vocal: I");
                break;
            case 4:
                System.out.println("Vocal: O");
                break;
            case 5:
                System.out.println("Vocal: U");
                break;
            default:
                System.out.println("Valor Incorrecto");
                }
                break;}

            case 17:{
                System.out.println("a entero");
                a = scanner.nextInt();
                b = a / 10;
                c = a-(b * 10);

                System.out.println("a decenas: " + b);
                System.out.println("a unidades: " + c);
            break;}

            case 18:{
                System.out.println("a entero");
                a = scanner.nextInt();
                b = a / 2;
                c = a-(b * 2);

                if(c == 0){
                    System.out.println("El a es par");
                }
                else{
                System.out.println("El a es impar");
                }
            break;}

            case 19:{
                System.out.println("Numero");
                a = scanner.nextInt();
                
                for(contador = 1; contador <= 4; contador++){
                    a = a + 2;
                System.out.println("Numero: " + a);
                }
            break;}

            case 20:{
                System.out.println("Numero Empleados");
                a = scanner.nextInt();
                
                for(contador = 1; contador <= a; contador++){
                    System.out.println("Sueldo del empleado " + contador + ": ");
                sueldoEmpleado = scanner.nextDouble();
                sumaSueldos = sumaSueldos + sueldoEmpleado;
                }
                promedio = sumaSueldos / a;
                System.out.println("Sueldo promedio: " + promedio);
                
            break;}

            case 21:{
                menores = 0;
                mayores = 0;
                for(contador = 1; contador <= 10; contador++){
                    System.out.println("Ingrese edad de las personas: " + contador + ": ");
                    a = scanner.nextInt();
                if (a < 18){
                    menores = menores + 1;
                }
                else{
                    mayores = mayores + 1;
                }
            }
                System.out.println("Personas mayores de edad: " + mayores);
                System.out.println("Personas menores de edad: " + menores);
                
            break;}

            case 22:{
                System.out.println("Primer numero");
                a = scanner.nextInt();
                System.out.println("Segundo numero");
                b = scanner.nextInt();
                c = 0;

                for(contador = 1; contador <= b; contador++){
                    c = c + a;
                }
                    System.out.println("Producto: " + c);
                
            break;}

            case 23:{
                impresos = 0;
                for(contador = 1; impresos < 10; contador++){
                    a = contador / 2;
                    b = contador - (a * 2);

                    if(b != 0){
                        System.out.println(contador);
                        impresos++;
                    }
                }
            break;}

            case 24:{
                a = 1;
                while (a < 1000){
                    System.out.println(a);
                        a = (int) Math.pow(a, 2) + 1;
                }
            break;}

            case 25:{
                while (SEMAF.equals("V")){
                    System.out.println("Ingrese letra: ");
                    letras = scanner.nextLine();

                switch (letras.toLowerCase()) {
                    case "a":
                    case "e":
                    case "i":
                    case "o":
                    case "u":
                SEMAF = "R";
                    break;

                default:
                    SEMAF = "V";
                    break;
                    }
                }
                System.out.println("Se ingreso una vocal");
            break;}

            case 26:{
                a = 0;
                b = 1;
                c = a + b;
                    System.out.println(a);
                    System.out.println(b);

                while (c < 100000){
                    System.out.println(c);
                        a = b;
                        b = c;
                        c = a + b;
                }
            break;}

            case 27:{
                System.out.println("Primer numero");
                a = scanner.nextInt();
                System.out.println("Segundo numero");
                b = scanner.nextInt();
                System.out.println("Operador (1=suma, 2=resta, 3=multiplicacion, 4=potencia): ");
                operador = scanner.nextInt();

                switch (operador) {
            case 1:
                resultado = a + b;
                System.out.println("Resultado: " + resultado);
                break;
            case 2:
                resultado = a - b;
                System.out.println("Resultado: " + resultado);
                break;
            case 3:
                resultado = a * b;
                System.out.println("Resultado: " + resultado);
                break;
            case 4:
                resultado = Math.pow(a, b);
                System.out.println("Resultado: " + resultado);
                break;
            default:
                System.out.println("Operador inválido.");
                break;
                }
            break;}

            case 28:{
                numeroVocales = 0;
                numeroConsonantes = 0;

                for(contador = 1; contador <= 10; contador++){
                    System.out.println("Ingrese la letra" + contador + ": ");
                    letra = scanner.nextLine();

            switch (letra.toLowerCase()) {
                case "a":
                case "e":
                case "i":
                case "o":
                case "u":
                    numeroVocales++;
                    break;
                default:
                    numeroConsonantes++;
                    break;
                }
            }
                System.out.println("Número de vocales ingresadas: " + numeroVocales);
                System.out.println("Número de consonantes ingresadas: " + numeroConsonantes);

            break;}

            case 29:{
                a = 0;
                b = 0;
                c = 0;
                blanco = 0;

                for (contador = 1; contador <= 8; contador++) {
                    System.out.print("Ingrese el voto del elector" + contador + ": ");
                    voto = scanner.nextInt();

                    if (voto == 1) {
                        a++;
                    } else if (voto == 2) {
                        b++;
                    } else if (voto == 3) {
                        c++;
                    } else {
                        blanco++;
                    }
                }

                    if (a > b && a > c) {
                        ganador = 1;
                    } else if (b > a && b > c) {
                        ganador = 2;
                    } else if (c > a && c > b) {
                        ganador = 3;
                    } else {
                        ganador = 0; 
                }

                    System.out.println("Resultados del escrutinio:");
                    System.out.println("Candidato 1: " + a + " votos");
                    System.out.println("Candidato 2: " + b + " votos");
                    System.out.println("Candidato 3: " + c + " votos");
                    System.out.println("Votos nulos o en blanco: " + blanco);

                if (ganador == 0) {
                    System.out.println("No hay un ganador claro, hubo un empate");
                } else {
                    System.out.println("El ganador es el Candidato " + ganador);
                }

            break;}

            case 30:{
                System.out.println("Numero 1:");
                N1 = scanner.nextInt();
                System.out.println("Numero 2:");
                N2 = scanner.nextInt();
                System.out.println("resultado: " + (N1 + N2)/2);
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