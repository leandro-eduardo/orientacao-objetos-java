package com.algaworks.cursojava.financeiro;

import com.algaworks.cursojava.financeiro.modelo.Cliente;
import com.algaworks.cursojava.financeiro.modelo.Conta;
import com.algaworks.cursojava.financeiro.modelo.ContaPagar;
import com.algaworks.cursojava.financeiro.modelo.ContaReceber;
import com.algaworks.cursojava.financeiro.modelo.Fornecedor;

public class Principal {

	public static void main(String[] args) {
		// instanciando fornecedores
		Fornecedor imobiliaria = new Fornecedor();
		imobiliaria.setNome("Casa & Cia Negócios Imobiliários");
		Fornecedor mercado = new Fornecedor();
		mercado.setNome("Mercado do João");
		
		// instanciando clientes
		Cliente atacadista = new Cliente();
		atacadista.setNome("Triângulo Quadrado Atacadista");
		Cliente telecom = new Cliente();
		telecom.setNome("FoneNet Telecomunicações");
		
		// instanciando contas a pagar
		ContaPagar contaPagar1 = new ContaPagar();
		contaPagar1.setDescricao("Aluguel da Matriz");
		contaPagar1.setValor(1230d);
		contaPagar1.setDataVencimento("10/10/2020");
		contaPagar1.setFornecedor(imobiliaria);
		
		ContaPagar contaPagar2 = new ContaPagar("Compras do mês", 390d, "19/10/2020", mercado);
		
		// instanciando contas a receber
		ContaReceber contaReceber1 = new ContaReceber();
		contaReceber1.setDescricao("Desenvolvimento de Projeto de Logística em Java");
		contaReceber1.setValor(89500d);
		contaReceber1.setDataVencimento("23/05/2021");
		contaReceber1.setCliente(atacadista);
		
		ContaReceber contaReceber2 = new ContaReceber("Manutenção em Sistema de Conta On-line", 53200d, "13/05/2021", telecom);
		
		// pagamento e cancelamento de contas a pagar
		try {
			contaPagar1.pagar();
		} catch (OperacaoContaException oce) {
			System.out.println("Erro: " + oce.getMessage());
		}
		
		try {
			contaPagar2.cancelar();
		} catch (OperacaoContaException oce) {
			System.out.println("Erro: " + oce.getMessage());
		}
		
		// recebimento e cancelamento de contas a receber
		try {
			contaReceber1.receber();
		} catch (OperacaoContaException oce) {
			System.out.println("Erro: " + oce.getMessage());
		}
		
		try {
			contaReceber2.cancelar();
		} catch (OperacaoContaException oce) {
			System.out.println("Erro: " + oce.getMessage());
		}
		
		try {
			contaReceber1.cancelar();
		} catch (OperacaoContaException oce) {
			System.out.println("Erro: " + oce.getMessage());
		}

		
		System.out.println();
		System.out.println("//////////////////  RELATÓRIO CONTAS  //////////////////////");
		System.out.println();
		
		//exibe listagem de todas as contas com detalhamento
		RelatorioContas relatorio = new RelatorioContas();
		Conta[] contas = new Conta[] {contaPagar1, contaPagar2, contaReceber1, contaReceber2};
		
		relatorio.exibirListagem(contas);
	}

}
