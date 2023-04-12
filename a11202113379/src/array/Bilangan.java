import java.util.Scanner;

public class Bilangan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Bilangan : ");
        int max = sc.nextInt();

        int a = 1;
        for (int i = 1; i <= max; i++) {
            System.out.print(i + " ");
            if (a == 5) {
                System.out.println();
                a = 0;
            }
            a++;
        }
        System.out.println("-----------------");
        
        System.out.print("Dipecah : ");
        int pecah = sc.nextInt();
        for (int i = 1; i <= max; i++) {
            System.out.print(i + " ");
            if (a == pecah) {
                System.out.println();
                a = 0;
            }
            a++;
        }
    }
}
