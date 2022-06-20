
public class TestaConversao {

	public static void main(String[] args) { 
		double salario = 1270.50;
		int valor = (int) salario;
		System.out.println(valor);
		
		float pontoFlutuante = 3.14f;
		System.out.println(pontoFlutuante);
		
		long numeroGrande = 32432423523l; 
		System.out.println("Essa é a maior variavel: " + numeroGrande);
		
		short valorPequeno = 2131;
		System.out.println("Essa é menor que o int: " +valorPequeno);
		
		byte menorValor = 127;
		System.out.println("Essa é a menor de todas variavel: " +menorValor);
		
		double valor1 = 0.2;
		double valor2 = 0.1;
		double total = valor1 + valor2;
		System.out.println(total);
	}
}
