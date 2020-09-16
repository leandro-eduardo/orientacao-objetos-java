import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		// obt�m a quantidade de produtos que o usu�rio deseja informar
		System.out.println("Quantos produtos ser�o cadastrados? ");
		int quantidadeProdutos = entrada.nextInt();
		
		// precisamos dessa linha extra para garantir que uma nova linha seja lida
		// pois nextInt n�o l� uma nova linha, mas apenas um n�mero.
		// � estranho e n�o fica interessante, mas caso n�o exista essa linha, teremos problemas
		entrada.nextLine();
		
		// instancia um objeto da classe Estoque
		Estoque estoque = new Estoque();
		
		// instancia um array de produtos com a quantidade de posi��es que o usu�rio informou
		estoque.produtos = new Produto[quantidadeProdutos];
		
		// percorre todas as posi��es no array (que est�o nulas) e preenche uma por uma
		// com a entrada do teclado do usu�rio
		for (int i = 0; i < estoque.produtos.length; i++) {
			estoque.produtos[i] = new Produto();
			
			System.out.println();
			System.out.println("Produto " + (i + 1));
			System.out.println("--------------------");
			System.out.print("Descri��o: ");
			estoque.produtos[i].descricao = entrada.nextLine();
			System.out.print("Quantidade de itens: ");
			estoque.produtos[i].quantidade = entrada.nextInt();
			entrada.nextLine();
		}
		
		estoque.listarProdutos();
		estoque.quantidadeTotal();
	}
	
}
