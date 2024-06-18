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
	public void transferir(double valor, Iconta contaDestino) {
		// TODO Auto-generated method stub
		
	}
}
