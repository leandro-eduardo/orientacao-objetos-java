
class MaquinaCafe {

	int acucarDisponivel;
	
	void fazerCafe() {
		fazerCafe(10);
	}
	
	void fazerCafe(int quantidadeAcucar) {
		if (acucarDisponivel < quantidadeAcucar) {
			System.out.println("Nào há açúcar suficiente para fazer seu café.");
		} else {
			acucarDisponivel -= quantidadeAcucar;
			System.out.println("Fazendo cafézinho com " + quantidadeAcucar + " gramas de açúcar.");
		}
	}
	
}
