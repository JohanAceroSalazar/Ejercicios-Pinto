public class leerDatos {

    public static Principal pr = new Principal();

    
    public static void Scanneruno(){
        System.out.println("Ingrese el valor:");
        pr.a=pr.scanner.nextInt();   
    }
    public static void ScannerDos(){
        System.out.println("Ingrese el primer valor:");
        pr.a=pr.scanner.nextInt();
        System.out.println("Ingrese el segundo valor:");
        pr.b=pr.scanner.nextInt();
    }
    public static void ScannerTres(){
        System.out.println("Ingrese el primer valor:");
        pr.a=pr.scanner.nextInt();
        System.out.println("Ingrese el segundo valor:");
        pr.b=pr.scanner.nextInt();
        System.out.println("Ingrese el tercer valor:");
        pr.c=pr.scanner.nextInt();
    }
    public static void ScannerCinco(){
        System.out.println("Ingrese el primer valor:");
        pr.a=pr.scanner.nextInt();
        System.out.println("Ingrese el segundo valor:");
        pr.b=pr.scanner.nextInt();
        System.out.println("Ingrese el tercer valor:");
        pr.c=pr.scanner.nextInt();
        System.out.println("Ingrese el cuarto valor:");
        pr.d=pr.scanner.nextInt();
        System.out.println("Ingrese el quinto valor:");
        pr.e=pr.scanner.nextInt();
    }
    public static void ScannerSeis(){
        System.out.println("Ingrese el primer valor:");
        pr.a=pr.scanner.nextInt();
        System.out.println("Ingrese el segundo valor:");
        pr.b=pr.scanner.nextInt();
        System.out.println("Ingrese el tercer valor:");
        pr.c=pr.scanner.nextInt();
        System.out.println("Ingrese el cuarto valor:");
        pr.d=pr.scanner.nextInt();
        System.out.println("Ingrese el quinto valor:");
        pr.e=pr.scanner.nextInt();
        System.out.println("Ingrese el sexto valor:");
        pr.f=pr.scanner.nextInt();
    }
    
    public static void ScannerUnoD(){
        System.out.println("Ingrese el valor:");
        pr.A=pr.scanner.nextDouble();   
    }
    public static void ScannerTresD(){
        System.out.println("Ingrese el valor:");
        pr.A=pr.scanner.nextDouble(); 
        System.out.println("Ingrese el valor:");
        pr.B=pr.scanner.nextDouble(); 
        System.out.println("Ingrese el valor:");
        pr.C=pr.scanner.nextDouble();   
    }
    public static void ScannerCuatroD(){
        System.out.println("Ingrese el primer valor:");
        pr.A=pr.scanner.nextInt();
        System.out.println("Ingrese el segundo valor:");
        pr.B=pr.scanner.nextInt();
        System.out.println("Ingrese el tercer valor:");
        pr.C=pr.scanner.nextInt();
        System.out.println("Ingrese el cuarto valor:");
        pr.D=pr.scanner.nextInt();
    }
    public static void ScannerChar(){ 
        System.out.print("Ingrese una letra: ");
        pr.letras = pr.scanner.next().charAt(0);
    }
}