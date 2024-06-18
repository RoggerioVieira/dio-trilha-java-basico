<<<<<<< HEAD
package Banco;

public class ContaPoupanca extends Conta {
    public ContaPoupanca(Cliente cliente, Agencia agencia) {
        super(cliente, agencia);
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("=== Extrato da Conta Poupança ===");
        super.imprimirInfsComuns();
    }

	@Override
	public void transferir(double valor, IConta contaDestino) {
		// TODO Auto-generated method stub
		
	}
}
=======
package Banco;

public class ContaPoupanca extends Conta {
    public ContaPoupanca(Cliente cliente, Agencia agencia) {
        super(cliente, agencia);
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("=== Extrato da Conta Poupança ===");
        super.imprimirInfsComuns();
    }

	@Override
	public void transferir(double valor, IConta contaDestino) {
		// TODO Auto-generated method stub
		
	}
}
>>>>>>> 5f2ceccc59f8b3d3d4d332009c3d7928f3e1a525
