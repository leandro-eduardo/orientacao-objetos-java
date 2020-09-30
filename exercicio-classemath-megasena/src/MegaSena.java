import java.util.ArrayList;

public class MegaSena {
		
	public void gerarJogo(int quantidadeJogos) {
		for (int i = 1; i <= quantidadeJogos; i++) {
			ArrayList<Integer> numerosAleatorios = new ArrayList<Integer>();
			System.out.println("Jogo " + i);
			
			for (int c = 1; c <= 6; c++) {
				int numeroAleatorio = (int) Math.round(Math.random() * 60);
				System.out.println("Número aleatório gerado: " + numeroAleatorio);
				
				if (numerosAleatorios.contains(numeroAleatorio) || numeroAleatorio == 0) {
					numeroAleatorio = (int) Math.round(Math.random() * 60);
					System.out.println("Novo número aleatório gerado: " + numeroAleatorio);
					while (numeroAleatorio == 0) {
						numeroAleatorio = (int) Math.round(Math.random() * 60);
						System.out.println("Novo número aleatório gerado: " + numeroAleatorio);
					}
				}
				numerosAleatorios.add(numeroAleatorio);
			}
			System.out.println(numerosAleatorios);		
		}
	}

}
