package com.algaworks.curso.fjoo.abstrata;

public class ProdutoPerecivel extends Produto {

	String dataValidade;
	
	@Override
	public void imprimirDescricao() {
		System.out.println("Descrição: " + super.getDescricao() + ". Vencimento: " + dataValidade);
		
	}

}
