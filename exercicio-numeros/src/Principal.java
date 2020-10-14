import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.print("Informe o valor do produto: ");
		double valorProduto = entrada.nextDouble();		
		
		BigDecimal bg = new BigDecimal(valorProduto);
		bg = bg.multiply(new BigDecimal(0.1));
		
		DecimalFormat formatador = new DecimalFormat("R$ ###,##0.00");
		System.out.println("10% do valor informado: "+ formatador.format(bg));
		
	}

}
