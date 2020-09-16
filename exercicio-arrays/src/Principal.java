import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		// obtém a quantidade de produtos que o usuário deseja informar
		System.out.println("Quantos produtos serão cadastrados? ");
		int quantidadeProdutos = entrada.nextInt();
		
		// precisamos dessa linha extra para garantir que uma nova linha seja lida
		// pois nextInt não lê uma nova linha, mas apenas um número.
		// é estranho e não fica interessante, mas caso não exista essa linha, teremos problemas
		entrada.nextLine();
		
		// instancia um objeto da classe Estoque
		Estoque estoque = new Estoque();
		
		// instancia um array de produtos com a quantidade de posições que o usuário informou
		estoque.produtos = new Produto[quantidadeProdutos];
		
		// percorre todas as posições no array (que estão nulas) e preenche uma por uma
		// com a entrada do teclado do usuário
		for (int i = 0; i < estoque.produtos.length; i++) {
			estoque.produtos[i] = new Produto();
			
			System.out.println();
			System.out.println("Produto " + (i + 1));
			System.out.println("--------------------");
			System.out.print("Descrição: ");
			estoque.produtos[i].descricao = entrada.nextLine();
			System.out.print("Quantidade de itens: ");
			estoque.produtos[i].quantidade = entrada.nextInt();
			entrada.nextLine();
		}
		
		estoque.listarProdutos();
		estoque.quantidadeTotal();
	}
	
}
