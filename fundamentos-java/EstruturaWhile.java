import java.util.Scanner;

public class EstruturaWhile {
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite o valor inicial: ");
		int valorInicial = entrada.nextInt();
		
		System.out.print("Digite o valor final: ");
		int valorFinal = entrada.nextInt();
		
		int valorAtual = valorInicial;
		
		while (valorAtual <= valorFinal) {
			System.out.println(valorAtual);
			valorAtual++;
		}		
	}
		
}