import java.util.Scanner;

public class OperadorTernario {
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite sua idade: ");
		int idade = entrada.nextInt();
		
		// expressão booleana ? valor caso verdadeiro : valor caso falso
		String indicacao = (idade >= 18) ? "adulto" : (idade <= 12 ? "criança" : "adolescente");
		// atribuição abaixo também é possível
		int x = (idade >= 18) ? 1 : 2;
		
		/*if (idade >= 18) {
			indicacao = "adulto";
		} else {
			indicacao = "criança/adolescente";
		}*/
				
		System.out.println("Resultado: " + indicacao);	
	}
	
}