
public class Principal {
	
	public static void main(String[] args) {
		Carro meuCarro = new Carro();
		meuCarro.fabricante = "Renault";
		meuCarro.modelo = "Megane";
		meuCarro.cor = "Prata";
		meuCarro.anoDeFrabricacao = 2010;
		
		Carro seuCarro = new Carro();
		seuCarro.fabricante = "Honda";
		seuCarro.modelo = "Civic";
		seuCarro.cor = "Preto";
		seuCarro.anoDeFrabricacao = 2009;
		
		System.out.println("Meu Carro");
		System.out.println("--------------------------");
		System.out.println("Fabricante: " + meuCarro.fabricante);
		System.out.println("Modelo: " + meuCarro.modelo);
		System.out.println("Cor: " + meuCarro.cor);
		System.out.println("Ano de Fabricação: " + meuCarro.anoDeFrabricacao);
		
		System.out.println();
		
		System.out.println("Seu Carro");
		System.out.println("--------------------------");
		System.out.println("Fabricante: " + seuCarro.fabricante);
		System.out.println("Modelo: " + seuCarro.modelo);
		System.out.println("Cor: " + seuCarro.cor);
		System.out.println("Ano de Fabricação: " + seuCarro.anoDeFrabricacao);
		
	}
	
}
