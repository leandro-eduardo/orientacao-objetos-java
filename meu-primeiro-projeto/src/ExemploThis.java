
public class ExemploThis {

	public static void main(String[] args) {
		Carro carro = new Carro();
		carro.modelo = "Palio";
		System.out.println("Modelo antes da altera��o: " + carro.modelo);
		carro.alterarModelo("Civic");
		System.out.println("Modelo depois da altera��o: " + carro.modelo);

	}

}
