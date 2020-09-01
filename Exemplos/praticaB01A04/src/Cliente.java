public class Cliente {
    private String nome;
    private String cpf;
    private String cargo;
    private double salario;
    private Data dataNascimento;
    private boolean ativo;


    void imprimirInformacoes(){
        System.out.println("Nome:\t"+this.nome);
        System.out.println("CPF:\t"+this.cpf);
        System.out.println("Cargo:\t"+this.cargo);
        System.out.printf("Salario:\t%.2f\n",this.salario);
        System.out.print("Data de nascimento:\t");
        this.dataNascimento.imprimirData();
        System.out.println("Ativo:\t"+this.ativo);
    }

    void setDataNascimento(Data novaDataNascimento){
        this.dataNascimento = novaDataNascimento;
    }
}
