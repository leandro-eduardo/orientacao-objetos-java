
public class TesteMaquinaCafe {

	public static void main(String[] args) {
		MaquinaCafe maquina = new MaquinaCafe();
		maquina.acucarDisponivel = 30;
		
		maquina.fazerCafe(10);
		maquina.fazerCafe(15);
		
		// faz caf� com a quantidade de a��car padr�o (10 gramas)
		// n�o ser� poss�vel fazer esse caf�zinho, pois a m�quina
		// s� tinha 30 gramas de a��car dispon�vel
		maquina.fazerCafe();

	}

}
