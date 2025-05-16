public class exercise23 {
    public static void main(String[] args) {

        int impresos = 0;
        int cociente, residuo, contador;

        for(contador = 1; impresos < 10; contador++){
            cociente = contador / 2;
            residuo = contador - (cociente * 2);

            if(residuo != 0){
                System.out.println(contador);
                impresos++;
            }
        }
    }
}