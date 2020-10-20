package br.uepg.deinfo.excecoes;
public class DataInvalidaException extends Exception {
    public DataInvalidaException(){}
    public DataInvalidaException(String msg){
        super(msg);
    }
}
