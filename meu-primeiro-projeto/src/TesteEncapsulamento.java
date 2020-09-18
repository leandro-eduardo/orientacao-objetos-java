
public class TesteEncapsulamento {

	public static void main(String[] args) {
		ArCondicionado ar = new ArCondicionado(); // 17 a 25
		
		ar.alterarTemperatura(21);
		System.out.println("Temperatura do ar: " + ar.exibirTemperatura() + "ºC");
		
		ar.alterarTemperatura(22);
		System.out.println("Temperatura do ar: " + ar.exibirTemperatura() + "ºC");
	}

}
