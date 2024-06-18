<<<<<<< HEAD
package Banco;

public interface IConta {
	
	void sacar(double valor);
	
	void depositar(double valor);
	
	void transferir(double valor, IConta contaDestino);
	
	void imprimirExtrato();

	void transferir(double valor, Conta contaDestino);
=======
package Banco;

public interface IConta {
	
	void sacar(double valor);
	
	void depositar(double valor);
	
	void transferir(double valor, IConta contaDestino);
	
	void imprimirExtrato();

	void transferir(double valor, Conta contaDestino);
>>>>>>> 5f2ceccc59f8b3d3d4d332009c3d7928f3e1a525
}