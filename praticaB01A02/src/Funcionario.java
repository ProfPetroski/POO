public class Funcionario {
    String nome;
    String cpf;
    String cargo;
    double salario;
    Data dataNascimento;
    boolean ativo;

    void despedir(){
        this.ativo=false;
        System.out.println("O funcionário "+this.nome+" foi despedido");
    }
    void aumento(double valor){
        this.salario+=valor;
        System.out.println("O funcionário "+this.nome+" foi ganhou um aumento");
    }
    void promover(String novoCargo){
        this.cargo = novoCargo;
        System.out.println("O funcionário "+this.nome+" foi promovido para "+ this.cargo);
    }
    void imprimirInformacoes(){
        System.out.println("Nome:\t"+this.nome);
        System.out.println("CPF:\t"+this.cpf);
        System.out.println("Cargo:\t"+this.cargo);
        System.out.printf("Salario:\t%.2f\n",this.salario);
        System.out.print("Data de nascimento:\t");
        this.dataNascimento.imprimirData();
        System.out.println("Ativo:\t"+this.ativo);
    }
    double calcularSalarioAnual(){
        double salarioAnual = 13*this.salario;
        return salarioAnual;
    }
    void setDataNascimento(byte dia, byte mes, short ano){
        this.dataNascimento = new Data();
        this.dataNascimento.setDia(dia);
        this.dataNascimento.setMes(mes);
        this.dataNascimento.setAno(ano);
    }
    void setDataNascimento(Data novaDataNascimento){
        this.dataNascimento = novaDataNascimento;
    }
}
