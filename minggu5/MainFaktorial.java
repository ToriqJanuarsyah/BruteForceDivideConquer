package minggu5;

import java.util.Scanner;

public class MainFaktorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan nilai : ");
        int n = input.nextInt();

        Faktorial fk = new Faktorial();
        System.out.println("nilai faktorial " + n + " menggunakan BF: " + fk.faktorialBF(n));
        System.out.println("nilai faktorial " + n + " menggunakan DC: " + fk.faktorialDC(n));
    }
}
