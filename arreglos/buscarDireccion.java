public class buscarDireccion extends buscarRegistro{

    @Override
    public void buscar(Registro[] registros, int numRegistros, Object criterio){
        String direccion = (String) criterio;
        for(int i = 0; i < numRegistros; i++){
            if(registros[i].direccion.equalsIgnoreCase(direccion)){
                mostrarResultado(registros[i]);
                return;
            }
        }
        mostrarResultado(null);
    }
}