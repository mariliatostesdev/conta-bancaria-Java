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
	public boolean sacar(float valor) {
		if (this.getSaldo() + this.getLimite() < valor) {
			System.out.println("\nSaldo insuficiente.");
			return false;
		}
		
		this.setSaldo(this.getSaldo() - valor);
		return true;
	}
	
	@Override
	public void visualizar() {
		super.visualizar();		// Só consigo obter os resultados, não tenho acesso direto!
		System.out.println("\nLimite de Crédito: " + this.limite);
	}
	

//
//	public void depositar(float valor) {
//		this.setSaldo(this.getSaldo() + valor);
//	}
//
//	public void visualizar() {
//
//		String tipo = "";
//
//		switch (this.tipo) {
//		case 1:
//			tipo = "Conta Corrente";
//			break;
//		case 2:
//			tipo = "Conta Poupança";
//			break;
//		}
}
