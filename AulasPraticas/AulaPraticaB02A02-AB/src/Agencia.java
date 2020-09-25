public class Agencia {
    private int numeroAgencia;
    private int proximoNumeroConta;
    private double limitePadrao;
    private double rendimentoPadrao;

    private ContaCorrente listaContaCorrente[];
    private ContaPoupanca listaContaPoupanca[];

    public Agencia(int numeroAgencia, double limitePadrao, double rendimentoPadrao){
        this.numeroAgencia = numeroAgencia;
        this.proximoNumeroConta = 1;
        this.limitePadrao = limitePadrao;
        this.rendimentoPadrao = rendimentoPadrao;

         this.listaContaCorrente = new ContaCorrente[20];
         this.listaContaPoupanca = new ContaPoupanca[20];
    }

    public int getNumeroAgencia() {
        return this.numeroAgencia;
    }

    public int getProximoNumeroConta(){
        return this.proximoNumeroConta;
    }

    public ContaCorrente[] getListaContaCorrente(){
        return this.listaContaCorrente;
    }

    public ContaPoupanca[] getListaContaPoupanca(){
        return this.listaContaPoupanca;
    }

    public double getLimitePadrao(){
        return this.limitePadrao;
    }
    public void setLimitePadrao(double limitePadrao){
        this.limitePadrao = limitePadrao;
    }

    public double getRendimentoPadrao(){
        return this.rendimentoPadrao;
    }

    public void setRendimentoPadrao(double rendimentoPadrao){
        this.rendimentoPadrao = rendimentoPadrao;
    }

    public ContaCorrente novaContaCorrente(String nomeTitular){
        ContaCorrente novaCC = new ContaCorrente(nomeTitular, this.getNumeroAgencia(), this.getProximoNumeroConta(), this.getLimitePadrao());
        this.proximoNumeroConta++;
        for(int i=0; i<this.listaContaCorrente.length;i++){
            if(this.listaContaCorrente[i]==null){
                listaContaCorrente[i]=novaCC;
                return novaCC;
            }
        }
        return null;
    }
    public ContaPoupanca novaContaPoupanca(String nomeTitular){
        ContaPoupanca novaContaPoupanca = new ContaPoupanca(nomeTitular, this.numeroAgencia, this.proximoNumeroConta,this.rendimentoPadrao);
        this.proximoNumeroConta++;
        for(int i=0; i<this.listaContaPoupanca.length; i++){
            if(listaContaPoupanca[i]==null){
                listaContaPoupanca[i]=novaContaPoupanca;
                return novaContaPoupanca;
            }
        }
        return null;
    }
    public void cobrarTaxa(Conta conta){
        System.out.println("Cobrando taxa de cesta de serviços:\n"+
        "Nome Titular:"+conta.getNomeTitular());
        conta.sacar(5);
    }

    public double balanco(Conta listaContas[]){
        double balanco = 0;
        for(Conta c: listaContas){
            if(c!=null)
                balanco+=c.getSaldo();
        }
        return balanco;
    }



}
