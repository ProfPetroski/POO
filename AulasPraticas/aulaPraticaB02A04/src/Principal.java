public class Principal {
    public static void main(String args[]){
        Estoque estoqueLoja = new Estoque();

        try {
            estoqueLoja.addProduto("Sapato", 240.0, 5);
            estoqueLoja.addProduto("Camisa", 140.0, 12);

        }
        catch (RuntimeException e){
            System.out.println(e.getMessage());
        }
        
        estoqueLoja.imprimirProduto(0);
        estoqueLoja.imprimirProduto(1);

        estoqueLoja.imprimirProduto(4);
        estoqueLoja.imprimirProduto(7);

        estoqueLoja.addProduto("Meia", 10, -5);
        estoqueLoja.addProduto("Me", 10, 5);
        estoqueLoja.addProduto("Camisa", -10, 5);

        estoqueLoja.imprimirProduto(0);
    }
}
