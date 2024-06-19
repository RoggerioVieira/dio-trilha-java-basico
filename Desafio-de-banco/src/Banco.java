import lombok.Data;
import java.util.List;
import java.util.ArrayList;

@Data
public class Banco {
    private String nome;
    private List<Conta> contas = new ArrayList<>();
    private List<Cliente> clientes = new ArrayList<>(); // Inicializa a lista de clientes

    public void listarClientes() {
        System.out.println("=== Lista de Clientes ===");
        for (Cliente cliente : clientes) {
            System.out.println(cliente.getNome());
        }
    }
}
