<<<<<<< HEAD
package Banco;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import lombok.Data;

@Data
public class Banco {
    private String nome;
    private List<Conta> contas = new ArrayList<>();
    private List<Cliente> clientes = new ArrayList<>();

    public List<Cliente> listarClientes() {
        return clientes.stream().distinct().collect(Collectors.toList());
    }

    public void adicionarConta(Conta conta) {
        if (conta != null && conta.getCliente() != null) {
            contas.add(conta);
            if (!clientes.contains(conta.getCliente())) {
                clientes.add(conta.getCliente());
            }
        }
    }

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
}
=======
package Banco;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import lombok.Data;

@Data
public class Banco {
    private String nome;
    private List<Conta> contas = new ArrayList<>();
    private List<Cliente> clientes = new ArrayList<>();

    public List<Cliente> listarClientes() {
        return clientes.stream().distinct().collect(Collectors.toList());
    }

    public void adicionarConta(Conta conta) {
        if (conta != null && conta.getCliente() != null) {
            contas.add(conta);
            if (!clientes.contains(conta.getCliente())) {
                clientes.add(conta.getCliente());
            }
        }
    }

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
}
>>>>>>> 5f2ceccc59f8b3d3d4d332009c3d7928f3e1a525
