package com.joaopcd;

import com.joaopcd.aparelhoTelefonico.TelefoneFixo;
import com.joaopcd.multifuncional.Iphone;
import com.joaopcd.navegadorDeInternet.Computador;
import com.joaopcd.reprodutorMusical.Radio;

public class Usuario {
    public static void main(String[] args) {

        TelefoneFixo tf = new TelefoneFixo();
        tf.ligar();
        tf.atender();
        tf.iniciarCorreioVoz();

        Computador pc = new Computador();
        pc.exibirPagina();
        pc.adicionarNovaAba();
        pc.atualizarPagina();

        Radio radio = new Radio();
        radio.selecionarMusica();
        radio.tocar();
        radio.pausar();

        Iphone iphone = new Iphone();
        iphone.atender();
        iphone.ligar();
        iphone.iniciarCorreioVoz();
        iphone.exibirPagina();
        iphone.adicionarNovaAba();
        iphone.atualizarPagina();
        iphone.selecionarMusica();
        iphone.tocar();
        iphone.pausar();
    }
}
