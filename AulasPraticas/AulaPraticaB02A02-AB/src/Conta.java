public abstract class Conta {
    private String nomeTitular;
    private int agencia;
    private int numero;
    protected double saldo;

    public Conta(String nomeTitular, int agencia, int numero){
        this.nomeTitular = nomeTitular;
        this.setAgencia(agencia);
        this.setNumero(numero);
        this.saldo = 0;
    }

    public void setNomeTitular(String nomeTitular){
        this.nomeTitular = nomeTitular;
    }
    public String getNomeTitular(){
        return this.nomeTitular;
    }

    public void setAgencia(int agencia){
        if(agencia>0) {
            this.agencia = agencia;
        }
        else{
            System.out.println("Número de agência inválido");
        }
    }
    public int getAgencia(){
        return this.agencia;
    }

    public void setNumero(int numero){
        if(numero>0){
            this.numero = numero;
        }
        else{
            System.out.println("Número de conta inválido");
        }
    }
    public int getNumero(){
        return this.numero;
    }

    public double getSaldo(){
        return this.saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public abstract int depositar(double valor);
    public abstract int sacar(double valor);

    public void imprimiExtrato(){
        System.out.println("====================================");
        System.out.println("==========Extrato de conta==========");
        System.out.println(this.toString());
        System.out.println("====================================");
    }

    public String toString(){
        String dadosConta;
        dadosConta = "Titular: \t"+this.getNomeTitular()+"\n";
        dadosConta += "Agência: \t"+this.getAgencia()+"\n";
        dadosConta += "Numero: \t"+this.getNumero()+"\n";
        dadosConta += "Saldo: \t\t"+this.getSaldo()+"\n";
        return dadosConta;
    }

    //Desafio
    public void transfere(double valor, Conta destinatario){
        // TO-DO

    }
    /*
    Conseguimos acessar os métodos sacar e depositar?
    R:
     */
}