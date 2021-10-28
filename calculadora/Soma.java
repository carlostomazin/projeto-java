package calculadora;

public class Soma extends Operacao {
	
	public Soma(int valor1, int valor2) {
		super(valor1, valor2);
	}
	
	public void realizaOperação() {
		System.out.println("Soma = " + super.getValor1() + super.getValor2());
	};
	
	
	
	
}
