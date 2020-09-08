public class Principal {
    public static void main(String args[]){
        Pessoa p = new Pessoa(12);
        p.setIdade(32);
        p.andar();
        p.andar(6);
        p.andar(4.3);
        p.andar(3, "Luiz");

    }
}
