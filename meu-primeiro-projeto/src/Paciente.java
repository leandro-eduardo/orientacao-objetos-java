
public class Paciente {
	
	double peso;
	double altura;
	
	/*double calcularIndiceDeMassaCoroporal() {
		double imc = peso / (altura * altura);
		
		return imc;
	}*/
	
	IMC calcularIndiceDeMassaCorporal() {
		IMC imc = new IMC();
		double indice = peso / (altura * altura);
		imc.indice = indice;
		
		if (indice <18.5) {
			imc.abaixoDoPesoIdeal = true;
		} else if (indice < 25 ) {
			imc.pesoIdeal = true;
		} else {
			imc.obeso = true;
			
			if (indice < 30) {
				imc.grauObesidade = "Acima do peso.";
			} else if (indice < 35) {
				imc.grauObesidade = "Grau de Obesidade I.";
			} else if (indice < 40) {
				imc.grauObesidade = "Grau de Obesidade II.";
			} else {
				imc.grauObesidade = "Grau de Obesidade III.";
			}
		}
		
		return imc;
	}
	
}
