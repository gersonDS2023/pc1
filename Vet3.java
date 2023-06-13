import java.util.Scanner;

public class t {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		//criando um vetor com 5 posicoes
		int[] vetValores=new int[5];
		int contador; //laço
		int valorDigitado;
		int somaValores=0;
	
	    //entrada de dados no vetor
		for (contador=0;contador<vetValores.length; contador++ ) {
		   System.out.println ("Digite o valor " + (contador + 1));
	       vetValores[contador]=sc.nextInt();
	       somaValores = somaValores + vetValores[contador];
	    }//for
	
	System.out.println ("------------------------- ");
	System.out.println ("Saida dos dados do vetor ");
	System.out.println ("------------------------- ");
	System.out.println ("");
	
	//exibicao dos dados
	for (contador=0;contador<vetValores.length; contador++ ) {
		System.out.println (vetValores[contador]);
	    
	}//for
	
	
System.out.println ("------------------------- ");
System.out.println ("Soma dos valores do vetor = " + somaValores);
	
	
	
	
	}

}
