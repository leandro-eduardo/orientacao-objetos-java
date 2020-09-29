
public class Notebook implements Seguravel {
	
	private double valorMercado;
	private int tempoDeUso;
	
	public Notebook(double valorMercado, int tempoDeUso) {
		this.valorMercado = valorMercado;
		this.tempoDeUso = tempoDeUso;
	}
	
	@Override
	public double calcularValorApolice() {
		double valorApolice = valorMercado * 0.020;
		if (tempoDeUso >= 5 ) {
			valorApolice = valorApolice * 0.5;
		}
		return valorApolice;
	}
	@Override
	public String obterDescricao() {
		return "Notebook com " + tempoDeUso + " anos de uso e valor de mercado R$" + valorMercado + ".";
	}

}
