package telefone.aparelhoCelular.celular;

import telefone.aparelhoCelular.aparelhoTelefone.AparelhoTelefonico;
import telefone.aparelhoCelular.navegador.NavegadorInternet;
import telefone.aparelhoCelular.reprodutorMusica.ReprodutorMusical;

public class iPhone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet{

    public void pausar() {
        System.out.println("PAUSANDO MÚSICA");

    }

    public void selecionarMusica(String musica) {
        System.out.println("SELECIONANDO MÚSICA");

    }

    public void tocar() {
        System.out.println("TOCANDO MÚSICA");

    }

    public void atender() {
        System.out.println("ATENDENDENDO LIGAÇÃO");

    }

    public void iniciarCorreioVoz() {
        System.out.println("INICIANDO CORREIO DE VOZ");

    }

    public void ligar(String numero) {
        System.out.println("FAZENDO LIGAÇÃO");

    }

    public void adicionarNovaAba() {
        System.out.println("ADICIONANDO NOVA ABA");

    }

    public void atualizarPagina() {
        System.out.println("ATUALIZANDO PÁGINA");

    }

    public void exibirPagina(String url) {
        System.out.println("EXIBINDO PÁGINA");
    }

}
