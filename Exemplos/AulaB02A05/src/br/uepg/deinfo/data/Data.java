package br.uepg.deinfo.data;

import br.uepg.deinfo.excecoes.DataInvalidaException;

public class Data {
    private int dia;
    private int mes;
    private int ano;
    protected int teste;

    public Data(){};
    public Data(int dia, int mes, int ano) throws DataInvalidaException{
        this.validarData(dia, mes, ano);
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    public void setData(int dia, int mes, int ano) throws DataInvalidaException{
        this.validarData(dia, mes, ano);
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    private void validarData(int dia, int mes, int ano) throws DataInvalidaException{
        if(dia<1 || dia>31){
            throw new DataInvalidaException("Dia inválido");
        }
        if(mes<1 || mes>12){
            throw new DataInvalidaException("Mês inválido");
        }
    }
    public String toString(){
        String dadosData;
        dadosData = this.dia+"/"+this.mes+"/"+this.ano;
        return dadosData;
    }
}
