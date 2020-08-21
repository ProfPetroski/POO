public class Funcionario {
    String nome;
    String cpf;
    String cargo;
    double salario;
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
        System.out.println("Nome: "+this.nome);
        System.out.println("CPF: "+this.cpf);
        System.out.println("Cargo: "+this.cargo);
        System.out.printf("Salario: %.2f\n",this.salario);
        System.out.println("Ativo: "+this.ativo);
    }
    double calcularSalarioAnual(){
        double salarioAnual = 13*this.salario;
        return salarioAnual;
    }
}
