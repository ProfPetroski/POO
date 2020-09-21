public class Carrinho {
    private Produto lista[];

    public Carrinho(){
        this.lista = new Produto[50];

    }

    public Produto[] getLista(){
        return this.lista;
    }
    public void setLista(Produto lista[]){
        this.lista=lista;
    }

    public void adiciona(Produto p){
        for(int i=0; i<this.lista.length;i++){
            if(lista[i]==null){
                lista[i]=p;
                return;
            }
        }
    }

    public void imprimirProdutos(){
        for(Produto p: this.lista){
            if(p!=null){
                System.out.println(p.toString());
                System.out.println("************************");
            }
        }
    }

    public double calculaTotal(){
        double total=0;
        for(Produto p: this.lista){
            if(p!=null){
                total+=p.getPreco();
            }
        }
        return total;
    }

}
