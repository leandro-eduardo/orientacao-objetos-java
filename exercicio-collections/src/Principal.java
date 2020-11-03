import java.math.BigDecimal;
import java.text.DecimalFormat;

/**
 * Classe Principal para executar o exercício sobre Collections. Essa classe
 * cria manualmente alguns Cargos, Governos e Políticos. Ao final, executa os
 * métodos definidos na classe Governo.
 * 
 * @author Leandro Eduardo
 *
 */
public class Principal {
	
	/**
	 * Método main responsável por executar a aplicação.
	 * 
	 * @param args argumentos de inicialização
	 * 
	 */
	public static void main(String[] args) {
		DecimalFormat formatador = new DecimalFormat("R$ #,##0.00");
		
		// instancia governo
		Governo governo = new Governo();
		
		// instancia cargos
		Cargo vereador = new Cargo();
		vereador.setDescricao("Vereador");
		vereador.setSalario(new BigDecimal(16000));
		
		Cargo deputadoEstadual = new Cargo();
		deputadoEstadual.setDescricao("Deputado Estadual");
		deputadoEstadual.setSalario(new BigDecimal(25000));
		
		Cargo prefeito = new Cargo();
		prefeito.setDescricao("Prefeito");
		prefeito.setSalario(new BigDecimal(27000));
		
		// adiciona vereadores
		Politico politico = new Politico();
		politico.setNome("João das Couves");
		politico.setCargo(vereador);
		governo.adicionarPolitico("RBLH", politico);
		
		politico = new Politico();
		politico.setNome("Marta das Dores");
		politico.setCargo(vereador);
		governo.adicionarPolitico("RBLH", politico);
		
		politico = new Politico();
		politico.setNome("Zé Mané");
		politico.setCargo(vereador);
		governo.adicionarPolitico("PCOR", politico);
		
		politico = new Politico();
		politico.setNome("Maria Carvalho");
		politico.setCargo(vereador);
		governo.adicionarPolitico("LDRS", politico);
			
		// adiciona deputados estaduais
		politico = new Politico();
		politico.setNome("Josefa Silva");
		politico.setCargo(deputadoEstadual);
		governo.adicionarPolitico("LDRS", politico);
		
		politico = new Politico();
		politico.setNome("Fátima Gonçalves");
		politico.setCargo(deputadoEstadual);
		governo.adicionarPolitico("PCOR", politico);
		
		// adiciona prefeito
		politico = new Politico();
		politico.setNome("Sebastião Mendes");
		politico.setCargo(prefeito);
		governo.adicionarPolitico("PCOR", politico);		
				
		// calcula gastos com partidos para determinados cargos
		BigDecimal gastosVereadoresPcor = governo.calcularGastosComSalarioPorCargo(vereador, "PCOR");
		System.out.println("Gastos com vereadores do partido PCOR: "
		+ formatador.format(gastosVereadoresPcor.doubleValue()));
		
		BigDecimal gastosDeputadosEstaduaisPcor = governo.calcularGastosComSalarioPorCargo(deputadoEstadual, "PCOR");
		System.out.println("Gastos com deputados estaduais do partido PCOR: "
		+ formatador.format(gastosDeputadosEstaduaisPcor.doubleValue()));
		
		BigDecimal gastosPrefeitosPcor = governo.calcularGastosComSalarioPorCargo(prefeito, "PCOR");
		System.out.println("Gastos com prefeitos do partido PCOR: "
		+ formatador.format(gastosPrefeitosPcor.doubleValue()));
		
		// calcula gastos com partidos
		BigDecimal gastosPcor = governo.calcularGastosComSalarioPorPartido("PCOR");
		System.out.println("Gastos totais com o partido PCOR: " + formatador.format(gastosPcor.doubleValue()));
		
		System.out.println();
		
		BigDecimal gastosVereadoresLdrs = governo.calcularGastosComSalarioPorCargo(vereador, "LDRS");
		System.out.println("Gastos com vereadores do partido LDRS: "
		+ formatador.format(gastosVereadoresLdrs.doubleValue()));
		
		BigDecimal gastosDeputadosEstaduaisLdrs = governo.calcularGastosComSalarioPorCargo(deputadoEstadual, "LDRS");
		System.out.println("Gastos com deputados estaduais do partido LDRS: "
		+ formatador.format(gastosDeputadosEstaduaisLdrs.doubleValue()));
		
		BigDecimal gastosPrefeitosLdrs = governo.calcularGastosComSalarioPorCargo(prefeito, "LDRS");
		System.out.println("Gastos com prefeitos do partido LDRS: "
		+ formatador.format(gastosPrefeitosLdrs.doubleValue()));
		
		// calcula gastos com partidos
		BigDecimal gastosLdrs = governo.calcularGastosComSalarioPorPartido("LDRS");
		System.out.println("Gastos totais com o partido LDRS: " + formatador.format(gastosLdrs.doubleValue()));
		
		System.out.println();
		
		BigDecimal gastosVereadoresRblh = governo.calcularGastosComSalarioPorCargo(vereador, "RBLH");
		System.out.println("Gastos com vereadores do partido RBLH: "
		+ formatador.format(gastosVereadoresRblh.doubleValue()));
		
		BigDecimal gastosDeputadosEstaduaisRblh = governo.calcularGastosComSalarioPorCargo(deputadoEstadual, "RBLH");
		System.out.println("Gastos com deputados estaduais do partido RBLH: "
		+ formatador.format(gastosDeputadosEstaduaisRblh.doubleValue()));
		
		BigDecimal gastosPrefeitosRblh = governo.calcularGastosComSalarioPorCargo(prefeito, "RBLH");
		System.out.println("Gastos com prefeitos do partido RBLH: "
		+ formatador.format(gastosPrefeitosRblh.doubleValue()));
		
		// calcula gastos com partidos
		BigDecimal gastosRblh = governo.calcularGastosComSalarioPorPartido("RBLH");
		System.out.println("Gastos totais com o partido RBLH: " + formatador.format(gastosRblh.doubleValue()));
		
		System.out.println();
		
		governo.imprimirPoliticos("PCOR");
		
		System.out.println();
		
		governo.imprimirPoliticos("LDRS");
		
		System.out.println();
		
		governo.imprimirPoliticos("RBLH");

	}

}
