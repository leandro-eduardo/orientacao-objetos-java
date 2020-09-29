
public class Principal {

	public static void main(String[] args) {
		CorretoraSeguros corretora = new CorretoraSeguros();
		
		Carro meuCarro = new Carro(45000d, 2012);
		Imovel minhaCasa = new Imovel(92000, 320);
		Notebook meuNotebook = new Notebook(5000, 4);
		Embarcacao minhaEmbarcacao = new Embarcacao(20000, "Lancha");
		
		corretora.fazerPropostaSeguro(meuCarro);
		corretora.fazerPropostaSeguro(minhaCasa);
		corretora.fazerPropostaSeguro(meuNotebook);
		corretora.fazerPropostaSeguro(minhaEmbarcacao);
		
	}

}
