public class Funcionario extends Pessoa {
    private double salario;
    private String dataAdmissao;

    public Funcionario(String nome, String cpf, int idade, double salario, String dataAdmissao) {
        super(nome, cpf, idade);
        this.salario = salario;
        this.dataAdmissao = dataAdmissao;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getDataAdmissao() {
        return dataAdmissao;
    }

    public void setDataAdmissao(String dataAdmissao) {
        this.dataAdmissao = dataAdmissao;
    }

    @Override
    public String toString() {
        String dadosFuncionario;
        dadosFuncionario = super.toString();
        dadosFuncionario += "Salário: \t" + this.salario + "\n";
        dadosFuncionario += "Data de Admissão: \t" + this.dataAdmissao + "\n";
        return dadosFuncionario;
    }
}
