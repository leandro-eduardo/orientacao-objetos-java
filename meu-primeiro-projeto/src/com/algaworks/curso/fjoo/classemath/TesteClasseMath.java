package com.algaworks.curso.fjoo.classemath;

import static java.lang.Math.PI;
import static java.lang.Math.max;

public class TesteClasseMath {
	
	public static void main(String[] args) {
		// comprimento de uma circunferência 2x r x PI (3,1415)
		int raio = 4;
		double comprimento = 2 * raio * PI;
		System.out.println("Comprimento: " + comprimento);
		
		// máximo e mínimo
		double[] precosProdutoA = {30.20, 25.49};
		System.out.println("Maior preço: " + max(precosProdutoA[0], precosProdutoA[1]));
		System.out.println("Menor preco: " + Math.min(precosProdutoA[0], precosProdutoA[1]));
		
		// potência
		System.out.println("2^3: " + Math.pow(2, 3));
		
		// raiz quadrada
		System.out.println("Raiz de 9: " + Math.sqrt(9));
		
		// arredondamento ceil, floor e round
		double n = 5.4;
		System.out.println("Maior inteiro: " + Math.ceil(n));
		System.out.println("Menor inteiro: " + Math.floor(n));
		System.out.println("Arredondar: " + Math.round(n));
		
		// trigonometria
		System.out.println("Seno: " + Math.sin(40));
		
		// números randômicos
		double numeroAleatorio = Math.random() * 100;
		System.out.println(Math.round(numeroAleatorio));

	}

}
