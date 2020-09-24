package com.algaworks.cursojava.financeiro.modelo;

public class ContaPagar {
	private String descricao;
	private Double valor;
	private String dataVencimento;
	private Fornecedor fornecedor;
	private SituacaoConta situacaoConta;
	
	public ContaPagar() {
		situacaoConta = SituacaoConta.PENDENTE;
	}
	
	public ContaPagar(String descricao, Double valor, String dataVencimento, Fornecedor fornecedor) {
		this();
		this.descricao = descricao;
		this.valor = valor;
		this.dataVencimento = dataVencimento;
		this.fornecedor = fornecedor;
		
	}
	
	public void pagar() {
		if (situacaoConta.equals(SituacaoConta.PAGA)) {
			System.out.println();
			System.out.println("Erro: não é possível pagar uma conta paga.");
			System.out.println();
		} else if (situacaoConta.equals(SituacaoConta.CANCELADA)) {
			System.out.println();
			System.out.println("Erro: não é possível pagar uma conta cancelada.");
			System.out.println();
		} else {
			System.out.println("PAGAMENTO DE CONTA - DETALHAMENTO");
			System.out.println("---------------------------------");
			System.out.println("Fornecedor: " + fornecedor.getNome());
			System.out.println("Descrição: " + descricao);
			System.out.println("Valor: " + valor + " reais");
			System.out.println("Vencimento: " + dataVencimento);
			situacaoConta = SituacaoConta.PAGA;
			System.out.println("---------------------------------");
			System.out.println();
			System.out.println("Conta paga com sucesso!");
		}
		
	}
	
	public void cancelar() {
		if (situacaoConta.equals(SituacaoConta.PAGA)) {
			System.out.println();
			System.out.println("Erro: não é possível cancelar uma conta paga.");
			System.out.println();
		} else if (situacaoConta.equals(SituacaoConta.CANCELADA)) {
			System.out.println();
			System.out.println("Erro: não é possível cancelar uma conta cancelada.");
			System.out.println();
		} else {
			situacaoConta = SituacaoConta.CANCELADA;
			System.out.println();
			System.out.println("Conta cancelada com sucesso!");
		}
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}

	public String getDataVencimento() {
		return dataVencimento;
	}

	public void setDataVencimento(String dataVencimento) {
		this.dataVencimento = dataVencimento;
	}

	public Fornecedor getFornecedor() {
		return fornecedor;
	}

	public void setFornecedor(Fornecedor fornecedor) {
		this.fornecedor = fornecedor;
	}

	public SituacaoConta getSituacaoConta() {
		return situacaoConta;
	}
	
}
