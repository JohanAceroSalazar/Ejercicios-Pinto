package Sena;

import java.util.Random;
import java.util.Scanner;

public class Sena {
    static Scanner sc = new Scanner(System.in);
    static Random random = new Random();

    static String regional = "";
    static String centro = "";
    static String sede = "";
    static String horarioInstructor = "";
    static String[] ambienteAsignado = new String[3];
    static boolean[] esEspecializado = new boolean[3];
    static int[] cantidadAprendices = new int[3];
    static String[] ambientesDisponibles = {"Ambiente 201", "Ambiente 202", "Ambiente 203"};
    static String [] lineasSena = {"Linea tecnologica en TIC", "Linea tecnologica en diseño", "Linea en materiales y herramientas", "Linea tecnologica en produccion y trasformacion", "Linea tecnologica orientada a clientes"};
    static String[][] programasPorLinea = { {"ADSO", "Programación Java"}, {"Multimedia", "Diseño UX/UI"}, {"Soldadura", "Procesos TIG y MIG"}, {"Producción", "Manejo de maquinaria"}, {"Atención al cliente", "Servicio al cliente"} };
    static String[] programasFormacion = { "ADSO", "Multimedia", "Soldadura", "Gestion en mercado, ventas y comercializacion", "Desarrollo de medios de comunicacion comercial" };
    static String[] descripcionesAmbientes = new String[3];
    static String[] horarioAprendices = new String[3];
    static String[] instructoresRegistrados = new String[5];
    static int contadorInstructores = 0;

    public static void registrarSena(){
        System.out.print("Ingrese la Regional del Sena: ");
        regional = sc.nextLine();
        System.out.println("Centro de formacion: ");
        centro = sc.nextLine();
        System.out.println("Sede de formacion: ");
        sede = sc.nextLine();

        System.out.println("-Regional: "+ regional + " -Centro: " + centro + " -Sede: " + sede);
    }

    public static void registrarAmbiente(){
        System.out.println("Ingrese el número de ambientes a registrar (Máximo 3): ");
        int ambientes = sc.nextInt();
        sc.nextLine();

        if (ambientes > 3 || ambientes < 1) {
            System.out.println("Error: máximo de ambientes es 3 y minimo 1");
            return;
        }

        for (int i = 0; i < ambientes; i++) {
            //mostrar las lineas disponibles para asignarlas a cada ambiente
            System.out.println("Seleccione la linea para el ambiente " + (i + 1)+ ":");
                for(int j = 0; j < lineasSena.length; j++){
                    System.out.println((j + 1) + ". " + lineasSena[j]);
                }

        int opcionLinea = sc.nextInt(); //lee el numero de la linea sena que quiera elegir
        sc.nextLine();

        if (opcionLinea < 1 || opcionLinea > lineasSena.length) { //que no ingrese un numero menor que 1 ni mayor a las lineas que haya
            System.out.println("Opción no válida.");
            i--; //resta 1 al contador del bucle para que se repita la iteracion
            continue; // pasa con la siguiente iteracion
        }

        System.out.println("Seleccione el programa de formacion: ");
            for(int j = 0; j < programasFormacion.length; j++){
                System.out.println((j + 1) + ". " + programasFormacion[j]);
            }
        

        int opcionPrograma = sc.nextInt();
        sc.nextLine();

        if (opcionPrograma < 1 || opcionPrograma > programasFormacion.length) { 
            System.out.println("Opción no válida.");
            i--; //resta 1 al contador del bucle para que se repita la iteracion
            continue; // pasa con la siguiente iteracion
        }

        //asignar ambiente de la lista disponible
        ambienteAsignado[i] = ambientesDisponibles[i];

        System.out.println("El ambiente es especializado? (Si / No): ");
                String respuesta = sc.nextLine().toLowerCase();// convierte el texto a minusculas 
                esEspecializado[i] = respuesta.equals("si");//devuelve verdadero si lo que el usuario escribio es "si", de lo contrario es falso

        cantidadAprendices[i] = random.nextInt(20) + 8;

        System.out.println("Ambiente Asignado: " + ambienteAsignado[i]);
        System.out.println("Linea: " + lineasSena[opcionLinea - 1]); //los arreglos empiezan en 0 pero las opciones se muestran desde 1
        System.out.println("Programa de formacion: " + programasFormacion[opcionPrograma - 1]);
        System.out.println("Especializado: " + (esEspecializado[i] ? "Sí" : "No"));
        System.out.println("Cantidad de aprendices asignados al ambiente: " + cantidadAprendices[i]);
        }
    }

