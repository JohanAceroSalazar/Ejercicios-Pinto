import java.util.Scanner;

public class Agenda {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Registro[] registros = new Registro[10];
        int numRegistros = 0;

        buscarNombre buscarNombre = new buscarNombre();
        buscarApellido buscarApellido = new buscarApellido();
        buscarTelefono buscarTelefono = new buscarTelefono();
        buscarDireccion buscarDireccion = new buscarDireccion();
        buscarFechaNacimiento buscarFecha = new buscarFechaNacimiento();

        while (true) {
            System.out.println("Agenda");
            System.out.println("1. Agregar contacto");
            System.out.println("2. Mostrar todos");
            System.out.println("3. Buscar por nombre");
            System.out.println("4. Buscar por apellido");
            System.out.println("5. Buscar por teléfono");
            System.out.println("6. Buscar por dirección");
            System.out.println("7. Buscar por fecha nacimiento");
            System.out.println("8. Salir");
            System.out.print("Opción: ");

            int opcion;
            try {
                opcion = Integer.parseInt(teclado.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Error: Ingrese un número válido.");
                continue;
            }

            switch (opcion) {
                case 1: {
                    if (numRegistros >= registros.length) {
                        System.out.println("Agenda llena.");
                        break;
                    }

                    System.out.print("Primer nombre: ");
                    String primerNombre = teclado.nextLine();
                    if(primerNombre.isEmpty()){
                        System.out.println("Este campo no puede estar vacio");
                    break;
                    }

                    System.out.print("Segundo nombre: ");
                    String segundoNombre = teclado.nextLine();

                    System.out.print("Primer apellido: ");
                    String primerApellido = teclado.nextLine();
                    if(primerApellido.isEmpty()){
                        System.out.println("Este campo no puede estar vacio");
                    break;
                    }

                    System.out.print("Segundo apellido: ");
                    String segundoApellido = teclado.nextLine();

                    System.out.print("RH (ej: o+ A+. etc): ");
                    String rh = teclado.nextLine();

                    System.out.print("Teléfono max 10 digitos: ");
                    String telefono = teclado.nextLine();
                    if(telefono.length() > 10){
                        System.out.println("Numero de telefono mayor a 10 digitos");
                    break;
                    }

                    System.out.print("Email: ");
                    String email = teclado.nextLine();

                    System.out.print("Dirección: ");
                    String direccion = teclado.nextLine();

                    System.out.print("Año de nacimiento: ");
                    String añoInput = teclado.nextLine();
                    int fechaNacimiento;
                    try {
                        fechaNacimiento = Integer.parseInt(añoInput);
                        if(fechaNacimiento < 1900 || fechaNacimiento > 2025) {
                            System.out.println("El año debe estar entre 1900 y 2025.");
                            break;
                        }
                    } catch (NumberFormatException e) {
                        System.out.println("Año inválido. Registro no guardado.");
                        break;
                    }

                    registros[numRegistros] = new Registro(primerNombre, segundoNombre, primerApellido, segundoApellido, rh, telefono, email, direccion, fechaNacimiento);
                    numRegistros++;
                    System.out.println("Registro agregado con éxito.");
                    break;
                }

                case 2: 
                    System.out.println("Lista de registros");
                    if(numRegistros == 0){
                        System.out.println("No hay registros en la agenda");
                    } else{
                        for (int i = 0; i < numRegistros; i++) {
                            System.out.println("Registro " + (i + 1) + ":");
                            registros[i].mostrarRegistro();
                    }
                    }
                break;

                case 3:
                    System.out.print("Ingrese nombre a buscar: ");
                    String nombreBuscar = teclado.nextLine();
                    buscarNombre.buscar(registros, numRegistros, nombreBuscar);
                    break;

                case 4:
                    System.out.print("Ingrese apellido a buscar: ");
                    String apellidoBuscar = teclado.nextLine();
                    buscarApellido.buscar(registros, numRegistros, apellidoBuscar);
                    break;

                case 5:
                    System.out.print("Ingrese teléfono a buscar: ");
                    String telefonoBuscar = teclado.nextLine();
                    buscarTelefono.buscar(registros, numRegistros, telefonoBuscar);
                    break;

                case 6:
                    System.out.print("Ingrese direccion a buscar: ");
                    String calleBuscar = teclado.nextLine();
                    buscarDireccion.buscar(registros, numRegistros, calleBuscar);
                    break;

                case 7:
                    System.out.print("Ingrese año de nacimiento a buscar: ");
                    String añoBuscarInput = teclado.nextLine();
                    try {
                        int fechaNacimiento = Integer.parseInt(añoBuscarInput);
                        buscarFecha.buscar(registros, numRegistros, fechaNacimiento);
                    } catch (NumberFormatException e) {
                        System.out.println("Error: El año debe ser un número.");
                    }
                    break;

                case 8:
                    System.out.println("Adios");
                    teclado.close();
                    return;

                default:
                    System.out.println("Opcion incorrecta");
                break;
            }
        }
    }
}