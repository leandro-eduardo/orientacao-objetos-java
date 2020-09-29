package com.algaworks.curso.fjoo.interfaces;

public class TesteInterface {

	public static void main(String[] args) {
		Imprimivel i = new NotaFiscal(39041);
		i.imprimir();
		
		Enviavel e = (Enviavel) i;
		e.enviar("leandroeduardo@gmail.com");
		
		NotaFiscal n = (NotaFiscal) e;	
		n.adicionarPedido("SSD M2 512MB");
	}

}
