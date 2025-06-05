public class exercise28 {

    public static Principal pr = new Principal();

    public static void contadorVocalesConsonantes() {
        pr.a = 0;
        pr.b = 0;

        for(pr.contador = 1; pr.contador <= 10; pr.contador++){
            System.out.println("Ingrese una letra (" + pr.contador + " de 10):");
            pr.letras = pr.scanner.next().toLowerCase().charAt(0);

            switch (pr.letras) {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    pr.a++;
                break;
                    default:
                    if (Character.isLetter(pr.letras)) {
                        pr.b++;
                    } else {
                        System.out.println("No es una letra válida, no se cuenta.");
                    }
            }
            System.out.println("\nNúmero de vocales: " + pr.a);
            System.out.println("Número de consonantes: " + pr.b);
        }
    }
}