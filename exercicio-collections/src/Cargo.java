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
	 * Obtem a descri��o de um Cargo.
	 * 
	 * @return descri��o do Cargo
	 * 
	 */
	public String getDescricao() {
		return descricao;
	}
	
	/**
	 * Define a descri��o de um Cargo.
	 * 
	 * @param descricao descri��o a ser inserida no Cargo
	 * 
	 */
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	/**
	 * Obtem o sal�rio de um Cargo.
	 * 
	 * @return sal�rio do Cargo
	 * 
	 */
	public BigDecimal getSalario() {
		return salario;
	}
	
	/**
	 * Define o sal�rio de um Cargo.
	 * 
	 * @param salario sal�rio a ser inserido no Cargo
	 * 
	 */
	public void setSalario(BigDecimal salario) {
		this.salario = salario;
	}
	
}
