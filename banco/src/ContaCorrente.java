

public class ContaCorrente extends Conta {
    public ContaCorrente(Cliente cliente, Agencia agencia) {
        super(cliente, agencia);
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("=== Extrato da Conta Corrente ===");
        super.imprimirInfsComuns();
    }

	@Override
	public void transferir(double valor, Iconta contaDestino) {
		// TODO Auto-generated method stub
		
	}

  
  
        
        ;
    }
