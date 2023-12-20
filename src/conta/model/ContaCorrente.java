package conta.model;

public class ContaCorrente extends ContaBancaria {

	private float limite;

	public ContaCorrente(int numero, int agencia, int tipo, String titular, float saldo, float limite) {
		super(numero, agencia, tipo, titular, saldo);
		this.limite = limite;
	}

	public float getLimite() {
		return limite;
	}

	public void setLimite(float limite) {
		this.limite = limite;
	}
	
	@Override
	public void visualizar() {
		super.visualizar();		// Só consigo obter os resultados, não tenho acesso direto!
		System.out.println("Limite de Crédito: " + this.limite);
	}

	@Override
	public boolean sacar(float valor) {
		if (this.getSaldo() + this.getLimite() < valor) {
			System.out.println("Saldo insuficiente.");
			return false;
		}
		
		this.setSaldo(this.getSaldo() - valor);
		return true;
	}
	
}