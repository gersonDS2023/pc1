package listaA;

import java.util.Scanner;

public class For5 {
	public static void main (String[]args) {
		
		Scanner sc = new Scanner (System.in);
		
		int contador;
		int nCandidatos;
		int totMaiorCinco=0;
		int totMenorCinco=0;
		
		
		double salarioFuncionario;
		
		System.out.println ("Digite a Qtd de Funcionários ");
		nCandidatos = sc.nextInt();
		
		
		for (contador=0; contador<nCandidatos; contador++) {
		
				System.out.println ("Digite o salario do Funcionário : ");
			    salarioFuncionario = sc.nextDouble ();
			    
			    if (salarioFuncionario>=5000) {
			    	totMaiorCinco = totMaiorCinco + 1;
			    	
			    }else {
			        totMenorCinco = totMenorCinco + 1;
			    }
			    
		}//for
		
		
		
		
		System.out.println ("");
		System.out.println ("----------------------------");
		System.out.println ("    Relatório de Salários - Geral  ");
		System.out.println ("----------------------------");
		
		System.out.println ("Total de Funcionarios com salario >= 5000 ---> " + totMaiorCinco);
		System.out.println ("Total de Funcionarios com salario < 5000 ---> " + totMenorCinco);
		
		float percMaiorCinco = (totMaiorCinco*100)/nCandidatos;
		float percMenorCinco = (totMenorCinco*100)/nCandidatos;
		
				
		System.out.println ("Percentual Maior = " + percMaiorCinco + "%");
		System.out.println ("Percentual menor = " + percMenorCinco + "%");
				
		} 
	
		
}

