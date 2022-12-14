/*

Ingrese un número y obtenga su valor en letras

*/

package numeros;

import java.util.Scanner;

public class NumberToWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("INGRESE UN NUMERO");
        System.out.println(" ");
        String numero = sc.next();
        int c = 0;

        for (c = 0; c <= numero.length(); c++) {

            if (numero.length() == 7 && c == 0) {
                switch (Integer.parseInt(String.valueOf(numero.charAt(c)))) {
                    case 1:
                        System.out.println("UN MILLON");
                        break;
                }

            }

            if ((numero.length() - 1) == 6 && c == 0 || (numero.length() == 6) && c == 0) {

                switch (Integer.parseInt(String.valueOf(numero.charAt(c)))) {
                    case 1:
                        if ((numero.length() - 1) == 6 && c == 0) {
                            c = c + 1;
                            switch (Integer.parseInt(String.valueOf(numero.charAt(c)))) {
                                case 1:
                                    System.out.println("CIEN");
                                    break;
                            }
                        } else {
                            if ((numero.length() == 6) && c == 0) {
                                System.out.println("CIEN");
                            }
                        }
                        break;
                    case 2:
                        if ((numero.length() - 1) == 6 && c == 0) {
                            c = c + 1;
                            switch (Integer.parseInt(String.valueOf(numero.charAt(c)))) {
                                case 2:
                                    System.out.println("DOSCIENTOS");
                                    break;
                            }
                        } else {
                            if ((numero.length() == 6) && c == 0) {
                                System.out.println("DOSCIENTOS");
                            }
                        }
                        break;
                    case 3:
                        if ((numero.length() - 1) == 6 && c == 0) {
                            c = c + 1;
                            switch (Integer.parseInt(String.valueOf(numero.charAt(c)))) {
                                case 3:
                                    System.out.println("TRESCIENTOS");
                                    break;
                            }
                        } else {
                            if ((numero.length() == 6) && c == 0) {
                                System.out.println("TRESCIENTOS");
                            }
                        }
                        break;
                    case 4:
                        if ((numero.length() - 1) == 6 && c == 0) {
                            c = c + 1;
                            switch (Integer.parseInt(String.valueOf(numero.charAt(c)))) {
                                case 4:
                                    System.out.println("CUATROCIENTOS");
                                    break;
                            }
                        } else {
                            if ((numero.length() == 6) && c == 0) {
                                System.out.println("CUATROCIENTOS");
                            }
                        }
                        break;
                    case 5:
                        if ((numero.length() - 1) == 6 && c == 0) {
                            c = c + 1;
                            switch (Integer.parseInt(String.valueOf(numero.charAt(c)))) {
                                case 5:
                                    System.out.println("QUINIENTOS");
                                    break;
                            }
                        } else {
                            if ((numero.length() == 6) && c == 0) {
                                System.out.println("QUINIENTOS");
                            }
                        }
                        break;
                    case 6:
                        if ((numero.length() - 1) == 6 && c == 0) {
                            c = c + 1;
                            switch (Integer.parseInt(String.valueOf(numero.charAt(c)))) {
                                case 6:
                                    System.out.println("SEISCIENTOS");
                                    break;
                            }
                        } else {
                            if ((numero.length() == 6) && c == 0) {
                                System.out.println("SEISCIENTOS");
                            }
                        }
                        break;
                    case 7:
                        if ((numero.length() - 1) == 6 && c == 0) {
                            c = c + 1;
                            switch (Integer.parseInt(String.valueOf(numero.charAt(c)))) {
                                case 7:
                                    System.out.println("SETECIENTOS");
                                    break;
                            }
                        } else {
                            if ((numero.length() == 6) && c == 0) {
                                System.out.println("SETECIENTOS");
                            }
                        }
                        break;

                    case 8:
                        if ((numero.length() - 1) == 6 && c == 0) {
                            c = c + 1;
                            switch (Integer.parseInt(String.valueOf(numero.charAt(c)))) {
                                case 8:
                                    System.out.println("OCHOCIENTOS");
                                    break;
                            }
                        } else {
                            if ((numero.length() == 6) && c == 0) {
                                System.out.println("OCHOCIENTOS");
                            }
                        }
                        break;

                    case 9:
                        if ((numero.length() - 1) == 6 && c == 0) {
                            c = c + 1;
                            switch (Integer.parseInt(String.valueOf(numero.charAt(c)))) {
                                case 9:
                                    System.out.println("NOVECIENTOS");
                                    break;
                            }
                        } else {
                            if ((numero.length() == 6) && c == 0) {
                                System.out.println("NOVECIENTOS");
                            }
                        }
                        break;

                }

            }
            if ((numero.length() - 2) == 5 && c == 0 || (numero.length() == 5) && c == 0) {

                switch (Integer.parseInt(String.valueOf(numero.charAt(c)))) {
                    case 1:
                        if ((numero.length() - 2) == 5 && c == 0) {
                            c = c + 1;
                            switch (Integer.parseInt(String.valueOf(numero.charAt(c)))) {
                                case 1:
                                    System.out.println("DIEZ");
                                    break;
                            }
                        } else {
                            if ((numero.length() == 5) && c == 0) {
                                System.out.println("DIEZ");
                            }
                        }
                        break;
                    case 2:
                        if ((numero.length() - 2) == 5 && c == 0) {
                            c = c + 1;
                            switch (Integer.parseInt(String.valueOf(numero.charAt(c)))) {
                                case 2:
                                    System.out.println("VEINTE");
                                    break;
                            }
                        } else {
                            if ((numero.length() == 5) && c == 0) {
                                System.out.println("VEINTE");
                            }
                        }
                        break;
                    case 3:
                        if ((numero.length() - 3) == 5 && c == 0) {
                            c = c + 1;
                            switch (Integer.parseInt(String.valueOf(numero.charAt(c)))) {
                                case 3:
                                    System.out.println("TREINTA");
                                    break;
                            }
                        } else {
                            if ((numero.length() == 5) && c == 0) {
                                System.out.println("TREINTA");
                            }
                        }
                        break;
                    case 4:
                        if ((numero.length() - 2) == 5 && c == 0) {
                            c = c + 1;
                            switch (Integer.parseInt(String.valueOf(numero.charAt(c)))) {
                                case 4:
                                    System.out.println("CUARENTA");
                                    break;
                            }
                        } else {
                            if ((numero.length() == 5) && c == 0) {
                                System.out.println("CUARENTA");
                            }
                        }
                        break;
                    case 5:
                        if ((numero.length() - 2) == 5 && c == 0) {
                            c = c + 1;
                            switch (Integer.parseInt(String.valueOf(numero.charAt(c)))) {
                                case 5:
                                    System.out.println("CINCUENTA");
                                    break;
                            }
                        } else {
                            if ((numero.length() == 5) && c == 0) {
                                System.out.println("CINCUENTA");
                            }
                        }
                        break;
                    case 6:
                        if ((numero.length() - 2) == 5 && c == 0) {
                            c = c + 1;
                            switch (Integer.parseInt(String.valueOf(numero.charAt(c)))) {
                                case 6:
                                    System.out.println("SESENTA");
                                    break;
                            }
                        } else {
                            if ((numero.length() == 5) && c == 0) {
                                System.out.println("SESENTA");
                            }
                        }
                        break;
                    case 7:
                        if ((numero.length() - 2) == 5 && c == 0) {
                            c = c + 1;
                            switch (Integer.parseInt(String.valueOf(numero.charAt(c)))) {
                                case 7:
                                    System.out.println("SETENTA");
                                    break;
                            }
                        } else {
                            if ((numero.length() == 5) && c == 0) {
                                System.out.println("SETENTA");
                            }
                        }
                        break;

                    case 8:
                        if ((numero.length() - 2) == 5 && c == 0) {
                            c = c + 1;
                            switch (Integer.parseInt(String.valueOf(numero.charAt(c)))) {
                                case 8:
                                    System.out.println("OCHENTA");
                                    break;
                            }
                        } else {
                            if ((numero.length() == 5) && c == 0) {
                                System.out.println("OCHENTA");
                            }
                        }
                        break;

                    case 9:
                        if ((numero.length() - 2) == 5 && c == 0) {
                            c = c + 1;
                            switch (Integer.parseInt(String.valueOf(numero.charAt(c)))) {
                                case 9:
                                    System.out.println("NOVENTA");
                                    break;
                            }
                        } else {
                            if ((numero.length() == 6) && c == 0) {
                                System.out.println("NOVENTA");
                            }
                        }
                        break;

                }

            }
            if ((numero.length() - 3) == 4 && c == 0 || (numero.length() == 4) && c == 0) {

                switch (Integer.parseInt(String.valueOf(numero.charAt(c)))) {
                    case 1:
                        if ((numero.length() - 3) == 4 && c == 0) {
                            c = c + 1;
                            switch (Integer.parseInt(String.valueOf(numero.charAt(c)))) {
                                case 1:
                                    System.out.println("UNO");
                                    break;
                            }
                        } else {
                            if ((numero.length() == 4) && c == 0) {
                                System.out.println("UNO");
                            }
                        }
                        break;
                    case 2:
                        if ((numero.length() - 3) == 4 && c == 0) {
                            c = c + 1;
                            switch (Integer.parseInt(String.valueOf(numero.charAt(c)))) {
                                case 2:
                                    System.out.println("DOS");
                                    break;
                            }
                        } else {
                            if ((numero.length() == 4) && c == 0) {
                                System.out.println("DOS");
                            }
                        }
                        break;
                    case 3:
                        if ((numero.length() - 3) == 4 && c == 0) {
                            c = c + 1;
                            switch (Integer.parseInt(String.valueOf(numero.charAt(c)))) {
                                case 3:
                                    System.out.println("TRES");
                                    break;
                            }
                        } else {
                            if ((numero.length() == 4) && c == 0) {
                                System.out.println("TRES");
                            }
                        }
                        break;
                    case 4:
                        if ((numero.length() - 3) == 4 && c == 0) {
                            c = c + 1;
                            switch (Integer.parseInt(String.valueOf(numero.charAt(c)))) {
                                case 4:
                                    System.out.println("CUATRO");
                                    break;
                            }
                        } else {
                            if ((numero.length() == 4) && c == 0) {
                                System.out.println("CUATRO");
                            }
                        }
                        break;
                    case 5:
                        if ((numero.length() - 3) == 4 && c == 0) {
                            c = c + 1;
                            switch (Integer.parseInt(String.valueOf(numero.charAt(c)))) {
                                case 5:
                                    System.out.println("CINCO");
                                    break;
                            }
                        } else {
                            if ((numero.length() == 4) && c == 0) {
                                System.out.println("CINCO");
                            }
                        }
                        break;
                    case 6:
                        if ((numero.length() - 3) == 4 && c == 0) {
                            c = c + 1;
                            switch (Integer.parseInt(String.valueOf(numero.charAt(c)))) {
                                case 6:
                                    System.out.println("SEIS");
                                    break;
                            }
                        } else {
                            if ((numero.length() == 4) && c == 0) {
                                System.out.println("SEIS");
                            }
                        }
                        break;
                    case 7:
                        if ((numero.length() - 3) == 4 && c == 0) {
                            c = c + 1;
                            switch (Integer.parseInt(String.valueOf(numero.charAt(c)))) {
                                case 7:
                                    System.out.println("SIETE");
                                    break;
                            }
                        } else {
                            if ((numero.length() == 4) && c == 0) {
                                System.out.println("SIETE");
                            }
                        }
                        break;

                    case 8:
                        if ((numero.length() - 3) == 4 && c == 0) {
                            c = c + 1;
                            switch (Integer.parseInt(String.valueOf(numero.charAt(c)))) {
                                case 8:
                                    System.out.println("OCHO");
                                    break;
                            }
                        } else {
                            if ((numero.length() == 4) && c == 0) {
                                System.out.println("OCHO");
                            }
                        }
                        break;

                    case 9:
                        if ((numero.length() - 3) == 4 && c == 0) {
                            c = c + 1;
                            switch (Integer.parseInt(String.valueOf(numero.charAt(c)))) {
                                case 9:
                                    System.out.println("NUEVE");
                                    break;
                            }
                        } else {
                            if ((numero.length() == 4) && c == 0) {
                                System.out.println("NUEVE");
                            }
                        }
                        break;

                }

            }

            if ((numero.length() - 4) == 3 && c == 0 || (numero.length() == 3) && c == 0) {

                switch (Integer.parseInt(String.valueOf(numero.charAt(c)))) {
                    case 1:
                        if ((numero.length() - 4) == 3 && c == 0) {
                            c = c + 1;
                            switch (Integer.parseInt(String.valueOf(numero.charAt(c)))) {
                                case 1:
                                    System.out.println("CIEN");
                                    break;
                            }
                        } else {
                            if ((numero.length() == 3) && c == 0) {
                                System.out.println("CIEN");
                            }
                        }
                        break;
                    case 2:
                        if ((numero.length() - 4) == 3 && c == 0) {
                            c = c + 1;
                            switch (Integer.parseInt(String.valueOf(numero.charAt(c)))) {
                                case 2:
                                    System.out.println("DOSCIENTOS");
                                    break;
                            }
                        } else {
                            if ((numero.length() == 3) && c == 0) {
                                System.out.println("DOSCIENTOS");
                            }
                        }
                        break;
                    case 3:
                        if ((numero.length() - 4) == 3 && c == 0) {
                            c = c + 1;
                            switch (Integer.parseInt(String.valueOf(numero.charAt(c)))) {
                                case 3:
                                    System.out.println("TRESCIENTOS");
                                    break;
                            }
                        } else {
                            if ((numero.length() == 3) && c == 0) {
                                System.out.println("TRESCIENTOS");
                            }
                        }
                        break;
                    case 4:
                        if ((numero.length() - 4) == 3 && c == 0) {
                            c = c + 1;
                            switch (Integer.parseInt(String.valueOf(numero.charAt(c)))) {
                                case 4:
                                    System.out.println("CUATROCIENTOS");
                                    break;
                            }
                        } else {
                            if ((numero.length() == 3) && c == 0) {
                                System.out.println("CUATROCIENTOS");
                            }
                        }
                        break;
                    case 5:
                        if ((numero.length() - 4) == 3 && c == 0) {
                            c = c + 1;
                            switch (Integer.parseInt(String.valueOf(numero.charAt(c)))) {
                                case 5:
                                    System.out.println("QUINIENTOS");
                                    break;
                            }
                        } else {
                            if ((numero.length() == 3) && c == 0) {
                                System.out.println("QUINIENTOS");
                            }
                        }
                        break;
                    case 6:
                        if ((numero.length() - 4) == 3 && c == 0) {
                            c = c + 1;
                            switch (Integer.parseInt(String.valueOf(numero.charAt(c)))) {
                                case 6:
                                    System.out.println("SEISCIENTOS");
                                    break;
                            }
                        } else {
                            if ((numero.length() == 3) && c == 0) {
                                System.out.println("SEISCIENTOS");
                            }
                        }
                        break;
                    case 7:
                        if ((numero.length() - 4) == 3 && c == 0) {
                            c = c + 1;
                            switch (Integer.parseInt(String.valueOf(numero.charAt(c)))) {
                                case 7:
                                    System.out.println("SETECIENTOS");
                                    break;
                            }
                        } else {
                            if ((numero.length() == 3) && c == 0) {
                                System.out.println("SETECIENTOS");
                            }
                        }
                        break;

                    case 8:
                        if ((numero.length() - 4) == 3 && c == 0) {
                            c = c + 1;
                            switch (Integer.parseInt(String.valueOf(numero.charAt(c)))) {
                                case 8:
                                    System.out.println("OCHOCIENTOS");
                                    break;
                            }
                        } else {
                            if ((numero.length() == 3) && c == 0) {
                                System.out.println("OCHOCIENTOS");
                            }
                        }
                        break;

                    case 9:
                        if ((numero.length() - 4) == 3 && c == 0) {
                            c = c + 1;
                            switch (Integer.parseInt(String.valueOf(numero.charAt(c)))) {
                                case 9:
                                    System.out.println("NOVECIENTOS");
                                    break;
                            }
                        } else {
                            if ((numero.length() == 3) && c == 0) {
                                System.out.println("NOVECIENTOS");
                            }
                        }
                        break;

                }

            }
            if ((numero.length() - 5) == 2 && c == 0 || (numero.length() == 2) && c == 0) {

                switch (Integer.parseInt(String.valueOf(numero.charAt(c)))) {
                    case 1:
                        if ((numero.length() - 5) == 2 && c == 0) {
                            c = c + 1;
                            switch (Integer.parseInt(String.valueOf(numero.charAt(c)))) {
                                case 1:
                                    System.out.println("DIEZ");
                                    break;
                            }
                        } else {
                            if ((numero.length() == 2) && c == 0) {
                                System.out.println("DIEZ");
                            }
                        }
                        break;
                    case 2:
                        if ((numero.length() - 5) == 2 && c == 0) {
                            c = c + 1;
                            switch (Integer.parseInt(String.valueOf(numero.charAt(c)))) {
                                case 2:
                                    System.out.println("VEINTE");
                                    break;
                            }
                        } else {
                            if ((numero.length() == 2) && c == 0) {
                                System.out.println("VEINTE");
                            }
                        }
                        break;
                    case 3:
                        if ((numero.length() - 5) == 2 && c == 0) {
                            c = c + 1;
                            switch (Integer.parseInt(String.valueOf(numero.charAt(c)))) {
                                case 3:
                                    System.out.println("TREINTA");
                                    break;
                            }
                        } else {
                            if ((numero.length() == 2) && c == 0) {
                                System.out.println("TREINTA");
                            }
                        }
                        break;
                    case 4:
                        if ((numero.length() - 5) == 2 && c == 0) {
                            c = c + 1;
                            switch (Integer.parseInt(String.valueOf(numero.charAt(c)))) {
                                case 4:
                                    System.out.println("CUARENTA");
                                    break;
                            }
                        } else {
                            if ((numero.length() == 2) && c == 0) {
                                System.out.println("CUARENTA");
                            }
                        }
                        break;
                    case 5:
                        if ((numero.length() - 5) == 2 && c == 0) {
                            c = c + 1;
                            switch (Integer.parseInt(String.valueOf(numero.charAt(c)))) {
                                case 5:
                                    System.out.println("CINCUENTA");
                                    break;
                            }
                        } else {
                            if ((numero.length() == 2) && c == 0) {
                                System.out.println("CINCUENTA");
                            }
                        }
                        break;
                    case 6:
                        if ((numero.length() - 5) == 2 && c == 0) {
                            c = c + 1;
                            switch (Integer.parseInt(String.valueOf(numero.charAt(c)))) {
                                case 5:
                                    System.out.println("SESENTA");
                                    break;
                            }
                        } else {
                            if ((numero.length() == 2) && c == 0) {
                                System.out.println("SESENTA");
                            }
                        }
                        break;
                    case 7:
                        if ((numero.length() - 5) == 2 && c == 0) {
                            c = c + 1;
                            switch (Integer.parseInt(String.valueOf(numero.charAt(c)))) {
                                case 7:
                                    System.out.println("SETENTA");
                                    break;
                            }
                        } else {
                            if ((numero.length() == 2) && c == 0) {
                                System.out.println("SETENTA");
                            }
                        }
                        break;

                    case 8:
                        if ((numero.length() - 5) == 2 && c == 0) {
                            c = c + 1;
                            switch (Integer.parseInt(String.valueOf(numero.charAt(c)))) {
                                case 8:
                                    System.out.println("OCHENTA");
                                    break;
                            }
                        } else {
                            if ((numero.length() == 2) && c == 0) {
                                System.out.println("OCHENTA");
                            }
                        }
                        break;

                    case 9:
                        if ((numero.length() - 5) == 2 && c == 0) {
                            c = c + 1;
                            switch (Integer.parseInt(String.valueOf(numero.charAt(c)))) {
                                case 9:
                                    System.out.println("NOVENTA");
                                    break;
                            }
                        } else {
                            if ((numero.length() == 2) && c == 0) {
                                System.out.println("NOVENTA");
                            }
                        }
                        break;

                }

            }
            if ((numero.length() - 6) == 1 && c == 0 || (numero.length() == 1) && c == 0) {

                switch (Integer.parseInt(String.valueOf(numero.charAt(c)))) {
                    case 1:
                        if ((numero.length() - 6) == 1 && c == 0) {
                            c = c + 1;
                            switch (Integer.parseInt(String.valueOf(numero.charAt(c)))) {
                                case 1:
                                    System.out.println("UNO");
                                    break;
                            }
                        } else {
                            if ((numero.length() == 1) && c == 0) {
                                System.out.println("UNO");
                            }
                        }
                        break;
                    case 2:
                        if ((numero.length() - 6) == 1 && c == 0) {
                            c = c + 1;
                            switch (Integer.parseInt(String.valueOf(numero.charAt(c)))) {
                                case 2:
                                    System.out.println("DOS");
                                    break;
                            }
                        } else {
                            if ((numero.length() == 1) && c == 0) {
                                System.out.println("DOS");
                            }
                        }
                        break;
                    case 3:
                        if ((numero.length() - 6) == 1 && c == 0) {
                            c = c + 1;
                            switch (Integer.parseInt(String.valueOf(numero.charAt(c)))) {
                                case 3:
                                    System.out.println("TRES");
                                    break;
                            }
                        } else {
                            if ((numero.length() == 1) && c == 0) {
                                System.out.println("TRES");
                            }
                        }
                        break;
                    case 4:
                        if ((numero.length() - 6) == 1 && c == 0) {
                            c = c + 1;
                            switch (Integer.parseInt(String.valueOf(numero.charAt(c)))) {
                                case 4:
                                    System.out.println("CUATRO");
                                    break;
                            }
                        } else {
                            if ((numero.length() == 1) && c == 0) {
                                System.out.println("CUATRO");
                            }
                        }
                        break;
                    case 5:
                        if ((numero.length() - 6) == 1 && c == 0) {
                            c = c + 1;
                            switch (Integer.parseInt(String.valueOf(numero.charAt(c)))) {
                                case 5:
                                    System.out.println("CINCO");
                                    break;
                            }
                        } else {
                            if ((numero.length() == 1) && c == 0) {
                                System.out.println("CINCO");
                            }
                        }
                        break;
                    case 6:
                        if ((numero.length() - 6) == 1 && c == 0) {
                            c = c + 1;
                            switch (Integer.parseInt(String.valueOf(numero.charAt(c)))) {
                                case 5:
                                    System.out.println("SEIS");
                                    break;
                            }
                        } else {
                            if ((numero.length() == 1) && c == 0) {
                                System.out.println("SEIS");
                            }
                        }
                        break;
                    case 7:
                        if ((numero.length() - 6) == 1 && c == 0) {
                            c = c + 1;
                            switch (Integer.parseInt(String.valueOf(numero.charAt(c)))) {
                                case 7:
                                    System.out.println("SIETE");
                                    break;
                            }
                        } else {
                            if ((numero.length() == 1) && c == 0) {
                                System.out.println("SIETE");
                            }
                        }
                        break;

                    case 8:
                        if ((numero.length() - 6) == 1 && c == 0) {
                            c = c + 1;
                            switch (Integer.parseInt(String.valueOf(numero.charAt(c)))) {
                                case 8:
                                    System.out.println("OCHO");
                                    break;
                            }
                        } else {
                            if ((numero.length() == 1) && c == 0) {
                                System.out.println("OCHO");
                            }
                        }
                        break;

                    case 9:
                        if ((numero.length() - 6) == 1 && c == 0) {
                            c = c + 1;
                            switch (Integer.parseInt(String.valueOf(numero.charAt(c)))) {
                                case 9:
                                    System.out.println("NUEVE");
                                    break;
                            }
                        } else {
                            if ((numero.length() == 1) && c == 0) {
                                System.out.println("NUEVE");
                            }
                        }
                        break;

                }

            }

        }

    }

}

