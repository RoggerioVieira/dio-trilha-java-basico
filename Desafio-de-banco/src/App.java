public class App {
    public static void main(String[] args) {
        Cliente rogerio = new Cliente();
        rogerio.setNome("Rogerio");

        ContaCorrente cc = new ContaCorrente(rogerio);
        cc.depositar(100);

        ContaPoupanca cp = new ContaPoupanca(rogerio);
        cc.transferir(55, cp);

        Banco banco = new Banco();
        banco.setNome("Meu Banco");
        banco.getClientes().add(rogerio); // Adiciona o cliente à lista de clientes do banco

        cc.imprimirExtratoCompleto();
        cp.imprimirExtratoCompleto();

        banco.listarClientes(); // Lista os clientes do banco
    }
}

