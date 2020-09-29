
public class Embarcacao implements Seguravel {
	
	private double valorMercado;
	private String tipo;
	
	public Embarcacao(double valorMercado, String tipo) {
		this.valorMercado = valorMercado;
		this.tipo = tipo;
	}

	@Override
	public double calcularValorApolice() {
		double valorApolice;
		if (tipo.equals("Lancha")) {
			valorApolice = valorMercado * 0.10;
		} else if (tipo.equals("Veleiro")) {
			valorApolice = valorMercado * 0.08;
		} else if (tipo.equals("Iate")) {
			valorApolice = valorMercado * 0.30;
		} else {
			valorApolice = valorMercado * 0.04;
		}
		return valorApolice;
	}

	@Override
	public String obterDescricao() {
		return "Embarcação do tipo " + tipo + " com valor de mercado R$" + valorMercado + ".";
	}

}
