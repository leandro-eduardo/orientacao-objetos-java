package com.algaworks.curso.fjoo.abstrata;

public class ProdutoPerecivel extends Produto {

	String dataValidade;
	
	@Override
	public void imprimirDescricao() {
		System.out.println("Descri��o: " + super.getDescricao() + ". Vencimento: " + dataValidade);
		
	}

}
