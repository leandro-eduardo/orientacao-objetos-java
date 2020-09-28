
public class TesteMaquinaCafe {

	public static void main(String[] args) {
		MaquinaCafe maquina = new MaquinaCafe();
		maquina.acucarDisponivel = 30;
		
		maquina.fazerCafe(10);
		maquina.fazerCafe(15);
		
		// faz café com a quantidade de açúcar padrão (10 gramas)
		// não será possível fazer esse cafézinho, pois a máquina
		// só tinha 30 gramas de açúcar disponível
		maquina.fazerCafe();

	}

}
