/**
 * Model de Pol�tico.
 * 
 * @author Leandro Eduardo
 *
 */
public class Politico {

	private String nome;
	private Cargo cargo;
	
	/**
	 * Obtem o nome de um Pol�tico.
	 * 
	 * @return nome do Pol�tico
	 * 
	 */
	public String getNome() {
		return nome;
	}
	
	/**
	 * Define o nome de um Pol�tico.
	 * 
	 * @param nome nome a ser inserido no Pol�tico
	 * 
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	/**
	 * Obtem o cargo de um Pol�tico.
	 * 
	 * @return cargo do Pol�tico
	 * 
	 */
	public Cargo getCargo() {
		return cargo;
	}
	
	/**
	 * Define o cargo de um Pol�tico.
	 * 
	 * @param cargo cargo a ser inserido no Pol�tico
	 * 
	 */
	public void setCargo(Cargo cargo) {
		this.cargo = cargo;
	}
		
}
