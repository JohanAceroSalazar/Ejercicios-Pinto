public abstract class buscarRegistro{
    public abstract void buscar(Registro[] registros, int numRegistros, Object criterio);

    protected void mostrarResultado(Registro registro) {
        if (registro != null) {
            System.out.println("se encontro registro :");
            registro.mostrarRegistro();
        } else {
            System.out.println("No se encontraron resultados.");
        }
    }
}