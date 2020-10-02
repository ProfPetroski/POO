public class ContaPoupanca extends Conta{
    private String dataAniversario;
    private double rendimento;

    public ContaPoupanca(String nomeTitular, int agencia, int numero, double rendimento){
        super(nomeTitular, agencia, numero);
        this.rendimento = rendimento;
    }

    public void setDataAniversario(String dataAniversario){
        this.dataAniversario=dataAniversario;
    }
    public String getDataAniversario(){
        return this.dataAniversario;
    }
    public void setRendimento(double rendimento){
        this.rendimento=rendimento;
    }
    public double getRendimento(){
        return this.rendimento;
    }

    public void adicionaRendimento(){
        super.saldo+=super.saldo*this.rendimento;
        System.out.println("Rendimento adicionado a poupança");
    }

    @Override
    public int depositar(double valor) {
        if(valor>=0){
            if(this.dataAniversario==null){
                this.dataAniversario = "28/08/2020";
            }
            this.saldo+=valor;
            System.out.println("Depósito efetuado no valor de R$ "+valor+" na conta de "+this.getNomeTitular()+"\n");
            return 1;
        }
        System.out.println("Não foi possível depositar R$ "+valor+" na conta de "+this.getNomeTitular()+"\n");
        return 0;

    }
    @Override
    public int sacar(double valor){
        if(valor>=0&&valor<=this.saldo){
            this.saldo-=valor;
            System.out.println("Sacado da Conta Corrente de "+ this.getNomeTitular()+" o valor de: R$"+valor);
            return 1;
        }
        else if(valor >= 0 && valor > this.saldo){
            System.out.println("Saldo insuficiente para sacar R$"+valor);
        }
        else{
            System.out.println("Valor de saque inválido");
        }
        return 0;
    }

    @Override
    public String toString() {
        String dadosContaPoupanca;
        dadosContaPoupanca = "**********Conta Poupança**********\n";
        dadosContaPoupanca += super.toString();
        dadosContaPoupanca += "Data de aniversário: \t"+this.getDataAniversario()+"\n";
        dadosContaPoupanca += "Rendimento mensal: \t"+this.getRendimento()+"\n";
        return dadosContaPoupanca;
    }
}