    public static void registrarIntructor(){
        System.out.println("Ingrese el nombre del instructor que desea registrar: ");
        String instructor = sc.nextLine();

        if (contadorInstructores >= instructoresRegistrados.length) {
            System.out.println("Ya se ha alcanzado el límite de instructores.");
        return;
        }

        instructoresRegistrados[contadorInstructores] = instructor;
        contadorInstructores++; //guarda el instructor que se registro

        System.out.println("Seleccione la linea a la cual lo desea asignar:");
        for(int i = 0; i < lineasSena.length; i++ ){
            System.out.println((i + 1) + ". " + lineasSena[i]); //muestra el numero de la opcion desde 1 en vez de 0 y muestra el nombre de la linea 
        }
        
        int opcion = sc.nextInt();
        sc.nextLine();

        if(opcion < 1 || opcion > lineasSena.length){
            System.out.println("Línea no válida.");
            return;
        }

        System.out.println("Seleccione el programa a la cual lo desea asignar:");
        for(int i = 0; i < programasFormacion.length; i++ ){
            System.out.println((i + 1) + ". " + programasFormacion[i]); //muestra el numero de la opcion desde 1 en vez de 0 y muestra el nombre de la linea 
        }

        int opcion2 = sc.nextInt();
        sc.nextLine();

        if(opcion2 < 1 || opcion2 > programasFormacion.length){
            System.out.println("programa de formacion no valido");
            return;
        }

        System.out.println("Ingrese el horarrio del instructor (ej: 6am - 12pm): ");
        horarioInstructor = sc.nextLine();

        System.out.println("Instructor: " + instructor);
        System.out.println("Linea del instructor: " + lineasSena[opcion - 1] );
        System.out.println("Programa de formacion: " + programasFormacion[opcion2 - 1]);
        System.out.println("Horario del instructor: " + horarioInstructor);
    }

    public static void descripcionAmbientes(){
        if (contadorInstructores == 0) {
            System.out.println("No hay instructores registrados.");
        return;
        }

        for(int i = 0; i < contadorInstructores; i++){
            System.out.println("Instructor: " + instructoresRegistrados[i]);

            for(int j = 0; j < ambientesDisponibles.length; j++){
                System.out.println((j + 1) + ". " + ambientesDisponibles[j]);
            }

        int opcion = sc.nextInt();
        sc.nextLine();

        //opcion -1 se utiliza porque normalmente un arreglo empieza en 1 pero en java inicia en 0, lo utilizamos para acceder bien en el arreglo
        if(opcion < 1 || opcion > ambientesDisponibles.length|| ambientesDisponibles[opcion - 1] == null) {// accede al nombre del ambiente que el usuario eligio
            System.out.println("Ambiente no válido o ya asignado");
            i--; //volver a intentar con el mismo instructor
            } 

            System.out.println("Ingrese la descripcion (inventario) para " + ambientesDisponibles[opcion - 1] + ": ");// la descripcion queda vinculada con el ambiente
            descripcionesAmbientes[opcion - 1] = sc.nextLine();

            System.out.println("Instructor " + instructoresRegistrados[i] + " asignado a " + ambientesDisponibles[opcion - 1]);
            System.out.println("Descripción: " + descripcionesAmbientes[opcion - 1]);

            ambientesDisponibles[opcion - 1] = null;//ese ambiente queda eliminado
        }
    }

