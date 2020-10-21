import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Governo {
	
	DecimalFormat formatador = new DecimalFormat("R$ #,##0.00");

	// armazena uma lista de pol�ticos por estado da federa��o
	private Map<String, List<Politico>> partidosPoliticos;
	
	public Governo() {
		this.partidosPoliticos = new HashMap<String, List<Politico>>();
	}
	
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
	
	public BigDecimal calcularGastosComSalarioPorPartido(String partidoPolitico) {
		List<Politico> politicos = this.partidosPoliticos.get(partidoPolitico);
		
		BigDecimal gastosComSalarioPorPartido = new BigDecimal(0);
		for (Politico p : politicos) {
			gastosComSalarioPorPartido = gastosComSalarioPorPartido.add(p.getCargo().getSalario());
		}
		
		return gastosComSalarioPorPartido;
	}
	
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
