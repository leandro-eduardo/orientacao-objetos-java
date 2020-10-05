package com.algaworks.cursojava.financeiro.modelo;

import com.algaworks.cursojava.financeiro.OperacaoContaException;

public abstract class Conta {
	
	protected String descricao;
	protected Double valor;
	protected String dataVencimento;
	protected Fornecedor fornecedor;
	protected Cliente cliente;
	protected SituacaoConta situacaoConta;
	
	public Conta() {
		situacaoConta = SituacaoConta.PENDENTE;
	}
		
	public void cancelar() throws OperacaoContaException {
		if (!situacaoConta.equals(SituacaoConta.PENDENTE)) {
			System.out.println();
			throw new OperacaoContaException("Não é possível cancelar esta conta. Situação da conta: " + situacaoConta + ".");
			//System.out.println("Erro: não é possível cancelar esta conta. Situação da conta: " + situacaoConta + ".");
		} else {
			situacaoConta = SituacaoConta.CANCELADA;
			System.out.println();
			System.out.println("DETALHES DA CONTA - CANCELAMENTO");
			System.out.println("---------------------------------");
			System.out.println("Descrição: " + descricao);
			System.out.println("Valor: R$" + valor);
			System.out.println("Vencimento: " + dataVencimento);
			System.out.println("---------------------------------");		
			System.out.println("Conta cancelada com sucesso.");
		}
	}
	
	public abstract void exibirDetalhes();
	
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

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public SituacaoConta getSituacaoConta() {
		return situacaoConta;
	}

}
