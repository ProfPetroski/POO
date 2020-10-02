public class Principal {
    public static void main(String args[]){
        Monitor novoMonitor = new Monitor("LG", "ln19", 650.0, 19);
        Monitor novoMonitor2 = new Monitor("LG", "ln19", 550.0, 19);

        System.out.println(novoMonitor.compareTo(novoMonitor2));

        System.out.println(novoMonitor.toString());

        String descricaoPromocao = novoMonitor.descricaoPromocao();

        System.out.println(descricaoPromocao);

        novoMonitor.setTamanhoTela(22);

        Promocionavel promo = novoMonitor;
        promo.descricaoPromocao();
        promo.valorPromocional(1);

        System.out.println("4 Monitores = "+promo.valorPromocional(4)+"\n");
        System.out.println("2 Monitores = "+promo.valorPromocional(2)+"\n");
    }
}
