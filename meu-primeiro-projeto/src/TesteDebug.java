import java.util.Scanner;

public class TesteDebug {

	private static Scanner entrada;

	public static void main(String[] args) {
		entrada = new Scanner(System.in);
		
		System.out.println("Digite um número: ");
		int divisor = entrada.nextInt();

		for (int i = 100; i <= 120; i++) {
			if (i % divisor == 0) {
				continue;
			}
			
			System.out.println(i);
		}
		
		System.out.println("Fim do programa.");

	}

}
