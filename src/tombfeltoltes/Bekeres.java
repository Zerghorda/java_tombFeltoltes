package tombfeltoltes;

import java.util.Scanner;

public class Bekeres {

    static Scanner sc = new Scanner(System.in, "latin2");

    public static void main(String[] args) {
        System.out.print("Hány nevet szeretne? ");
        int DB = sc.nextInt();
        sc.nextLine();
        String[] nevek = new String[DB];

        for (int i = 0; i < DB; i++) {
            System.out.print("Adjon egy nevet: ");
            String nev = sc.nextLine();
            nevek[i] = nev;
        }

        for (int i = 0; i < DB; i++) {
            System.out.printf("%d/%d: %s\n", DB, i + 1, nevek[i]);
        }
    }

}
