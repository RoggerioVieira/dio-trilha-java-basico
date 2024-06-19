import lombok.Data;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@Data
public class Transacao {
    private double valor;
    private String descricao;
    private LocalDateTime timestamp;
    private String nomeRemetente;
    private static final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");

    public Transacao(double valor, String descricao, String nomeRemetente) {
        this.valor = valor;
        this.descricao = descricao;
        this.timestamp = LocalDateTime.now();
        this.nomeRemetente = nomeRemetente;
    }

    public String getDataHoraFormatada() {
        return timestamp.format(formatter);
    }
}
