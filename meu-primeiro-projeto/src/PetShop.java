
public class PetShop {
	
	public static void main(String[] args) {
		Cachorro cachorro1 = new Cachorro();
		cachorro1.nome = "Jack";
		cachorro1.idade = 5;
		cachorro1.raca = "Pitbull";
		cachorro1.sexo = 'M';	
		
		Cachorro cachorro2 = new Cachorro();
		cachorro2.nome = "Bia";
		cachorro2.idade = 1;
		cachorro2.raca = "Shih Tzu";
		cachorro2.sexo = 'F';	
		
		System.out.println("Nome: " + cachorro1.nome);
		String idadeAuxiliar1 = (cachorro1.idade == 1) ? "Idade: " + cachorro1.idade + " ano" : "Idade: " + cachorro1.idade + " anos";
		System.out.println(idadeAuxiliar1);
		System.out.println("Raça: " + cachorro1.raca);
		String sexoAuxiliar1 = (cachorro1.sexo == 'M') ? "Macho" : "Fêmea";
		System.out.println(sexoAuxiliar1);
		
		System.out.println("---------------------");
		
		System.out.println("Nome: " + cachorro2.nome);
		String idadeAuxiliar2 = (cachorro2.idade == 1) ? "Idade: " + cachorro2.idade + " ano" : "Idade: " + cachorro2.idade + " anos";
		System.out.println(idadeAuxiliar2);
		System.out.println("Raça: " + cachorro2.raca);
		String sexoAuxiliar2 = (cachorro2.sexo == 'M') ? "Macho" : "Fêmea";
		System.out.println(sexoAuxiliar2);
	}
	
}
