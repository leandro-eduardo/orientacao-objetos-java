import java.util.Scanner;

public class MultaVeiculo {
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Tipo do veículo (passeio, caminhão): ");
		String tipoVeiculo = entrada.nextLine();
		
		System.out.print("Velocidade máxima da via: ");
		int velocidadeMaxima = entrada.nextInt();
		
		System.out.print("Velocidade do veículo: ");
		int velocidadeVeiculo = entrada.nextInt();
		
		// veiculo de passeio com velocidade maior que 10% da velocidade da via
		// e caminhao com velocidade maior que 5% deve receber multa
		if ((tipoVeiculo.equals("passeio") && velocidadeVeiculo > velocidadeMaxima * 1.1) || (tipoVeiculo.equals("caminhao") && velocidadeVeiculo > velocidadeMaxima * 1.05)) {
			System.out.println("Multa");
		}
	}
	
}