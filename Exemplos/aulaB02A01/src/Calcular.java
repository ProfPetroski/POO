public class Calcular {
    public static double mediaIdades(Pessoa pessoas[]){
        double total=0;
        int quantidade = 0;
        for(Pessoa p: pessoas){
            if(p!=null){
                total += p.getIdade();
                quantidade++;
            }
        }
        return total/quantidade;
    }
}
