public class exercise23 {

    public static Principal pr = new Principal();

    public static void diezNumerosImpares() {

        for(pr.contador = 1; pr.c < 10; pr.contador++){
            pr.a = pr.contador / 2;
            pr.b = pr.contador - (pr.a * 2);

            if(pr.b != 0){
                System.out.println("Primeros 10 numeros impares: " + pr.contador);
                pr.c++;
            }
        }
    }
}