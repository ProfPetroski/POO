package br.uepg.deinfo.systcc;

import br.uepg.deinfo.sysacad.*;

public class TrabalhoConclusaoCurso {
    private String titulo;
    private Academico academicos[];
    private Orientador orientador;

    public TrabalhoConclusaoCurso(String titulo){
        this.titulo = titulo;
        this.academicos = new Academico[2];
    }

    public void addAcademico(Academico academico){
        for (int i=0; i< academicos.length; i++){
            if(academicos[i]==null){
                academicos[i]=academico;
                return;
            }
        }
        throw new RuntimeException("Um trabalho de TCC pode conter ao máximo 2 acadêmicos");
    }
    public void setTitulo(String titulo){
        this.titulo = titulo;
    }
    public String getTitulo(){
        return this.titulo;
    }

    public void setOrientador(Orientador orientador){
        this.orientador = orientador;
    }

    public Orientador getOrientador(){
        return this.orientador;
    }

    public String toString(){
        String dadosTCC = "Titulo: \t"+this.getTitulo()+"\n";
        dadosTCC += "Acadêmicos:\n";
        for(int i=0; i<this.academicos.length; i++){
            if(this.academicos[i]!= null){
                dadosTCC+=academicos[i].toString();
            }
        }
        dadosTCC+= "Orientador: \t"+ this.orientador.toString();
        return dadosTCC;
    }
}
