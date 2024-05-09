package com.joaopcd.reprodutorMusical;

public class Radio implements ReprodutorMusical{
    @Override
    public void tocar() {
        System.out.println("Rádio tocando");
    }

    @Override
    public void pausar() {
        System.out.println("Pausando o rádio");
    }

    @Override
    public void selecionarMusica() {
        System.out.println("Selecionando a música do rádio");
    }
}
