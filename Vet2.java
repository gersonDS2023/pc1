import java.util.Scanner;

public class t2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        int i=0;
        String[] diasSemana = new String[7];
   System.out.println("Digite os nomes dos dias da semana:");
        
     //entrada dos dados
        for (i = 0; i < diasSemana.length; i++) {
            System.out.print("Dia " + (i + 1) + ": ");
            diasSemana[i] = scanner.nextLine();
        }
     //saida dos dados
        System.out.println("Os dias da semana digitados foram:");

        for (i = 0; i < diasSemana.length; i++) {
  System.out.println("Dia " + (i + 1) + ": " + diasSemana[i]);
        }

System.out.println("O dia da semana"
+ " na terceira posição do vetor é: " + diasSemana[2]);
	}

}
