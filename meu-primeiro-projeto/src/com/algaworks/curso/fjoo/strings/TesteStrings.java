package com.algaworks.curso.fjoo.strings;

public class TesteStrings {
	
	public static void main(String[] args) {
		// String, StringBuilder e StringBuffer
		
		String s = "Olá"; // criada a String Olá
		s = s + " Pessoal"; // criada a String Pessoal e depoi a string Olá Pessoal
		System.out.println(s);
		
		StringBuilder sb = new StringBuilder("Olá"); // criada a StringBuilder Olá
		sb.append(" Pessoal"); // reaproveitando a StringBuilder 
		
		String resultado = sb.toString();
		System.out.println("Com StringBuilder: " + resultado); 
	}

}
