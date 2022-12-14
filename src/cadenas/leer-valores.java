package cadenas;
import java.util.Scanner;
public class Palabras {
    public static void main(String[] args) {
        /*String texto= "Prueba de Texto";
        String esp=" ";
        System.out.println(texto.length());
        	for (int i= texto.length();i>0;i--){
        		System.out.println(texto.charAt(i));
        		
        	}*/

        Scanner sc = new Scanner(System.in);
        System.out.println("numero");
        double a = sc.nextDouble();
        double b = Math.tan(a);
        double c = Math.toRadians(b);
        System.out.println(c);
    }

}
