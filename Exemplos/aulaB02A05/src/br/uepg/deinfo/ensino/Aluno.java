package br.uepg.deinfo.ensino;

public class Aluno {
    String nome;
    Professor orientador;
    public Aluno(String nome, Professor orientador){
        this.nome = nome;
        this.orientador = orientador;
    }

    public void alterarDepartamentoOrientador(){
        this.orientador.departamento = "DEMAT";
    }
}
