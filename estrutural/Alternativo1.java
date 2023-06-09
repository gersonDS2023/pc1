package listaA;

import java.util.Scanner;

public class Alternativo1 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner (System.in);
		
		double salarioBruto, descPrevSocial, outrosDescontos ;
		
		System.out.println("Digite o salario Bruto = ");
		salarioBruto=sc.nextDouble();
		
		//calculo da previdencia social 
		
		descPrevSocial=salarioBruto-(salarioBruto*0.1);
		
		//calculo de outros descontos
		outrosDescontos=descPrevSocial-(descPrevSocial*0.05);
		
		System.out.println("-------------------------");

		System.out.println("Total do Salario com desconto da Previdencia (10%) = " + descPrevSocial);
		
		System.out.println("Total do salario com o utro desconto (5%) - Salario Final: "+ outrosDescontos);
		

	}

}
