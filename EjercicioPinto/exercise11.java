public class exercise11 {

    public static Principal pr = new Principal();

    public static void produccionPromedia() {
        
        Principal.calcular = (Principal.a + Principal.b +Principal.c + Principal.d + Principal.e + Principal.f);
        Principal.calcular2 = Principal.calcular / 6;

        if(Principal.calcular2 >= 100){
            System.out.println("Recibira incentivos");
        }
        else{
            System.out.println("No recibira incentivos");
        }
    }
}