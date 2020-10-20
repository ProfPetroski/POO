public class Produto {

    private String nome;
    private double valor;
    private int quantidade;

    public Produto(String nome, double valor, int quantidade) throws ValorIncorretoException{

        this.setNome(nome);
        this.setValor(valor);
        this.setQuantidade(quantidade);


    }

    public void setNome(String nome) throws ValorIncorretoException {
        if(nome.length()<3){
            throw new ValorIncorretoException("O nome do produto deve ter no mínimo 3 caracteres");
        }
        this.nome = nome;
    }

    public String getNome() {
        return this.nome;
    }

    public void setValor(double valor) throws ValorIncorretoException {
        if(valor<0){
            throw new ValorIncorretoException("O valor do produto deve ser maior ou igual a 0 (zero)");
        }
        this.valor = valor;
    }
    public double getValor(){
        return this.valor;
    }
    public void setQuantidade(int quantidade) throws ValorIncorretoException{
        if(quantidade<0){
            throw new ValorIncorretoException("A quantidade do produto deve maior ou igual a 0 (zero)");
        }
        this.quantidade= quantidade;
    }
    public int getQuantidade(){
        return this.quantidade;
    }

    public String toString(){
        String dadosProduto;
        dadosProduto = "\tNome \t:"+this.getNome()+"\n";
        dadosProduto += "\tValor \t:"+this.getValor()+"\n";
        dadosProduto += "\tQuantidade \t:"+this.getQuantidade()+"\n";
        return dadosProduto;
    }
}
