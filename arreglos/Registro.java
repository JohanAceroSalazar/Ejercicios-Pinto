public class Registro {

    public String primerNombre, segundoNombre, primerApellido, segundoApellido, rh, telefono, email, direccion;
    public int fechaNacimiento;

    public Registro(String primerNombre, String segundoNombre, String primerApellido, String segundoApellido, String rh,
            String telefono, String email, String direccion, int fechaNacimiento) {
        this.primerNombre = primerNombre;
        this.segundoNombre = segundoNombre;
        this.primerApellido = primerApellido;
        this.segundoApellido = segundoApellido;
        this.rh = rh;
        this.telefono = telefono;
        this.email = email;
        this.direccion = direccion;
        this.fechaNacimiento = fechaNacimiento;
        }

        public void mostrarRegistro() {
            System.out.println("Primer nombre: " + primerNombre + 
                (segundoNombre.isEmpty() ? "" : " " + segundoNombre) + " " + primerApellido +
                (segundoApellido.isEmpty() ? "" : " " + segundoApellido));
            System.out.println("Rh: " + rh);
            System.out.println("Teléfono: " + telefono);
            System.out.println("Email: " + email);
            System.out.println("Dirección: " + direccion);
            System.out.println("Año de nacimiento: " + fechaNacimiento);
        }
    }