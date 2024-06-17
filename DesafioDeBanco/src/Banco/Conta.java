package Banco;
import java.util.ArrayList;
import java.util.List;

public abstract class Conta implements IConta {
	private static final int AGENCIA_PADRAO = 1;
    private static int SEQUENCIAL = 1;

    protected int agencia;
    protected int  conta;
    protected double saldo;
    protected Cliente cliente;
    protected Agencia agenciaInfo;
    protected List<Transacao> transacoes;

    public Conta(Cliente cliente, Agencia agencia) {
        this.agenciaInfo = agencia;
        this.agencia = Conta.AGENCIA_PADRAO;
        this.conta = SEQUENCIAL++;
        this.cliente = cliente;
        this.transacoes = new ArrayList<>();
    }

    @Override
    public void depositar(double valor) {
        saldo += valor;
        registrarTransacao(valor, "Depósito");
    }

    @Override
    public void sacar(double valor) {
        saldo -= valor;
        registrarTransacao(-valor, "Saque");
    }

    @Override
    public void transferir(double valor, Conta contaDestino) {
        this.sacar(valor);
        contaDestino.depositar(valor);
        registrarTransacao(-valor, "Transferência enviada");
        contaDestino.registrarTransacao(valor, "Transferência recebida");
    }

    private void registrarTransacao(double valor, String descricao) {
        Transacao transacao = new Transacao(valor, descricao);
        this.transacoes.add(transacao);
    }

    protected void imprimirInfsComuns() {
        System.out.println(String.format("Titular: %s", this.cliente.getNome()));
        System.out.println(String.format("Agência: %04d", this.agencia));
        System.out.println(String.format("Conta: %02d", this.conta));
        System.out.println(String.format("Saldo: %.2f", this.saldo));
        System.out.println("Transações:");
        for (Transacao transacao : transacoes) {
            System.out.println(String.format("%s: %.2f", transacao.getDescricao(), transacao.getValor()));
        }
    }

    public Cliente getCliente() {
        return cliente;
    }
}
