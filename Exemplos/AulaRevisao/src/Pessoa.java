public class Pessoa {
    private int idade;

    public Pessoa(){

    }
    public Pessoa(int idade){
        this.idade = idade;
    }

    public int getIdade(){
        return this.idade;
    }
    public void setIdade(int idade){
        this.idade = idade;
    }

    public void andar(){
        System.out.println("Andou 1 passo");
    }
    public void andar(int passos){
        System.out.println("Andou "+passos+" passos");
    }
    public void andar(int passos, String nome){
        System.out.println(nome + " Andou "+passos+" passos");
    }
    public void andar(double passos){
        System.out.println("Andou "+passos+" passos");
    }

}
