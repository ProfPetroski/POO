public class Principal {
    public static void main(String args[]){
        Computador meuPC = new Computador("Asus", "AB123", 2400.0, 8, "Core I5", 1024);
        Monitor meuMonitor = new Monitor("LG", "mod12", 600.0, 19);
        PlacaVideo minhaPlaca = new PlacaVideo("NVIDIA", "RTX2060", 2500.0, 6, "HDMI");

        Carrinho meuCarrinho = new Carrinho();

        meuCarrinho.adiciona(meuPC);
        meuCarrinho.adiciona(meuMonitor);
        meuCarrinho.adiciona(minhaPlaca);
        //meuCarrinho.getLista()[0].setMemoria(12);
        meuPC.setMemoria(12);

        meuCarrinho.imprimirProdutos();

        double total = meuCarrinho.calculaTotal();
        System.out.println(total);
    }
}
