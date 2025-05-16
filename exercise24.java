import java.util.Scanner;

public class exercise24 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int serie = 1;

        while (serie < 1000) {
            System.out.println(serie);
            serie = (int) Math.pow(serie, 2) + 1;
        }
        scanner.close();
    }
}