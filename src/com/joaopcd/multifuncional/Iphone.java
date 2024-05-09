package com.joaopcd.multifuncional;

import com.joaopcd.aparelhoTelefonico.aparelhoTelefonico;
import com.joaopcd.navegadorDeInternet.NavegadorDeInternet;
import com.joaopcd.reprodutorMusical.ReprodutorMusical;

public class Iphone implements aparelhoTelefonico, NavegadorDeInternet, ReprodutorMusical {
    @Override
    public void ligar() {
        System.out.println("Iphone ligando");
    }

    @Override
    public void atender() {
        System.out.println("Iphone atendendendo ligação");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iphone iniciando correio de voz");
    }

    @Override
    public void exibirPagina() {
        System.out.println("Iphone exibindo página");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Iphone adicionando nova aba");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Iphone atualizando a página");
    }

    @Override
    public void tocar() {
        System.out.println("Iphone tocando música");
    }

    @Override
    public void pausar() {
        System.out.println("Iphone pausando música");
    }

    @Override
    public void selecionarMusica() {
        System.out.println("Iphone selecionando música");
    }
}
