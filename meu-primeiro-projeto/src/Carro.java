
public class Carro {

	String fabricante;
	String modelo;
	String cor;
	int anoDeFrabricacao;
	boolean biCombustivel;
	
	Proprietario dono;
	
	void ligar() {
		if (modelo != null) {
			System.out.println("Ligando o carro: " + modelo);		
		}
	}
}
