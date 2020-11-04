
public class ExemplosClasseString7 {

	public static void main(String[] args) {
		String s = "Cursos_Online_de_Desenvolvimento_de_Software";

		String[] array = s.split("_");

		for (int i = 0; i < array.length; i++) {
			System.out.println("[" + i + "] = " + array[i]);
		}
		
	}

}
