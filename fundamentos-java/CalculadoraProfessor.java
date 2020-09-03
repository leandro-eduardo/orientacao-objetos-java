public class CalculadoraProfessor {
	
	public static void main(String[] args) {
		// indica se o detalhamento do cálculo deve ser apresentado na tela
		boolean calculoDetalhado = true;
		
		// constante do Pi
		float pi = 3.14f;
		
		// raio - informado pelo professor
		float raio = 6.3f;
		
		// area é igual ao raio ao quadrado multiplicado por Pi
		float area = raio * raio * pi;
		int areaSemCadasDecimais = (int) area;
		
		if (calculoDetalhado) {
			System.out.println("Area = " + raio + " * " + raio + " * " + pi);
		}
		
		System.out.println("Resultado: " + area);
		System.out.println("Resultado sem casas demais: " + areaSemCadasDecimais);
	}
	
}