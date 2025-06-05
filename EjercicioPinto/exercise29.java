public class exercise29 {

    public static Principal pr = new Principal();
    
    public static void votaciones() {
        

        pr.a = 0;
        pr.b = 0;
        pr.c = 0;
        pr.d = 0;

        for (pr.contador = 1; pr.contador <= 10; pr.contador++) {
            System.out.print("Ingrese el voto " + pr.contador + " 1, 2, 3 o 4 para seleccionar su voto: ");
            pr.e = pr.scanner.nextInt();

            switch (pr.e) {
                case 1:
                pr.a++;
                break;
                case 2:
                pr.b++;
                break;
            case 3:
                pr.c++;
                break;
            default:
                pr.d++;
            }   
        }

        if (pr.a > pr.b && pr.a > pr.c && pr.a > pr.d) {
            pr.calcular = 1;
        } else if (pr.b > pr.a && pr.b > pr.c && pr.b > pr.d) {
            pr.calcular = 2;
        } else if (pr.c > pr.a && pr.c > pr.b && pr.c > pr.d) {
            pr.calcular = 3;
        } else {
            pr.calcular = 0; 
        }

                        
        System.out.println("Resultados:");
        System.out.println("Candidato 1: " + pr.a + " votos");
        System.out.println("Candidato 2: " + pr.b + " votos");
        System.out.println("Candidato 3: " + pr.c + " votos");
        System.out.println("Votos nulos o en blanco: " + pr.d);

        if (pr.calcular == 0) {
            System.out.println("No hay un ganador claro o ganó el voto nulo/blanco.");
        } else {
            System.out.println("El ganador es el Candidato " + pr.calcular);
        }
    }
}