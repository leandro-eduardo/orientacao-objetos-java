
public class ContaPagar {
	private String descricao;
	private Double valor;
	private String dataVencimento;
	private Fornecedor fornecedor;
	
	ContaPagar() {
		
	}
	
	ContaPagar(String descricao, Double valor, String dataVencimento, Fornecedor fornecedor) {
		this.descricao = descricao;
		this.valor = valor;
		this.dataVencimento = dataVencimento;
		this.fornecedor = fornecedor;
		
	}
	
	void pagar() {
		System.out.println("--------------------");
		System.out.println("Fornecedor: " + fornecedor.getNome());
		System.out.println("Descrição: " + descricao);
		System.out.println("Valor: " + valor + " reais");
		System.out.println("Vencimento: " + dataVencimento);
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}

	public String getDataVencimento() {
		return dataVencimento;
	}

	public void setDataVencimento(String dataVencimento) {
		this.dataVencimento = dataVencimento;
	}

	public Fornecedor getFornecedor() {
		return fornecedor;
	}

	public void setFornecedor(Fornecedor fornecedor) {
		this.fornecedor = fornecedor;
	}
	
}
