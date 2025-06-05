public class exerciseSix {

    public static Principal pr = new Principal();

    public static void areaDeTriangulo() {

        pr.N1 = (pr.A + pr.B + pr.C) / 2;
        pr.N2 = Math.sqrt (pr.N1 * (pr.N1 - pr.A) * (pr.N1 - pr.B) * (pr.N1 - pr.C));

        System.out.println("Area del triangulo: " + pr.N2);
    }
}