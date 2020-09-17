public class Pessoa {
    private String nome;
    private String cpf;
    private int idade;

    public Pessoa(String nome, String cpf, int idade) {
        this.nome = nome;
        this.cpf = cpf;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String toString() {
        String dadosPessoa;
        dadosPessoa = "Nome: \t" + this.nome + "\n";
        dadosPessoa += "CPF: \t" + this.cpf + "\n";
        dadosPessoa += "Idade: \t" + this.idade + "\n";
        return dadosPessoa;
    }
}