public class Funcionario implements Comparavel {
    private String nome;
    private int idade;
    private double salario;

    public Funcionario(String nome, int idade, double salario) {
        this.nome = nome;
        this.idade = idade;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public int ehMaiorQue(Comparavel outro){
        Funcionario outroFuncionario = (Funcionario) outro;
        if(this.getSalario()>outroFuncionario.getSalario()){
            return 1;
        }
        else if(this.getSalario()<outroFuncionario.getSalario()){
            return -1;
        }
        else{
            return 0;
        }
    }
    public void imprimirComparacao(Comparavel outro){
        Funcionario outroFuncionario = (Funcionario) outro;
        if(this.ehMaiorQue(outro)==1){
            System.out.println(this.getNome()+" e maior que "+outroFuncionario.getNome());
        }
        else if(this.ehMaiorQue(outro)==-1){
            System.out.println(this.getNome()+" e menor que "+outroFuncionario.getNome());
        }
        else{
            System.out.println(this.getNome()+" e igual a "+outroFuncionario.getNome());
        }
    }

}