    public static void horarioAprendiz(){
        System.out.println("Asignar horario a los aprendices de cada ambiente ej(6am - 12pm):");

        for(int i = 0; i < ambienteAsignado.length ; i++){
            if(ambienteAsignado[i] != null){ //si es null quiere decir que no hay ambiente asignado en esa posición asi que se lo salta.
                System.out.println("Ambiente: " + ambienteAsignado[i]);// muestra el nombre del ambiente
                System.out.println("Ingrese el horario para los " + cantidadAprendices[i] + " aprendices: ");
                horarioAprendices[i] = sc.nextLine();
            }
        }

        System.out.println("Horarios asignados:");
        for (int i = 0; i < ambienteAsignado.length; i++) {
            if (ambienteAsignado[i] != null && horarioAprendices[i] != null) {//que haya un ambiente y un horario asigando en esa posicion, no se muestra si falta alguno de los 2 
                System.out.println("Ambiente " + ambienteAsignado[i] + ": " + horarioAprendices[i]);
            }
        }   
    }

    public static void mostrarProgramasLinea(){
        System.out.println("Programas por línea:");
        for (int i = 0; i < lineasSena.length; i++) {
            System.out.println(lineasSena[i] + ": ");
            for(String programa : programasPorLinea[i]) {
                System.out.println(" - " + programa);
            }
        }
    }

    public static void reporteInstructores(){
        System.out.println("Reporte de instructores registrados:");

        if(contadorInstructores == 0){
            System.out.println("No hay instructores registrados");
            return;
        }

        for(int i = 0; i < contadorInstructores; i++){
            System.out.println("- " + instructoresRegistrados[i]);
        }

        System.out.println("Total de instructores registrados: " + contadorInstructores);
    }

    public static void reporteAsignacionesAmbientes() {
    System.out.println("REPORTE DE AMBIENTES ASIGNADOS");

    for (int i = 0; i < descripcionesAmbientes.length; i++) {
        if (descripcionesAmbientes[i] != null) {// verifica si hay descripcion en el ambiente, si es null es porque no tiene descripcion
            String ambiente = "Ambiente " + (201 + i);
            String descripcion = descripcionesAmbientes[i]; //guarda la descripcion que se habia registrado para los ambientes
            String instructor = (i < instructoresRegistrados.length) ? instructoresRegistrados[i] : "No asignado"; //es porque no se registro instructor para dicho ambiente

            System.out.println("  Centro de formacion: " + centro);
            System.out.println("  Sede de formacion: " + sede);
            System.out.println("  Ambiente: " + ambiente);
            System.out.println("  Instructor: " + instructor);
            System.out.println("  Cantidad de aprendices: " + cantidadAprendices[i]);
            System.out.println("  Descripción: " + descripcion);
            System.out.println("--------------------------------------");
            }
        }
    }

    public static void reporteAprendices(){
        System.out.println("Reporte de aprendices por ambiente y programa:");

        for (int i = 0; i < ambienteAsignado.length; i++) {
            if (ambienteAsignado[i] != null) {
            System.out.println("Linea: " + lineasSena[i]);
            System.out.println("Programa de formacion: " + programasFormacion[i]);
            System.out.println(ambienteAsignado[i]);
            System.out.println("Cantidad de aprendices: " + cantidadAprendices[i]);
            System.out.println("--------------------------------------");
            }
        }
    }

    public static void reporteHorarios(){
        System.out.println("Reporte de Jornadas Registradas");

        for(int i = 0; i < horarioAprendices.length; i++){
            if(horarioAprendices[i] != null && ambienteAsignado[i] != null) {
            System.out.println("Ambiente: " + ambienteAsignado[i]);
            System.out.println("  Jornada: " + horarioAprendices[i]);
            System.out.println("  Instructor: " + (i < instructoresRegistrados.length && instructoresRegistrados[i] != null 
                                                    ? instructoresRegistrados[i] 
                                                    : "No asignado"));//para saber si hay un instructor asignado a ese ambiente
            System.out.println("  Cantidad de aprendices: " + cantidadAprendices[i]);
            System.out.println("----------------------------------------");
            }
        }
    }
}
