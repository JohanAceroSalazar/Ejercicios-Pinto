public class buscarFechaNacimiento extends buscarRegistro {

    @Override
    public void buscar(Registro[] registros, int numRegistros, Object criterio) {
        int fechaNacimiento = (Integer) criterio;
        boolean encontrado = false;
        for(int i = 0; i < numRegistros; i++){
            if(registros[i].fechaNacimiento == fechaNacimiento){
                mostrarResultado(registros[i]);
                encontrado = true;
            }
        }
        if (!encontrado){
            System.out.println("No se encontro la fecha");
        }
        
    }
}