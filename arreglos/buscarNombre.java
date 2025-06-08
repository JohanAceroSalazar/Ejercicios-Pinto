public class buscarNombre extends buscarRegistro {

    @Override
    public void buscar(Registro[] registros, int numRegistros, Object criterio ){
        String primerNombre = (String) criterio;
        for (int i = 0; i < numRegistros; i++) {
            if (registros[i].primerNombre.equalsIgnoreCase(primerNombre)) {
                mostrarResultado(registros[i]);
                return;
            }
        }
        mostrarResultado(null);
    }
}