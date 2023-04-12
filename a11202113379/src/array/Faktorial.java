import java.util.Scanner;

public class Faktorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Bilangan : ");
        int n = sc.nextInt();

        int faktorial = 1;
        int prev = 1;
        for (int i = 1; i <= n; i++) {
            faktorial *= i;
            if (i > 1) {
                System.out.print(prev + " x " + i + " = ");
                prev = faktorial;
                System.out.println(prev);
            }
        }
    }
}
