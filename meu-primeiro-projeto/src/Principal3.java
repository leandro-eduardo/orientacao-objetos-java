
public class Principal3 {
	
	public static void main(String[] args) {
		Paciente p = new Paciente();
		p.peso = 110;
		p.altura = 1.65;
		
		IMC imc = p.calcularIndiceDeMassaCorporal();
		
		System.out.println("Abaixo do Peso Ideal: " + imc.abaixoDoPesoIdeal);
		System.out.println("Peso Ideal: " + imc.pesoIdeal);
		System.out.println("Obeso: " + imc.obeso);
		System.out.println("Grau de Obesidade: " + imc.grauObesidade);
	}
}
