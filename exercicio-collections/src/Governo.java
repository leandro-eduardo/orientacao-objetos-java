import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Classe utilizada para processar informa��es sobre os Pol�ticos e Cargos.
 * 
 * @author Leandro Eduardo
 *
 */
public class Governo {
	
	DecimalFormat formatador = new DecimalFormat("R$ #,##0.00");

	// armazena uma lista de pol�ticos por estado da federa��o
	private Map<String, List<Politico>> partidosPoliticos;
	
	public Governo() {
		this.partidosPoliticos = new HashMap<String, List<Politico>>();
	}
	
	/**
	 * Esta classe adiciona um Pol�tico em um Partido.
	 * 
	 * @param partidoPolitico partido pol�tico em que o pol�tico ser� adicionado
	 * @param politico        pol�tico que ser� adicionado ao partido
	 * 
	 */
	public void adicionarPolitico(String partidoPolitico, Politico politico) {
		// recupera a lista de pol�ticos para um partido
		List<Politico> politicos = this.partidosPoliticos.get(partidoPolitico);
		
		// se n�o existir uma lista de pol�ticos para o partido informado,
		// devemos instanciar uma nova lista (pois � a primeira inclus�o neste partido)
		if (politicos == null) {
			politicos = new ArrayList<Politico>();
		}
		
		// adiciona o pol�tico recebido como par�metro � lista de pol�ticos
		politicos.add(politico);
		
		// adiciona a lista de pol�ticos ao mapa de partidos
		// usando como chave o nome do partido
		this.partidosPoliticos.put(partidoPolitico, politicos);
	}
	
	/**
	 * Este m�todo calcula todos os gastos com sal�rios de um determinado Partido Pol�tico.
	 * 
	 * @param  partidoPolitico partido pol�tico para qual os gastos ser�o calculados
	 * @return valor total dos gastos com os sal�rios do partido informado
	 * 
	 */
	public BigDecimal calcularGastosComSalarioPorPartido(String partidoPolitico) {
		List<Politico> politicos = this.partidosPoliticos.get(partidoPolitico);
		
		BigDecimal gastosComSalarioPorPartido = new BigDecimal(0);
		for (Politico p : politicos) {
			gastosComSalarioPorPartido = gastosComSalarioPorPartido.add(p.getCargo().getSalario());
		}
		
		return gastosComSalarioPorPartido;
	}
	
	/**
	 * Este m�todo calcula os gastos com sal�rios de um Partido baseando-se em um determinado Cargo.
	 * 
	 * @param cargo           cargo a ser utilizado para o c�lculo
	 * @param partidoPolitico partido pol�tico para calcular os gastos
	 * @return valor total dos gastos do Partido com base no Cargo informado
	 * 
	 */
	public BigDecimal calcularGastosComSalarioPorCargo(Cargo cargo, String partidoPolitico) {
		List<Politico> politicos = this.partidosPoliticos.get(partidoPolitico);
		
		BigDecimal gastosComSalarioPorCargo = new BigDecimal(0);
		for (Politico p : politicos) {
			if (p.getCargo().equals(cargo)) {
				gastosComSalarioPorCargo = gastosComSalarioPorCargo.add(p.getCargo().getSalario());
			}
		}

		return gastosComSalarioPorCargo;
	}
	
	/**
	 * Este m�todo imprime todos os Pol�ticos de um determinado Partido Pol�tico com as seguintes informa��es: Nome, Cargo e Sal�rio.
	 * 
	 * @param  partidoPolitico partido pol�tico para qual os pol�ticos ser�o exibidos
	 * 
	 */
	public void imprimirPoliticos(String partidoPolitico) {
		List<Politico> politicos = this.partidosPoliticos.get(partidoPolitico);
		System.out.println("Pol�ticos do partido " + partidoPolitico);
		System.out.println("Quantidade de pol�ticos neste partido: " + politicos.size());
		for (Politico p : politicos) {
			System.out.println("Nome: " + p.getNome());
			System.out.println("Cargo: " + p.getCargo().getDescricao());
			System.out.println("Sal�rio: " + formatador.format(p.getCargo().getSalario()));
		}
	}
	
	
	
}
