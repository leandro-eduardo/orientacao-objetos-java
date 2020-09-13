
public class Principal2 {

	public static void main(String[] args) {
		
		// aula 3.7
		/*Proprietario dono = new Proprietario();
		dono.nome = "João da Silva";
		dono.cpf = "000.000.000-00";
		dono.idade = 25;
		dono.logradouro = "Rua João Pinheiro, 10";
		dono.bairro = "Centro";
		dono.cidade = "Umuarama";
		
		Carro meuCarro = new Carro();
		meuCarro.anoDeFrabricacao = 2011;
		meuCarro.cor = "Prata";
		meuCarro.fabricante = "Fiat";
		meuCarro.modelo = "Palio";
		meuCarro.dono = dono;*/
		
		// aula 3.8
		/*Carro seuCarro = new Carro();
		seuCarro.anoDeFrabricacao = 2009;
		seuCarro.cor = "Preto";
		
		seuCarro.dono = new Proprietario();
		seuCarro.dono.nome = "José Pereira";*/
		
		// aula 3.9
		/*Proprietario dono1 = new Proprietario();
		dono1.nome = "João da Silva";
		
		Carro meuCarro = new Carro();
		meuCarro.modelo = "Megane";
		meuCarro.dono = dono1;
		
		Carro seuCarro = new Carro();
		seuCarro.modelo = "Civic";
		seuCarro.dono = dono1;
		
		System.out.println("Antes da mudança do nome: ");
		System.out.println(meuCarro.dono.nome);
		System.out.println(seuCarro.dono.nome);
		System.out.println(dono1.nome);
		
		System.out.println();
		
		meuCarro.dono.nome = "Marcos Paulo";
		
		System.out.println("Depois da mudança do nome: ");
		System.out.println(meuCarro.dono.nome);
		System.out.println(seuCarro.dono.nome);
		System.out.println(dono1.nome);*/
		
		// aulas 3.10 e 3.11
		Carro meuCarro = new Carro();
		//meuCarro.modelo = "Megane";
		
		Carro seuCarro = new Carro();
		seuCarro.modelo = "Civic";
		
		meuCarro.ligar();
		seuCarro.ligar();
		
	}
	
}
