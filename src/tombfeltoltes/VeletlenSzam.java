package tombfeltoltes;

import java.util.Random;
import java.util.Scanner;

public class VeletlenSzam {

    static Random rnd = new Random();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in, "latin2");
        System.out.print("Hány kort akar? ");
        int db = sc.nextInt();
        int[] korok = new int[db];
        sc.nextLine();
        for (int i = 0; i < db; i++) {
            korok[i] = rnd.nextInt(1, 101);
        }
        for (int i = 0; i < db; i++) {
            System.out.printf("%d/%d kor: %d", db, i + 1, korok[i]);
        }
    }
}
