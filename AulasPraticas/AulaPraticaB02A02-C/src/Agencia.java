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
         System.out.println("Nova Agência criada:\n"+this.toString());
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
        ContaCorrente novaContaCorrente = new ContaCorrente(nomeTitular, this.getNumeroAgencia(), this.getProximoNumeroConta(), this.getLimitePadrao());
        this.proximoNumeroConta++;
        for(int i=0; i<this.listaContaCorrente.length;i++){
            if(this.listaContaCorrente[i]==null){
                listaContaCorrente[i]=novaContaCorrente;
                System.out.println("Nova Conta Corrente criada:\n"+novaContaCorrente.toString());
                return novaContaCorrente;
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
                System.out.println("Nova Conta Poupança criada:\n"+novaContaPoupanca.toString());
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

    public String toString(){
        String dadosAgencia;
        dadosAgencia ="Numero da agência:\t"+this.getNumeroAgencia()+"\n";
        dadosAgencia +="Proximo Numero de Conta:\t"+this.getProximoNumeroConta()+"\n";
        dadosAgencia +="Limite Padrao:\t"+this.getLimitePadrao()+"\n";
        dadosAgencia +="Rendimento Padrão:\t"+this.getRendimentoPadrao()+"\n";
        return dadosAgencia;
    }



}
