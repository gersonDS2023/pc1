import java.util.Scanner;

public class CadBois {

	public static void main(String[] args) {

	  Scanner sc=new Scanner (System.in);	
	  int contador,nBois,codigoBoi=0, codigoBoiMaisLeve=0, codigoBoiMaisPesado=0,totMaior300=0, totMenor300=0;
	  Double pesoBoi,pesoBoiMaisLeve=1000.0, pesoBoiMaisPesado=0.0; 
	  String nomeBoi;
	  
	  
	  System.out.println ("Digite a qtd. de lancamentos : ");
	   nBois  = sc.nextInt();
		
	  
	  for (contador=0; contador<nBois; contador++) {
		  
		  System.out.println ("Digite o codigo do boi : ");
		  codigoBoi = sc.nextInt();
		  

		  System.out.println ("Digite o peso do boi : ");
		  pesoBoi = sc.nextDouble();
		  
		  
		  if (pesoBoi<pesoBoiMaisLeve) {
			  pesoBoiMaisLeve = pesoBoi;
			  codigoBoiMaisLeve = codigoBoi;
			  
		  }
		  if (pesoBoi>pesoBoiMaisPesado) {
			  pesoBoiMaisPesado = pesoBoi;
			  codigoBoiMaisPesado = codigoBoi;
			  
		  }
		  
		  
		  if (pesoBoi>=300) {
			  totMaior300 = totMaior300 + 1;
		  }else {
		  totMenor300 = totMenor300 + 1;
		  }
		  
		  
		  
	  }//for
	  
	  float percMA = totMaior300*100/nBois;
	  
	   float percME = totMenor300*100/nBois;
	  
	  
	  
	  System.out.println ("");
	  System.out.println ("------------BOI MAIS LEVE-----------------------");
	  System.out.println ("Código do boi mais leve ==> " + codigoBoiMaisLeve);
	  System.out.println ("----------------------------------------");
	  System.out.println ("Peso do boi mais leve   ==> " + pesoBoiMaisLeve);
	
	  System.out.println ("");System.out.println ("");System.out.println ("");
	  
	  System.out.println ("------------BOI MAIS PESADO-----------------------");
	  System.out.println ("Código do boi mais pesado ==> " +codigoBoiMaisPesado );
	  System.out.println ("----------------------------------------");
	  System.out.println ("Peso do boi mais pesado   ==> " + pesoBoiMaisPesado);
	  
	  System.out.println ("------------TOTAIS -----------------------");
	  System.out.println ("Total de  bois mais 300KG   ==> " + totMaior300);
	  System.out.println ("Peso de bois menos 300KG   ==> " + totMenor300);
	  System.out.println ("------------PERCENTUAIS (%) -----------------------");
	  System.out.println ("% bois mais 300KG   ==> " + percMA);
	  //System.out.println ("% bois menos 300KG   ==> " + totMenor300);
	  
	  System.out.println ("% bois menos 300KG   ==> " + percME);
	  
	  
	  
	  
	}

}
