package br.uepg.deinfo.sysacad;

public class Orientador {
    private String nome;
    private String areaTematica;

    public Orientador(String nome, String areaTematica){
        this.nome = nome;
        this.areaTematica = areaTematica;
    }

    public void setNome (String nome){
        this.nome = nome;
    }
    public String getNome(){
        return this.nome;
    }

    public void setAreaTematica(String areaTematica){
        this.areaTematica = areaTematica;
    }

    public String getAreaTematica() {
        return areaTematica;
    }

    public String toString(){
        String dadosOrientador = "Nome: \t"+ this.getNome()+"\n";
        dadosOrientador += "Área temática: \t" + this.getAreaTematica()+"\n";
        return dadosOrientador;
    }
}
