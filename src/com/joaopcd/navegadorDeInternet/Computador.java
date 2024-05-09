package com.joaopcd.navegadorDeInternet;

public class Computador implements NavegadorDeInternet{

    @Override
    public void exibirPagina() {
        System.out.println("Computador exibindo página");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Computador adicionando nova aba");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Computador atualizando a página");
    }
}
