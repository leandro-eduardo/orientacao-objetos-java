/**
 * Model de Político.
 * 
 * @author Leandro Eduardo
 *
 */
public class Politico {

	private String nome;
	private Cargo cargo;
	
	/**
	 * Obtem o nome de um Político.
	 * 
	 * @return nome do Político
	 * 
	 */
	public String getNome() {
		return nome;
	}
	
	/**
	 * Define o nome de um Político.
	 * 
	 * @param nome nome a ser inserido no Político
	 * 
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	/**
	 * Obtem o cargo de um Político.
	 * 
	 * @return cargo do Político
	 * 
	 */
	public Cargo getCargo() {
		return cargo;
	}
	
	/**
	 * Define o cargo de um Político.
	 * 
	 * @param cargo cargo a ser inserido no Político
	 * 
	 */
	public void setCargo(Cargo cargo) {
		this.cargo = cargo;
	}
		
}
