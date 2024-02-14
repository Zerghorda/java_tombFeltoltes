package feladatok;

import java.util.Random;
import java.util.Scanner;

public class VeletlenSzoveg {

    static Scanner sc = new Scanner(System.in, "latin2");
     static Random rnd = new Random();

    public static void main(String[] args) {
        String[] szoveg = new String[5];
        szoveg[0] = "Janí";
        szoveg[1] = "Alma";
        szoveg[2] = "A2";
        szoveg[3] = "Java";
        szoveg[4] = "Web";
        for (int i = 0; i < 3; i++) {
             int randomSzam =  rnd.nextInt(1,szoveg.length+1);
            System.out.printf("%d. szöveg: %s\n",i+1,szoveg[i]);
        }
    }
}
