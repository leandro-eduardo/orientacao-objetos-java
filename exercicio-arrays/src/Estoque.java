
public class Estoque {

	Produto[] produtos;
	private int quantidadeTotal;
	
	void listarProdutos() {
		System.out.println();
		System.out.println("Produtos em Estoque");
		System.out.println("--------------------");
		
		for (int i = 0; i < produtos.length; i++) {
			produtos[i].descrever();
		}
	}
	
	void quantidadeTotal() {
		//int quantidadeTotal = 0;
		
		for (int i = 0; i < produtos.length; i++) {
			quantidadeTotal += produtos[i].quantidade;
		}
		
		System.out.println("Quantidade total de produtos: " + quantidadeTotal);
	}
		
}
