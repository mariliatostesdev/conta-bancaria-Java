package conta.controller;

import java.util.ArrayList;
import conta.model.ContaBancaria;
import conta.repository.ContaRepository;

public class ContaController implements ContaRepository {
	private ArrayList<ContaBancaria> listaContas = new ArrayList<ContaBancaria>();
	int numero = 0;

	@Override
	public void listarTodas() {
		for (var conta : listaContas) {
			conta.visualizar();
		}
	}

	@Override
	public void cadastrar(ContaBancaria conta) {
		listaContas.add(conta);
		System.out.println("\nA Conta número: " + conta.getNumero() + " foi criada com sucesso!");
	}

	public int gerarNumero() {
		return ++numero;
	}

	// Métodos que obrigatoriamente foram adicionados da interface ContaRepository:
	public void procurarPorNumero(int numero) {

	}

	public void atualizar(ContaBancaria conta) {

	}

	public void deletar(int numero) {

	}

	public void sacar(int numero, float valor) {

	}

	public void depositar(int numero, float valor) {

	}

	public void transferir(int numeroOrigem, int numeroDestino, float valor) {

	}
}
