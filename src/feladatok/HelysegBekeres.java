package feladatok;

import java.util.Random;
import java.util.Scanner;

public class HelysegBekeres {

    static Scanner sc = new Scanner(System.in, "latin2");
    static Random rnd = new Random();

    public static void main(String[] args) {
        int max = 0;
        System.out.print("Hány helyet szeretne? ");

        int DB = sc.nextInt();
        sc.nextLine();
        String[] helyek = new String[DB];
        int[] letszamok = new int[DB];
        int[] paratlanok = new int[rnd.nextInt(15, 26)];

        for (int i = 0; i < DB; i++) {
            letszamok[i] = rnd.nextInt(1_000, 10_001);
        }

        for (int i = 1; i < DB; i++) {
            if (letszamok[i] > letszamok[max]) {
                max = i;
            }
        }

        for (int i = 0; i < DB; i++) {
            System.out.print("Adjon egy helyet: ");
            String hely = sc.nextLine();
            helyek[i] = hely;
        }
        System.out.println();
        for (int i = 0; i < DB; i++) {
            System.out.printf("%d. hely: %s ,létszáma : %d\n", i + 1, helyek[i], letszamok[i]);
        }
        System.out.printf("A legnagyobb létszámmal rendelkező hely: %s %d lakossal\n", helyek[max], letszamok[max]);
        System.out.println("Van e pontosan 1000 létszámu hely?");
        int i = 0;
        while (i < DB && !(letszamok[i] == 1000)) {
            i++;
        }
        if (i < DB) {
            System.out.println("Van");
        } else {
            System.out.println("Nincs");
        }
        System.out.println("Minen hol a létszám nagyobb mint 1000?");
        i = 0;
        while (i < DB && letszamok[i] > 1000) {
            i++;
        }

        if (i >= DB) {
            System.out.println("Igen");
        } else {
            System.out.println("Nem");
        }
        for ( i = 0; i < DB; i++) {
            int szam = rnd.nextInt(10, 100);
            if (szam % 2 == 0) {
                szam++;
                paratlanok[i] = szam;
            }
            paratlanok[rnd.nextInt(15, 26)] = paratlanok[i] - 1;
        }
        i = 0;
        while (!(paratlanok[i] % 2 == 0)) {            
            i++;
        }
        System.out.println("");
    }
}
