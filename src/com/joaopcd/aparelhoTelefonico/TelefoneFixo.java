package com.joaopcd.aparelhoTelefonico;

public class TelefoneFixo implements aparelhoTelefonico{
    @Override
    public void ligar() {
        System.out.println("Telefone ligando");
    }

    @Override
    public void atender() {
        System.out.println("Telefone atendendendo ligação");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Telefone iniciando correio de voz");
    }
}
