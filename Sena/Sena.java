package Sena;

import java.util.Random;
import java.util.Scanner;

public class Sena {
    static Scanner sc = new Scanner(System.in);
    static Random random = new Random();

    static String regional = "";
    static String centro = "";
    static String sede = "";
    static String[] ambienteAsignado = new String[3];
    static boolean[] esEspecializado = new boolean[3];
    static int[] cantidadAprendices = new int[3];
    static String[] ambientesDisponibles = {"Ambiente 201", "Ambiente 202", "Ambiente 203"};
    static String [] lineasSena = {"Linea tecnologica en TIC", "Linea tecnologica en diseño", "Linea en materiales y herramientas", "Linea en produccion y trasformacion", "Linea orientada a clientes"};
    static String[][] programasPorLinea = { {"ADSO", "Programación Java"}, {"Multimedia", "Diseño UX/UI"}, {"Soldadura", "Procesos TIG y MIG"}, {"Producción", "Manejo de maquinaria"}, {"Atención al cliente", "Servicio al cliente"} };
    static String[] programasFormacion = { "ADSO", "Multimedia", "Soldadura" };
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

        System.out.println("Regional: "+ regional + " Centro: " + centro + " Sede: " + sede);
    }

    public static void registrarAmbiente(){
        System.out.println("Ingrese el número de ambientes a registrar (Máximo 3): ");
        int ambientes = sc.nextInt();
        sc.nextLine();

        if (ambientes > 3 || ambientes < 1) {
            System.out.println("Error: máximo de ambientes es 3 y minimo 1");
            return;
        }

        boolean[] especializado = { true, false, true };

        for (int i = 0; i < ambientes; i++) {
            System.out.println("Asignando ambiente a la linea: " + lineasSena[i]);

            ambienteAsignado[i] = ambientesDisponibles[i];
            esEspecializado[i] = especializado[i];

            int aprendices = random.nextInt(15) + 5;
            cantidadAprendices[i] = aprendices;

            System.out.println("Programa: " + programasFormacion[i]);
            System.out.println("Ambiente asignado: " + ambienteAsignado[i]);
            System.out.println("¿Es especializado?: " + (esEspecializado[i] ? "Sí" : "No"));
            System.out.println("Cantidad de aprendices asignados: " + cantidadAprendices[i]);
        }
    }

    public static void registrarIntructor(){
        System.out.println("Ingrese el nombre del instructor: ");
        String instructor = sc.nextLine();

        if (contadorInstructores >= instructoresRegistrados.length) {
            System.out.println("Ya se ha alcanzado el límite de instructores.");
        return;
        }

        instructoresRegistrados[contadorInstructores] = instructor;
        contadorInstructores++;

        System.out.println("Seleccione la linea a la cual lo desea asignar:");
        for(int i = 0; i < lineasSena.length; i++ ){
            System.out.println((i + 1) + ". " + lineasSena[i]);
        }
        
        int opcion = sc.nextInt();
        sc.nextLine();

        if(opcion < 1 || opcion > lineasSena.length){
            System.out.println("Línea no válida.");
            return;
        }

        System.out.println("Ingrese el horarrio del instructor (ej: 6am - 12pm): ");
        String horario = sc.nextLine();

        System.out.println("Instructor: " + instructor);
        System.out.println("Linea del instructor: " + lineasSena[opcion - 1] );
        System.out.println("Horario del instructor: " + horario);
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

        /*opcion -1 se utiliza porque normalmente un arreglo empieza en 1 pero en java inicia en 0, lo utilizamos para acceder bien en el arreglo*/
        if(opcion < 1 || opcion > ambientesDisponibles.length|| ambientesDisponibles[opcion - 1] == null) {
            System.out.println("Ambiente no válido o ya asignado.");
            i--; //volver a intentar con el mismo instructor
            } 

            System.out.println("Ingrese la descripcion para " + ambientesDisponibles[opcion - 1] + ": ");
            descripcionesAmbientes[opcion - 1] = sc.nextLine();

            System.out.println("Instructor " + instructoresRegistrados[i] + " asignado a " + ambientesDisponibles[opcion - 1]);
            System.out.println("Descripción: " + descripcionesAmbientes[opcion - 1]);

            ambientesDisponibles[opcion - 1] = null; 
        }
    }

    public static void horarioAprendiz(){
        System.out.println("Asignar horario a los aprendices de cada ambiente ej(6am - 12pm):");

        for(int i = 0; i < ambienteAsignado.length ; i++){
            if(ambienteAsignado[i] != null){
                System.out.println("Ambiente: " + ambienteAsignado[i]);
                System.out.println("Ingrese el horario para los " + cantidadAprendices[i] + " aprendices: ");
                horarioAprendices[i] = sc.nextLine();
            }
        }

        System.out.println("Horarios asignados:");
        for (int i = 0; i < ambienteAsignado.length; i++) {
            if (ambienteAsignado[i] != null && horarioAprendices[i] != null) {
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
        if (descripcionesAmbientes[i] != null) {
            String ambiente = "Ambiente " + (201 + i);
            String descripcion = descripcionesAmbientes[i];
            String instructor = (i < instructoresRegistrados.length) ? instructoresRegistrados[i] : "No asignado";

            System.out.println("  Instructor: " + instructor);
            System.out.println("  Ambiente: " + ambiente);
            System.out.println("  Descripción: " + descripcion);
            System.out.println("--------------------------------------");
            }
        }
    }

    public static void reporteAprendices(){
        System.out.println("Reporte de aprendices por ambiente:");

        for (int i = 0; i < ambienteAsignado.length; i++) {
            if (ambienteAsignado[i] != null) {
            System.out.println("Programa de formacion: " + programasFormacion[i] + 
                                " - " +ambienteAsignado[i] + 
                                " - Cantidad de aprendices: " + cantidadAprendices[i]);
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
                                                    : "No asignado"));
            System.out.println("  Cantidad de aprendices: " + cantidadAprendices[i]);
            System.out.println("----------------------------------------");
            }
        }
    }
}