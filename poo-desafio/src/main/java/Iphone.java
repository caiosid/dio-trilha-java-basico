package main.java;

import main.java.navegador.NavegadorInternet;
import main.java.reprodutor.ReprodutorMusical;
import main.java.telefone.AparelhoTelefonico;

public class Iphone implements ReprodutorMusical, NavegadorInternet, AparelhoTelefonico{


    @Override
    public void pausar() {
        // TODO Auto-generated method stub
        System.out.println("Pausando...");
    }

    @Override
    public void selecionarMusica() {
        // TODO Auto-generated method stub
        System.out.println("Selecionando a música deseja");
    }

    @Override
    public void tocar() {
        // TODO Auto-generated method stub
        System.out.println("Tocando a música selecionada");
    }

    @Override
    public void adicionarNovaAba() {
        // TODO Auto-generated method stub
        System.out.println("Adicionando a uma nova aba");
    }

    @Override
    public void atualizarPagina() {
        // TODO Auto-generated method stub
        System.out.println("Atulizando a página desejada");
    }

    @Override
    public void exibirPagina() {
        // TODO Auto-generated method stub
        System.out.println("Exibindo a página desejada");
    }

    @Override
    public void atender() {
        // TODO Auto-generated method stub
        System.out.println("Atendendo a ligação");
    }

    @Override
    public void iniciarCorreioVoz() {
        // TODO Auto-generated method stub
        System.out.println("Iniciando o correrio de voz");
    }

    @Override
    public void ligar() {
        // TODO Auto-generated method stub
        System.out.println("Ligando...");
    }
    
}
