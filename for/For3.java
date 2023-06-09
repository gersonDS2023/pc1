package listaA;

import java.util.Scanner;

public class For3 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner (System.in);
		
		int contador;
		int ntab;
		int resultado;
		
		System.out.println ("Digite a tabuada : ");
		ntab = sc.nextInt();
		
		
		for (contador=0; contador<=10; contador ++) {
		    resultado = ntab * contador;
		    System.out.println (ntab + " x " + contador +  " = " + resultado);		    
			
		}

	}

}
