

import telefone.aparelhoCelular.celular.iPhone;

public class App {
    public static void main(String[] args) {
        iPhone meuIphone = new iPhone();
        
        // Testando ReprodutorMusical
        System.out.println("Testando Reprodutor Musical:");
        meuIphone.tocar();
        meuIphone.pausar();
        meuIphone.selecionarMusica("Imagine - John Lennon");

        // Testando AparelhoTelefonico
        System.out.println("\nTestando Aparelho Telefonico:");
        meuIphone.ligar("123456789");
        meuIphone.atender();
        meuIphone.iniciarCorreioVoz();

        // Testando NavegadorInternet
        System.out.println("\nTestando Navegador Internet:");
        meuIphone.exibirPagina("https://www.example.com");
        meuIphone.adicionarNovaAba();
        meuIphone.atualizarPagina();
    }
}
