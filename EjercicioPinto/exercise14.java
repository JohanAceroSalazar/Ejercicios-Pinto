public class exercise14 {

    public static Principal pr = new Principal();

    public static void numeroRomano() {
        switch (pr.a){
            case 1:{
                pr.a=1;
                System.out.println("equivalente a numero romano es: I");
                break;
            }
            case 2:{
                pr.a=2;
                System.out.println("equivalente a numero romano es: II");
                break;
            }
            case 3:{
                pr.a=3;
                System.out.println("equivalente a numero romano es: III");
                break;
            }
            case 4:{
                pr.a=4;
                System.out.println("equivalente a numero romano es: IV");
                break;
            }
            case 5:{
                pr.a=5;
                System.out.println("equivalente a numero romano es: V");
                break;
            }
            case 6:{
                pr.a=6;
                System.out.println("equivalente a numero romano es: VI");
                break;
            }
            case 7:{
                pr.a=7;
                System.out.println("equivalente a numero romano es: VII");
                break;
            }
            case 8:{
                pr.a=8;
                System.out.println("equivalente a numero romano es: VIII");
                break;
            }
            case 9:{
                pr.a=9;
                System.out.println("equivalente a numero romano es: IX");
                break;
            }
                case 10:{
                pr.a=10;
                System.out.println("equivalente a numero romano es: X");
            break;
            }       
        }
    }
}