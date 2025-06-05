public class exercise12 {

    public static Principal pr = new Principal();

    public static void numeroMayor() {

        if(Principal.a > Principal.b && Principal.a > Principal.c){
            Principal.calcular = Principal.a;
        }
        else if(Principal.b > Principal.c){
            Principal.calcular = Principal.b;
        }
        else{
            Principal.calcular = Principal.c;
        }
        System.out.println("Numero Mayor: " + Principal.calcular);
    }
}