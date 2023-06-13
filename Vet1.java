import java.util.Scanner;

public class Vet1 {

	public static void main(String[] args) {
	
		Scanner sc=new Scanner (System.in);
		//criando um vetor com 5 posicoes
		int[] vetValores=new int[5];
		int contador; //laço
		int valorDigitado;
	
	for (contador=0;contador<vetValores.length; contador++ ) {
		System.out.println ("Digite o valor " + (contador + 1));
	    vetValores[contador]=sc.nextInt();
	}//for
	}//metodo

}//classe
