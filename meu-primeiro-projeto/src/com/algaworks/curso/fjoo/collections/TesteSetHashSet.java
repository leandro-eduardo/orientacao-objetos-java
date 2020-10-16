package com.algaworks.curso.fjoo.collections;

import java.util.HashSet;
import java.util.Set;

public class TesteSetHashSet {

	public static void main(String[] args) {
		Aluno a1 = new Aluno("Jo�o");
		Aluno a2 = new Aluno("Maria");
		Aluno a3 = new Aluno("Jos�");
		Aluno a4 = new Aluno("Pedro");
		
		Set<Aluno> alunos = new HashSet<Aluno>(); // sequ�ncia � sempre aleat�ria e n�o � poss�vel obter uma posi��o espec�fica como no ArrayList
		alunos.add(a1);
		alunos.add(a2);
		alunos.add(a3);
		alunos.add(a4);
		alunos.add(a4); // n�o � poss�vel adicionar o mesmo objeto mais de uma vez no HashSet
		
		imprimirAlunos(alunos);
	}
	
	public static void imprimirAlunos(Set<Aluno> alunos) {
		for (Aluno a : alunos) {
			System.out.println("Nome: " + a.getNome());
		}
	}
	
}
