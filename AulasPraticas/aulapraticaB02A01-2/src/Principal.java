public class Principal {
    public static void main(String args[]){
        Computador meuPC = new Computador("Asus", "AB123", 2400.0, 8, "Core I5", 1024);
        Monitor meuMonitor = new Monitor("LG", "mod12", 600.0, 19);
        //PlacaVideo minhaPlaca = new PlacaVideo(....
        Carrinho meuCarrinho = new Carrinho();

        meuCarrinho.adiciona(meuPC);
        meuCarrinho.adiciona(meuMonitor);

        meuCarrinho.imprimirProdutos();

        double total = meuCarrinho.calculaTotal();
        System.out.println(total);
    }
}