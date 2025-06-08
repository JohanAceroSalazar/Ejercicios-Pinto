public class buscarTelefono extends buscarRegistro{

    @Override
    public void buscar(Registro[] registros, int numRegistros, Object criterio) {
        String telefono = (String) criterio;
        for(int i = 0; i < numRegistros; i++) {
            if(registros[i].telefono.equalsIgnoreCase(telefono)){
                mostrarResultado(registros[i]);
                return;
            }
        }
        mostrarResultado(null);
    }
}