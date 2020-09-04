public class IncrementoDecremento {
	
	public static void main(String[] args) {
		int idade = 10;
		//int novaIdade = idade++; // primeiro atribui o valor de idade para novaIdade e depois incrementa idade
		int novaIdade = ++idade; // incrementa idade e depois atribui o valor de idade para novaIdade
		//int novaIdade = idade--;
		//int novaIdade = --idade;
		
		
		System.out.println("Idade: " + idade);
		System.out.println("Nova idade: " + novaIdade);
	}
	
}