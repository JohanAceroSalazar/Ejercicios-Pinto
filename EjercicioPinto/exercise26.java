public class exercise26 {

    public static Principal pr = new Principal();

    public static void fibonacci() {

        pr.a = 0;
        pr.b = 1;
        pr.c = pr.a + pr.b;

        System.out.println(pr.a);
        System.out.println(pr.b);

        while (pr.c < 100000) {
            System.out.println(pr.c);
            pr.a = pr.b;
            pr.b = pr.c;
            pr.c = pr.a + pr.b;
        }
    }
}