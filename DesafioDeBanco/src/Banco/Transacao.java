<<<<<<< HEAD
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
=======
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
>>>>>>> 5f2ceccc59f8b3d3d4d332009c3d7928f3e1a525
