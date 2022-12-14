/*

Ingrese un número y obtenga su valor en letras

*/

package principal;

import java.util.Scanner;

public class DescripcionNumeros {
	public static void main(String []args){
		Scanner es =new Scanner(System.in);
		String numero;
			System.out.println("INGRESE UN NUMERO");
			numero= es.next();
			int c=0;
				while(c < numero.length()){
					if (numero.length()==7 && c ==0){
						switch(Integer.parseInt(String.valueOf(numero.charAt(c)))){
						case 1 : System.out.println("UN MILLON");break;
						}
						if (String.valueOf(numero.charAt(c=c+1)).compareTo("0")!=0){
										
						}
					}
					
					if (numero.length()==7 && c==1 ){
						switch(Integer.parseInt(String.valueOf(numero.charAt(c)))){
						case 0:System.out.println("");break;
						case 1 : System.out.println("CIEN");break;
						}
						if (String.valueOf(numero.charAt(c=c+1)).compareTo("0")!=0){
							
							
						}
					}
					
					
					if (numero.length()==7 && c==3 ){
					
					if ((Integer.parseInt(String.valueOf(numero.charAt(c))))==1 && (Integer.parseInt(String.valueOf(numero.charAt(c+1))))!=0){
						switch(Integer.parseInt(String.valueOf(numero.charAt(c)))){
							case 0:System.out.println("");break;
							case 1:System.out.println("ONCE");break;
							case 2:System.out.println("DOCE");break;
							case 3:System.out.println("TRECE");break;
							case 4:System.out.println("CATORCE");break;
							case 5:System.out.println("QUINCE");break;
							}
						
						}else{
							if ((Integer.parseInt(String.valueOf(numero.charAt(c))))==1 && (Integer.parseInt(String.valueOf(numero.charAt(c+1))))==0){
							switch(Integer.parseInt(String.valueOf(numero.charAt(c)))){
							case 0: System.out.println("");break;
							case 1:System.out.println("DIEZ");break;
							case 2:System.out.println("VEINTE");break;
							case 3:System.out.println("TREINTA");break;
							case 4:System.out.println("CUARENTA");break;
							case 5:System.out.println("CINCUENTA");break;
						}
							}
						
						}
					if (String.valueOf(numero.charAt(c=c+1)).compareTo("0")!=0){
						System.out.println("Y");
						
					}
						}
					
					if (numero.length()==7 && c==4 ){
						switch(Integer.parseInt(String.valueOf(numero.charAt(c)))){
						case 1 : System.out.println("UN");break;
						}
						if (String.valueOf(numero.charAt(c=c+1)).compareTo("0")!=0){
							System.out.println("MIL");
						
							
						}
						if (String.valueOf(numero.charAt(c=c+1)).compareTo("0")!=0){
							
							
						}
					}
					c=c+1;
						
				}
	}

}
