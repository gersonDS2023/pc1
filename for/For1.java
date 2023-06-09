package listaA;

import java.util.Scanner;

public class For1 {

	public static void main(String[] args) {

		Scanner sc=new Scanner (System.in);

		System.out.println ("Digite a qtd. de vezes para imprimir o nome : ");
		int num = sc.nextInt();
		int contador;
		
		for (contador=0; contador<num; contador++) {
			
			System.out.println ("Etec - Curso Tecnico (Inform�tica)" + (contador+1));
		}
		
		
	}

}
