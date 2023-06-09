package listaA;

import java.util.Scanner;

public class Picole {

	public static void main(String[] args) {
		
		double p1=3.00;
		double p2=6.00;
		double p3=12.00;
		
		double total=0.00;
		
		Scanner sc=new Scanner (System.in);
		
		System.out.println ("Picole 1 =  R$ 3.00");
		System.out.println ("Picole 2 =  R$ 6.00");
		System.out.println ("Picole 3 =  R$ 12.00");
		System.out.println ("");
		System.out.println ("-----------------------------");
			
		System.out.println ("Digite o codigo do picolé desejado : ");
		int codigoPicole=sc.nextInt();
		
		System.out.println ("Digite a quantidade desejada : ");
		int qtdPicole=sc.nextInt();
		
		//verificar qual o picole escolhido
		
		if (codigoPicole==1) {
			total=qtdPicole*p1;
			
		}
		
		if (codigoPicole==2) {
			total=qtdPicole*p2;
			
		}
		
		if (codigoPicole==3) {
			total=qtdPicole*p3;
			
		}
		
		System.out.println ("");
		System.out.println ("-----------------------------");
		
		System.out.println("Total da compra =  " + total);
		
		
	}//metodo

}//classe
