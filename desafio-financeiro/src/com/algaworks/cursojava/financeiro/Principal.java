package com.algaworks.cursojava.financeiro;

import com.algaworks.cursojava.financeiro.modelo.Cliente;
import com.algaworks.cursojava.financeiro.modelo.ContaPagar;
import com.algaworks.cursojava.financeiro.modelo.ContaReceber;
import com.algaworks.cursojava.financeiro.modelo.Fornecedor;

public class Principal {

	public static void main(String[] args) {
		// instanciando fornecedores
		Fornecedor imobiliaria = new Fornecedor();
		imobiliaria.setNome("Casa & Cia Neg�cios Imobili�rios");
		Fornecedor mercado = new Fornecedor();
		mercado.setNome("Mercado do Jo�o");
		
		// instanciando clientes
		Cliente atacadista = new Cliente();
		atacadista.setNome("Tri�ngulo Quadrado Atacadista");
		Cliente telecom = new Cliente();
		telecom.setNome("FoneNet Telecomunica��es");
		
		// instanciando contas a pagar
		ContaPagar contaPagar1 = new ContaPagar();
		contaPagar1.setDescricao("Aluguel da Matriz");
		contaPagar1.setValor(1230d);
		contaPagar1.setDataVencimento("10/10/2020");
		contaPagar1.setFornecedor(imobiliaria);
		
		ContaPagar contaPagar2 = new ContaPagar("Compras do m�s", 390d, "19/10/2020", mercado);
		
		// instanciando contas a receber
		ContaReceber contaReceber1 = new ContaReceber();
		contaReceber1.setDescricao("Desenvolvimento de Projeto de Log�stica em Java");
		contaReceber1.setValor(89500d);
		contaReceber1.setDataVencimento("23/05/2021");
		contaReceber1.setCliente(atacadista);
		
		ContaReceber contaReceber2 = new ContaReceber("Manuten��o em Sistema de Conta On-line", 53200d, "13/05/2021", telecom);
		
		// pagamento e cancelamento de contas a pagar
		contaPagar1.pagar();
		contaPagar2.cancelar();
		
		// recebimento e cancelamento de contas a receber
		contaReceber1.receber();
		contaReceber2.cancelar();
	
	}

}
