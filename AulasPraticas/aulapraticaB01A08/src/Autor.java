public class Autor {
    private String nome;
    private String email;
    private int idade;

    public Autor(String nome, String email, int idade){
        this.setNome(nome);
        this.setEmail(email);
        this.setIdade(idade);
    }
    public String getNome(){
        return this.nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public String getEmail(){
        return this.email;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public int getIdade(){
        return this.idade;
    }
    public void setIdade(int idade){
        if(idade>=0){
            this.idade = idade;
        }
        else{
            System.out.println("A idade deve ser maior ou igual a 0\n");
        }
    }

    public String toString(){
        String dadosAutor;
        dadosAutor = "\tNome:\t"+ this.nome+"\n"+"\tEmail:\t"+this.email+"\n\tIdade:\t"+this.idade+"\n";
        return dadosAutor;
    }

}
