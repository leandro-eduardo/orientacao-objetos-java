import java.math.BigDecimal;

/**
 * Model de Cargo.
 * 
 * @author Leandro Eduardo
 *
 */
public class Cargo {
	
	private String descricao;
	private BigDecimal salario;
	
	/**
	 * Obtem a descrição de um Cargo.
	 * 
	 * @return descrição do Cargo
	 * 
	 */
	public String getDescricao() {
		return descricao;
	}
	
	/**
	 * Define a descrição de um Cargo.
	 * 
	 * @param descricao descrição a ser inserida no Cargo
	 * 
	 */
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	/**
	 * Obtem o salário de um Cargo.
	 * 
	 * @return salário do Cargo
	 * 
	 */
	public BigDecimal getSalario() {
		return salario;
	}
	
	/**
	 * Define o salário de um Cargo.
	 * 
	 * @param salario salário a ser inserido no Cargo
	 * 
	 */
	public void setSalario(BigDecimal salario) {
		this.salario = salario;
	}
	
}
