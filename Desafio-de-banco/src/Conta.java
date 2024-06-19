import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

import lombok.Data;

@Data
public abstract class Conta implements IConta {

    protected static final int AGENCIA_PADRAO = 1;
    private static int SEQUENCIAL = 1;
    protected int agencia;
    protected int numero;
    protected double saldo;
    protected Cliente cliente;
    protected LocalDate dataAbertura;
    protected List<Transacao> transacoes;

    public Conta(Cliente cliente) {
        this.agencia = AGENCIA_PADRAO;
        this.numero = SEQUENCIAL++;
        this.cliente = cliente;
        this.dataAbertura = LocalDate.now();
        this.transacoes = new ArrayList<>();
    }

    @Override
    public void depositar(double valor) {
        saldo += valor;
        addTransacao(new Transacao(valor, "Depósito", null));
    }

    @Override
    public void sacar(double valor) {
        saldo -= valor;
        addTransacao(new Transacao(-valor, "Saque", null));
    }

    @Override
    public void transferir(double valor, Conta contaDestino) {
        this.sacar(valor);
        contaDestino.depositar(valor);
        addTransacao(new Transacao(-valor, "Transferência para conta: " + contaDestino.getNumero(), contaDestino.getCliente().getNome()));
        contaDestino.addTransacao(new Transacao(valor, "Transferência recebida da conta: " + this.getNumero(), this.cliente.getNome()));
    }

    public void addTransacao(Transacao transacao) {
        this.transacoes.add(transacao);
    }

    public void imprimirExtrato() {
        System.out.println("=== Extrato da Conta: " + this.getClass().getSimpleName() + " ===");
        System.out.println(String.format("Titular: %s", this.cliente.getNome()));
        System.out.println(String.format("Agencia: %d", this.agencia));
        System.out.println(String.format("Numero: %d", this.numero));
        System.out.println(String.format("Saldo: %.2f", this.saldo));
        System.out.println(String.format("Data de Abertura: %s", this.dataAbertura.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"))));
        System.out.println("=== Transacoes ===");

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");

        boolean primeiraEntrada = true;
        boolean primeiraSaida = true;

        for (Transacao transacao : transacoes) {
            double valor = transacao.getValor();
            if (valor > 0 && primeiraEntrada) {
                System.out.println(String.format("%s - Entrada: %.2f", transacao.getDataHoraFormatada().formatted(formatter), valor));
                primeiraEntrada = false;
            } else if (valor < 0 && !primeiraEntrada) {
                if (primeiraSaida) {
                    System.out.println(String.format("%s - Saída: %.2f", transacao.getDataHoraFormatada().formatted(formatter), -valor));
                    primeiraSaida = false;
                }
            }
        }
    }

    public abstract void imprimirExtratoCompleto();
}
