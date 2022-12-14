package cadenas;

import java.util.Random;
import java.util.Arrays;

public class StringYPalabras {

    /**
     * @param args
     */
    public static void main(String[] args) {

        Random sc = new Random();
        String a[] = new String[5];
        a[0] = "O";
        a[1] = "G";
        a[2] = "N";
        a[3] = "I";
        a[4] = "B";
        String palabras = "  ";
        String esp = "        ";
        int v1[] = new int[5];
        int v2[] = new int[5];
        int v3[] = new int[5];
        int v4[] = new int[5];
        int v5[] = new int[5];

        for (int i = 0; i < v1.length; i++) {
            v1[i] = sc.nextInt(20);
            v2[i] = sc.nextInt(100);
            v3[i] = sc.nextInt(100);
            v4[i] = sc.nextInt(100);
            v5[i] = sc.nextInt(100);
        }

        for (int i = 0; i < v1.length; i++) {
            palabras = a[i] + esp + palabras;
        }
        System.out.println(palabras);

        // NUMEROS DE BINGO
        for (int i = 0; i < v1.length; i++) {
            System.out.println(v1[i] + esp + v2[i] + esp + v3[i] + esp + v4[i] + esp + v5[i]);

        }

    }

}
