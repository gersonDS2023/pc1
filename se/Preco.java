package listaA;

import java.util.Scanner;

public class Preco {

	public static void main(String[] args) {
		
		float precoArroz, precoCafe;
		
		Scanner sc=new Scanner (System.in);
		
		double p1=3.00;
		double p2=5.00;
		double p3=10.00;
		
		double total=0.00;
		
		
		
	    System.out.println ("Digite o codigo do picole desejado : ");
	    int codPicole = sc.nextInt();
	    
	    System.out.println ("Digite a quantidade : ");
	    int qtdPicole=sc.nextInt();
	    
	    if (codPicole==1) {
	        total=p1*qtdPicole;
	    }
	    
	    System.out.println("Total da Compra : " + total);
		
		
	}//fecha o metodo

}//fecha a classe
