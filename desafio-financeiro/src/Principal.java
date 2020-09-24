
public class Principal {

	public static void main(String[] args) {
		Fornecedor imobiliaria = new Fornecedor();
		imobiliaria.setNome("Casa & Cia Neg�cios Imobili�rios");
		
		Fornecedor mercado = new Fornecedor();
		mercado.setNome("Mercado do Jo�o");
		
		ContaPagar conta1 = new ContaPagar();
		conta1.setDescricao("Aluguel da matriz");
		conta1.setValor(1230d);
		conta1.setDataVencimento("10/10/2020");
		conta1.setFornecedor(imobiliaria);
		
		ContaPagar conta2 = new ContaPagar("Compras do m�s", 390d, "19/10/2020", mercado);
		
		ContaPagar conta3 = new ContaPagar("Aluguel da filial", 700d, "11/10/2020", mercado);
		
		conta1.pagar();
		conta2.pagar();
		conta3.pagar();

	}

}
