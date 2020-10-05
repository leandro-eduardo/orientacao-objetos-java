package com.algaworks.cursojava.financeiro.modelo;

import com.algaworks.cursojava.financeiro.OperacaoContaException;

public class ContaReceber extends Conta {
	
	public ContaReceber() {
		
	}
	
	public ContaReceber(String descricao, Double valor, String dataVencimento, Cliente cliente) {
		this.descricao = descricao;
		this.valor = valor;
		this.dataVencimento = dataVencimento;
		this.cliente = cliente;
		
	}
	
	public void receber() throws OperacaoContaException {
		if(getSituacaoConta() != SituacaoConta.PENDENTE) {
			throw new OperacaoContaException("Não é possível receber a conta " + descricao + ". Situação da conta: " + situacaoConta + ".");
			//System.out.println();
			//System.out.println("Erro: não é possível receber a conta " + descricao + ". Situação da conta: " + situacaoConta + ".");
		} else {
			situacaoConta = SituacaoConta.PAGA;
			System.out.println();
			System.out.println("DETALHES DA CONTA - RECEBIMENTO");
			System.out.println("---------------------------------");
			System.out.println("Cliente: " + cliente.getNome());
			System.out.println("Descrição: " + descricao);
			System.out.println("Valor: R$" + valor);
			System.out.println("Vencimento: " + dataVencimento);
			System.out.println("---------------------------------");
			System.out.println("Conta no valor de R$" + valor + " recebida com sucesso.");
		}
		
	}
	
	@Override
	public void cancelar() throws OperacaoContaException {
		if (this.getValor() > 50000 && situacaoConta != SituacaoConta.PAGA) {
			System.out.println();
			throw new OperacaoContaException("Conta a receber possui valor maior que 50 mil e não pode ser cancelada.");
			//System.out.println("Erro: conta a receber possui valor maior que 50 mil e não pode ser cancelada.");
		} else {
			super.cancelar();
		}
	}

	@Override
	public void exibirDetalhes() {
		System.out.println("------------------------------------------------------------");
		System.out.println("              DETALHAMENTO - CONTA A RECEBER");
		System.out.println("------------------------------------------------------------");
		System.out.println("Cliente: " + cliente.getNome());
		System.out.println("Descrição: " + descricao);
		System.out.println("Valor: R$" + valor);
	}

}
