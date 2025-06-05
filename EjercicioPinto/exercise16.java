public class exercise16 {

    public static Principal pr = new Principal();

    public static void vocales() {

        switch (pr.a) {
            case 1:
            {
                pr.a=1;
                System.out.println("su vocal equivalente es: A");
                break;
            }
            case 2:
            {
                pr.a=2;
                System.out.println("su vocal equivalente es: E");
                break;
            }
            case 3:
            {
                pr.a=3;
                System.out.println("su vocal equivalente es: I");
                break;
            }
            case 4:
            {
                pr.a=4;
                System.out.println("su vocal equivalente es: O");
                break;
            }
            case 5:
            {
                pr.a=5;
                System.out.println("su vocal equivalente es: U");
                break;
            }
            default:
                System.out.println("Valor ingresado mayor a 5");
            break;
        
        }
    }
}