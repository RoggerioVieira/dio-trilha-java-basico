package Banco;
import lombok.Data;

@Data
public class Transacao {
    private double valor;
    private String descricao;
    private long timestamp;

    public Transacao(double valor, String descricao) {
        this.setValor(valor);
        this.setDescricao(descricao);
        this.setTimestamp(System.currentTimeMillis());
    }

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public long getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(long timestamp) {
		this.timestamp = timestamp;
	}
}
