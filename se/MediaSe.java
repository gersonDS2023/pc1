package listaA;

import java.util.Scanner;

public class MediaSe {

	public static void main(String[] args) {
	
		float n1,n2,n3,n4,media;
		
		Scanner sc=new Scanner (System.in);
		
		System.out.println("Digite a nota 1: ");
		n1=sc.nextFloat();
		
		System.out.println("Digite a nota 2:");
		n2=sc.nextFloat();
		
		System.out.println("Digite a nota 3:");
		n3=sc.nextFloat();
		
		System.out.println("Digite a nota 4: ");
		n4=sc.nextFloat();
		
		media=(n1+n2+n3+n4)/4;
		
	    if (media>10) {
	        System.out.println("-------------------");
	    	System.out.println("Média Inválida !!");
	    	System.out.println("Digite as notas corretamente !!");
	    	
	    }//fecha o if
		
	    System.out.println("-------------------");
		System.out.println("A media = " + media);

	}//fecha o metodo

}//fechar a classe
