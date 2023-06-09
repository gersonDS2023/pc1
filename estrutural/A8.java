package listaA;

import java.util.Scanner;

public class A8 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner (System.in);
		
		int ht;
		double vh, pd, sb, td,sl;
		
		
		System.out.println ("Digite o total de Horas Trabalhadas no mes: ");
	    ht=sc.nextInt();
	    
	    System.out.println ("Digite o  valor da Hora Trabalhada : ");
	    vh=sc.nextDouble();
	    
	    System.out.println ("Digite o percentual de desconto : ");
	    pd=sc.nextDouble();
	    
	    sb=vh*ht; //calculo do  salario bruto
	    
	    td=pd/100*sb; //calculo do total do desconto]
	    
	    sl=sb-td; //calculo do salario liquido
	    
	    //apresentar o salario bruto 

	    System.out.println("");
	    System.out.println("-----------------------------");
		   
	    System.out.println("Salario Bruto = "+sb);
	    
	    //apresentar o total do desconto
	    System.out.println ("Total do desconto = "+td);
	    
	    
	    //apresentar o salario liquido
		
	    System.out.println("");
	    System.out.println("-----------------------------");
		
	    System.out.println("Salario Liquido = " +sl);

	}//metodo

}//classe
