package br.uepg.deinfo.data;

import br.uepg.deinfo.excecoes.*;

public class Feriado {
    private String nomeFeriado;
    private Data dataFeriado;

    public Feriado(String nomeFeriado, Data dataFeriado){
        this.nomeFeriado=nomeFeriado;
        this.dataFeriado=dataFeriado;
    }

    public Feriado(String nomeFeriado, int dia, int mes, int ano) {
        this.nomeFeriado = nomeFeriado;
        Data dataFeriado = null;
        try {
            dataFeriado = new Data(dia, mes, ano);
            dataFeriado.teste=10;
        }catch (DataInvalidaException e){
            System.out.println(e.getMessage());
            e.printStackTrace();
        }

        this.dataFeriado = dataFeriado;
    }
    public String toString(){
        String dadosFeriado;
        dadosFeriado = "\t Nome: \t"+ this.nomeFeriado+"\n";
        dadosFeriado += "\t Data: \t"+ this.dataFeriado+"\n";
        return dadosFeriado;
    }
}
