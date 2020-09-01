public class OperadorAritimetico1 {
	
	public static void main(String[] args) {
		int soma = 2 + 10;
		int subtracao = 6 - 10;
		int multiplicacao = 8 * 3;
		int divisao = 8 / 2;
		int resto = 7 % 2;
				
		System.out.println(soma);
		System.out.println(subtracao);
		System.out.println(multiplicacao);
		System.out.println(divisao);
		System.out.println(resto);
		
		int notaAluno1 = 99;
		int notaAluno2 = 80;
		int notaAluno3 = 53;
		
		int totalGeral = notaAluno1 + notaAluno2 + notaAluno3;
		System.out.println("Total geral: " + totalGeral);
		
		int mediaGeral = totalGeral / 3;
		System.out.println("Media geral: " + mediaGeral);
	}	
	
}	