package br.uepg.deinfo.interfaces;

public interface Comparavel {
    //return 1 se this é maior que o outro objeto
    //return -1 se this é menor que o outro objeto
    //return 0 se this é igual ao outro objeto

    int ehMaiorQue(Comparavel outro);

    public default void imprimirComparacao(Comparavel outro){
        if(this.ehMaiorQue(outro)==1){
            System.out.println("E maior");
        }
        else if(this.ehMaiorQue(outro)==-1){
            System.out.println("E menor");
        }
        else{
            System.out.println("E igual");
        }
    }
}
