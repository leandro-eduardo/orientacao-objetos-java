
class MaquinaCafe {

	int acucarDisponivel;
	
	void fazerCafe() {
		fazerCafe(10);
	}
	
	void fazerCafe(int quantidadeAcucar) {
		if (acucarDisponivel < quantidadeAcucar) {
			System.out.println("N�o h� a��car suficiente para fazer seu caf�.");
		} else {
			acucarDisponivel -= quantidadeAcucar;
			System.out.println("Fazendo caf�zinho com " + quantidadeAcucar + " gramas de a��car.");
		}
	}
	
}
