package com.algaworks.cursojava.financeiro.modelo;

public class ContaPagar extends Conta {
	
	public ContaPagar() {
		
	}
		
	public ContaPagar(String descricao, Double valor, String dataVencimento, Fornecedor fornecedor) {
		this.descricao = descricao;
		this.valor = valor;
		this.dataVencimento = dataVencimento;
		this.fornecedor = fornecedor;
		
	}
	
	public void pagar() {
		if(getSituacaoConta() != SituacaoConta.PENDENTE) {
			System.out.println();
			System.out.println("Erro: não é possível pagar a conta " + descricao + ". Situação da conta: " + situacaoConta + ".");
		} else {
			situacaoConta = SituacaoConta.PAGA;
			System.out.println();
			System.out.println("DETALHES DA CONTA - PAGAMENTO");
			System.out.println("---------------------------------");
			System.out.println("Fornecedor: " + fornecedor.getNome());
			System.out.println("Descrição: " + descricao);
			System.out.println("Valor: R$" + valor);
			System.out.println("Vencimento: " + dataVencimento);
			System.out.println("---------------------------------");
			System.out.println("Conta no valor de R$" + valor + " paga com sucesso.");
		}
		
	}

	@Override
	public void exibirDetalhes() {
		System.out.println("------------------------------------------------------------");
		System.out.println("              DETALHAMENTO - CONTA A PAGAR");
		System.out.println("------------------------------------------------------------");
		System.out.println("Fornecedor: " + fornecedor.getNome());
		System.out.println("Descrição: " + descricao);
		System.out.println("Valor: R$" + valor);
		System.out.println("Vencimento: " + dataVencimento);
	}
	
	
	
	
	
}
