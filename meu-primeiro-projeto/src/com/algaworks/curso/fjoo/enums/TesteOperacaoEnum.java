package com.algaworks.curso.fjoo.enums;

public class TesteOperacaoEnum {

	public static void main(String[] args) {
		OperacaoAritmetica o1 = OperacaoAritmetica.ADICAO;
		OperacaoAritmetica o2 = OperacaoAritmetica.SUBTRACAO;
		
		int resultado;
		resultado = o1.operacao(5, 3);
		System.out.println("O resultado é: " + resultado);
		resultado = o2.operacao(5, 3);
		System.out.println("O resultado é: " + resultado);
		
		for (OperacaoAritmetica oa : OperacaoAritmetica.values()) {
			System.out.println(oa + " -> " + oa.operacao(4, 2));
		}
				
	}
	
}
