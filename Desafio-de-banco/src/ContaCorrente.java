import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
public class ContaCorrente extends Conta {
    public ContaCorrente(Cliente cliente) {
        super(cliente);
    }

    @Override
    public void imprimirExtratoCompleto() {
        imprimirExtrato();
        System.out.println(String.format("Data de Abertura: %s", getDataAbertura()));
    }
}
