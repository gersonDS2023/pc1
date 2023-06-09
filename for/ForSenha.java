package listaA;

import java.util.Scanner;

public class senhaFor {

	
	public static void main(String[] args) {

		int contador;
		int numTentativas=0;
		int numMaxTentantivas=3;
		String usuarioCorreto = "martins.gerson@gmail.com";
		String senhaCorreta = "123";
		String usuario;
		String senha;
		
		Scanner sc=new Scanner (System.in);
		
		for (contador=1; contador<=numMaxTentantivas; contador++) {
			System.out.println ("Digite o usuario: ");
			usuario = sc.nextLine();
			
			
			System.out.println ("Digite a senha: ");
			senha = sc.nextLine();
			
			if (usuario.equals(usuarioCorreto) && (senha.equals (senhaCorreta))) {
			      System.out.println ("Acesso permitido !");
			      break;
			      
				
			}else {
	               System.out.println ("Senha incorret !. Tente novamente!, restao " + (numMaxTentantivas-contador) + "tentativas");  
				   
	              
			}
			
				
		}
		
	}

}
