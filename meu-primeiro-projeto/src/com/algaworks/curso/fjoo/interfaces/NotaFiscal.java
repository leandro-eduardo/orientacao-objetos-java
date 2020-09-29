package com.algaworks.curso.fjoo.interfaces;

public class NotaFiscal implements Imprimivel, Enviavel {
	
	private int numero;
	
	public NotaFiscal(int numero) {
		this.numero = numero;
	}

	@Override
	public void imprimir() {
		System.out.println("Imprimindo a nota fiscal " + numero);
		
	}
	
	public void adicionarPedido(String produto) {
		
	}

	@Override
	public void enviar(String email) {
		System.out.println("Enviando a nota fiscal " + numero + " para o e-mail " + email);
	}

}
