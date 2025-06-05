public class exercise15 {

    public static Principal pr = new Principal();

    public static void montoVenta() {

        pr.calcular=0;

        switch (pr.a) {
            case 1:
                if (pr.a>=0 && pr.a<1000) {
                    pr.calcular=(0*pr.a)/100;
                }

                break;

            case 2:
            
                if (pr.a>=1000 && pr.a<5000) {
                    pr.calcular=(3*pr.a)/100;
                }

                break;

            case 3:
            
                if (pr.a>=5000 && pr.a<20000) {
                    pr.calcular=(5*pr.a)/100;
                }

                break;
            
            case 4:
            
                if (pr.a==20000) {
                    pr.calcular=(8*pr.a)/100;
                } 

                break; 
            
            default:
            
            break;
        }
        System.out.println("Su bonificacion es: " + pr.a);
    }
}