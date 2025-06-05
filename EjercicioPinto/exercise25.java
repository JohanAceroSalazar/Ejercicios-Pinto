public class exercise25 {

    public static Principal pr = new Principal();

    public static void vocal() {
        
        pr.SEMAF = 'V';

        while (pr.SEMAF == 'V') {
            System.out.print("Ingrese una letra: ");
            pr.letras = pr.scanner.next().charAt(0);

            switch (Character.toLowerCase(pr.letras)) {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    pr.SEMAF = 'R';
                    break;
                default:
                    pr.SEMAF = 'V';
                    System.out.println("No es una vocal, intente de nuevo");
                break;
            }              
        }
        System.out.println("Se ingreso una vocal");
    }
}