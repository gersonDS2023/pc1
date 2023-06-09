package listaA;

import java.util.Scanner;

public class A10 {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		
		int a,b, aux;
		
		System.out.println("Digite o valor de A = ");
		a=sc.nextInt();
		
		System.out.println ("Digite o valor de B = ");
		b=sc.nextInt();
		
		System.out.println("---------------------");
		
		
		//processamento
		aux=a;
		a=b;
		b=aux;
		
		
		System.out.println("O valor de A ---> "+a);
		System.out.println ("O valor de B -->" + b);
		
		
		
	}

}
