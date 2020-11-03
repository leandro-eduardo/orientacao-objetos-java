import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Classe utilizada para processar informações sobre os Políticos e Cargos.
 * 
 * @author Leandro Eduardo
 *
 */
public class Governo {
	
	DecimalFormat formatador = new DecimalFormat("R$ #,##0.00");

	// armazena uma lista de políticos por estado da federação
	private Map<String, List<Politico>> partidosPoliticos;
	
	public Governo() {
		this.partidosPoliticos = new HashMap<String, List<Politico>>();
	}
	
	/**
	 * Esta classe adiciona um Político em um Partido.
	 * 
	 * @param partidoPolitico partido político em que o político será adicionado
	 * @param politico        político que será adicionado ao partido
	 * 
	 */
	public void adicionarPolitico(String partidoPolitico, Politico politico) {
		// recupera a lista de políticos para um partido
		List<Politico> politicos = this.partidosPoliticos.get(partidoPolitico);
		
		// se não existir uma lista de políticos para o partido informado,
		// devemos instanciar uma nova lista (pois é a primeira inclusão neste partido)
		if (politicos == null) {
			politicos = new ArrayList<Politico>();
		}
		
		// adiciona o político recebido como parâmetro à lista de políticos
		politicos.add(politico);
		
		// adiciona a lista de políticos ao mapa de partidos
		// usando como chave o nome do partido
		this.partidosPoliticos.put(partidoPolitico, politicos);
	}
	
	/**
	 * Este método calcula todos os gastos com salários de um determinado Partido Político.
	 * 
	 * @param  partidoPolitico partido político para qual os gastos serão calculados
	 * @return valor total dos gastos com os salários do partido informado
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
	 * Este método calcula os gastos com salários de um Partido baseando-se em um determinado Cargo.
	 * 
	 * @param cargo           cargo a ser utilizado para o cálculo
	 * @param partidoPolitico partido político para calcular os gastos
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
	 * Este método imprime todos os Políticos de um determinado Partido Político com as seguintes informações: Nome, Cargo e Salário.
	 * 
	 * @param  partidoPolitico partido político para qual os políticos serão exibidos
	 * 
	 */
	public void imprimirPoliticos(String partidoPolitico) {
		List<Politico> politicos = this.partidosPoliticos.get(partidoPolitico);
		System.out.println("Políticos do partido " + partidoPolitico);
		System.out.println("Quantidade de políticos neste partido: " + politicos.size());
		for (Politico p : politicos) {
			System.out.println("Nome: " + p.getNome());
			System.out.println("Cargo: " + p.getCargo().getDescricao());
			System.out.println("Salário: " + formatador.format(p.getCargo().getSalario()));
		}
	}
	
	
	
}
