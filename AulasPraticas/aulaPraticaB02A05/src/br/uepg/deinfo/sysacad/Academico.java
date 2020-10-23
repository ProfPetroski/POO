package br.uepg.deinfo.sysacad;

public class Academico {
    protected String nome;
    protected String ra;

    public Academico(String nome, String ra){
        this.nome = nome;
        this.ra = ra;
    }

    public void setNome(String nome){
        this.nome = nome;
    }
    public String getNome(){
        return this.nome;
    }

    public void setRa(String ra){
        this.ra = ra;
    }
    protected String getRa(){
        return this.ra;
    }

    public String toString(){
        String dadosAcademico = "Nome: \t"+this.getNome()+"\n";
        dadosAcademico += "RA: \t"+ this.getRa()+"\n";
        return dadosAcademico;
    }
}
