public class buscarApellido extends buscarRegistro {

    @Override
    public void buscar(Registro[] registros, int numRegistros, Object criterio ){
        String primerApellido = (String) criterio;
        for (int i = 0; i < numRegistros; i++) {
            if (registros[i].primerApellido.equalsIgnoreCase(primerApellido)) {
                mostrarResultado(registros[i]);
                return;
            }
        }
        mostrarResultado(null);
    }
}