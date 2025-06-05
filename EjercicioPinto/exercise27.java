public class exercise27 {

    public static Principal pr = new Principal();

    public static void operacionConOperador() {

        pr.calcular = 0;
        switch (pr.letras) {
            case '+':
                pr.calcular = pr.a + pr.b;
                System.out.println("Resultado: " + pr.calcular);
                break;
            case '-':
                pr.calcular = pr.a - pr.b;
                System.out.println("Resultado: " + pr.calcular);
                break;
            case '*':
                pr.calcular = pr.a * pr.b;
                System.out.println("Resultado: " + pr.calcular);
                break;
            case '^':
                pr.calcular = (int) Math.pow(pr.a, pr.b);
                System.out.println("Resultado: " + pr.calcular);
                break;
            default:
                System.out.println("Opcion inválido.");
                break;
        }
    }
}