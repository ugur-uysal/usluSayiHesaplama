import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n, k, total = 1;

        Scanner scn = new Scanner(System.in);

        System.out.print("Üssü alınacak sayıyı giriniz : ");
        n = scn.nextInt();

        System.out.print("Üs alınacak sayıyı giriniz : ");
        k = scn.nextInt();

        for (int i = 1; i <= k; i++) {
            total *= n;
        }

        System.out.print(n+"^"+k+ " = " + total);

    }
}