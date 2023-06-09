package listaA;

import java.util.Scanner;

public class For2 {

	public static void main(String[] args) {

		Scanner sc=new Scanner (System.in);
		
		int contador;
		int ntab=5;
		int resultado;
		
		for (contador=0; contador<=10; contador++) {
		    resultado = contador * ntab;
		    System.out.println (ntab + " X " + contador + " = " +  resultado);
		}
		
		
	}

}
