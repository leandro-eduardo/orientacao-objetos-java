
public class TesteArrays {
	
	public static void main(String[] args) {
		int[] notas = new int[4];
		notas[0] = 10;
		notas[1] = 5;
		notas[2] = 8;
		notas[3] = 9;
		
		for (int i = 0; i < notas.length; i++) {
			//notas[i] = i;
			System.out.println("Nota do aluno " + (i + 1) + ": " + notas[i]);
			
		}
				
	}
	
}
