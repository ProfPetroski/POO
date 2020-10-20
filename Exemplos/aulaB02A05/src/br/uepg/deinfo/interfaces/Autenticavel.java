package br.uepg.deinfo.interfaces;

public interface Autenticavel {

    int autentica(String senha);
    int autoriza(String cargo);
}
