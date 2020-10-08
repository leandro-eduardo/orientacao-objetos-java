package com.algaworks.curso.fjoo.strings;

public class TesteStrings {
	
	public static void main(String[] args) {
		// String, StringBuilder e StringBuffer
		
		String s = "Ol�"; // criada a String Ol�
		s = s + " Pessoal"; // criada a String Pessoal e depoi a string Ol� Pessoal
		System.out.println(s);
		
		StringBuilder sb = new StringBuilder("Ol�"); // criada a StringBuilder Ol�
		sb.append(" Pessoal"); // reaproveitando a StringBuilder 
		
		String resultado = sb.toString();
		System.out.println("Com StringBuilder: " + resultado); 
	}

}
