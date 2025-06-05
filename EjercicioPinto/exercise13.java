public class exercise13 {

    public static Principal pr = new Principal();

    public static void tipoDeTriangulo() {

        if (pr.a != pr.b && pr.b != pr.c && pr.c != pr.a){
            System.out.println("El triangulo es Escaleno");
        } 
        else if(pr.a == pr.b && pr.b == pr.c){
            System.out.println("El triangulo es Equilatero");
        } 
        else {
            System.out.println("El triangulo es Isosceles");
        }
    }
}