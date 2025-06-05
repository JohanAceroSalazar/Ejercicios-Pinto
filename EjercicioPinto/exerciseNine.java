public class exerciseNine {

    public static Principal pr = new Principal();

    public static void edad() {
        

        pr.calcular = pr.a - pr.b;

        if(pr.calcular > 17){
            System.out.println("Debe solicitar su CUIL");
        }
        else{
            System.out.println("No debes solicitar su CUIL aun");
        }
    }
}