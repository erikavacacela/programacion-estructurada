package cadenas;
import java.util.Random;
public class SopaLetras {

    public static void main(String[] args) {
        Random sc = new Random();
        int num = 0;
        int c = 0;
        String palabras[] = {
            "Abecedario",
            "Abecegramas",
            "Anoche",
            "brillaron",
            "cerca",
            "chispeantes",
            "dos",
            "estrellas",
            "fugaces",
            "Acertijos",
            "con",
            "palabras",
            "Juegos",
            "de",
            "palabras",
            "ingenio",
            "Acr�nimos",
            "TALGO",
            "OTAN",
            "L�SER",
            "RADAR",
            "Acr�sticos",
            "Poemas",
            " palabras",
            "frases",
            "escondidas",
            "Aliteraci�n",
            "Nos",
            "gusta",
            "repetir",
            "y",
            "repetir",
            "fonemas",
            "Ambigramas",
            "Para",
            "leer",
            "boca",
            "arriba",
            " boca",
            "abajo",
            "An�fora",
            " transforman",
            "Anagramistas",
            "Escritores",
            "pseud�nimos",
            "anagram�ticos",
            "Animaladas",
            "El",
            "caballo",
            "relincha",
            "elefante",
            "barrita",
            "Apellidos",
            "familia"
        };
        char falta[] = {
            'a',
            'f',
            'g',
            'd',
            'q',
            'b',
            'h',
            'j',
            'a',
            'j',
            'o'
        };
        char crusi[][] = new char[10][10];
        String conjun[] = new String[10];


        for (int le = 0; le < conjun.length; le++) {
            int x = sc.nextInt(palabras.length);
            conjun[le] = palabras[x];
        }
        do {
            num = 0;
            for (int fi = 0; fi < crusi.length; fi++) {
                c = 0;
                for (int co = 0; co < crusi.length; co++) {
                    if (c < conjun[num].length()) {
                        char coje = conjun[num].charAt(c);
                        crusi[fi][co] = coje;
                        c++;
                    } else {
                        int x = sc.nextInt(falta.length);
                        crusi[fi][co] = falta[x];
                        x++;
                    }
                }
                num++;
            }
        } while (num < 10);
        for (int fi = 0; fi < crusi.length; fi++) {
            for (int co = 0; co < crusi.length; co++) {
                System.out.print(crusi[fi][co] + " ");
            }
            System.out.println();
        }
    }
}
