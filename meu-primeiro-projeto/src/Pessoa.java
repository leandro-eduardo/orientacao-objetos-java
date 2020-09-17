
public class Pessoa {
	
	String nome;
	int idade;
	Cachorro cachorro;
	
	Pessoa(String nome) {
		this.nome = nome;
	}
	
	Pessoa(String nome, int idade) {
		this(nome); // deve ser a primeira instrução dentro do construtor
		//this.nome = nome;
		this.idade = idade;
	}

}
