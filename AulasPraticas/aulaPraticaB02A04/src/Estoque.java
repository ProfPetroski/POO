public class Estoque {
    private static final int TAM=5;
    private Produto listaProdutos[];

    public Estoque(){
        this.listaProdutos = new Produto[TAM];
    }

    public void addProduto(String nome, double valor, int quantidade) throws RuntimeException{

        try {
            Produto novoProduto = new Produto(nome, valor, quantidade);
            for(int i=0; i<TAM; i++){
                if(this.listaProdutos[i]==null){
                    this.listaProdutos[i]=novoProduto;
                    return;
                }
            }
            throw new RuntimeException("Lista cheia");
        }
        catch (ValorIncorretoException e){
            System.out.println(e.getMessage());
            //e.printStackTrace();

        }


        //Se finalizar o for, significa que o return não foi executado, logo
        //não foi possível inserir na lista pois está cheia
    }

    public void imprimirProduto(int indice){
        System.out.println("Dados do produto "+ indice+":");
        System.out.println(this.listaProdutos[indice].toString());
    }
}
