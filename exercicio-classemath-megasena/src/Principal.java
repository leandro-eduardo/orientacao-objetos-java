import java.util.Scanner;

public class Principal {
	
	public static void main(String[] args) {
		MegaSena megaSena = new MegaSena();
		
		Scanner entrada = new Scanner(System.in);	
		System.out.print("Quantidade de jogos a serem feitos: ");
		int quantidadeJogos = entrada.nextInt();

		megaSena.gerarJogo(quantidadeJogos);

	}

}
