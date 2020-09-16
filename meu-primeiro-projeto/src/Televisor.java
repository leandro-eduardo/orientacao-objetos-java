class Televisor {
	
	Integer canal = 130;
	Integer volume = 20;

	void mudarCanal(Integer novoCanal) {
		// if (canal == novoCanal) { ajustado para a linha abaixo
		if (canal.equals(novoCanal)) {
			System.out.println("Novo canal é também o canal atual.");
		} else {
			canal = novoCanal;
			System.out.println("Canal alterado para " + canal + ".");
		}
	}

	void mudarVolume(Integer novoVolume) {
		// if (novoVolume = volume) { ajustado para a linha abaixo
		if (novoVolume.equals(volume)) {
			System.out.println("Novo volume é também o volume atual.");
		} else {
			// Converter o valor da variável 'novoVolume' para o tipo 'byte' fez ele perder precisão e por isso o resultado do novo volume saia errado, byte vai de -128 a 127 apenas
			// volume = new Integer(novoVolume.byteValue()); ajustado para a linha abaixo
			volume = novoVolume;
			System.out.println("Volume alterado para " + volume + ".");
		}
	}

    // Aproveitando a classe Televisor para fazer o teste
	public static void main(String[] args) {
		Televisor tv = new Televisor();
       // Não deveria mudar o volume e canal
		tv.mudarVolume(20);
		tv.mudarCanal(130);
        // Deveria mudar o volume e canal
		tv.mudarVolume(300);
		tv.mudarCanal(10);
	}
	
}