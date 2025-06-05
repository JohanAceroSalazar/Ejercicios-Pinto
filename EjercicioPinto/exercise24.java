public class exercise24 {

    public static Principal pr = new Principal();

    public static void serie() {

        pr.a = 0;

        while (pr.a < 1000) {
            System.out.println(pr.a);
            pr.a = (int) Math.pow(pr.a, 2) + 1;
        }
    }
}