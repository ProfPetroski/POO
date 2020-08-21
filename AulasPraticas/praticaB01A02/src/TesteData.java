public class TesteData {
    public static void main(String[] args){
        //vamos utilizar os métodos para configurar os valores da data
        Data nascimento = new Data();
        nascimento.setDia((byte)32);
        nascimento.setMes((byte)13);
        nascimento.setAno((short)2021);
        nascimento.imprimirData();
        //Pode-se verificar que a data não foi inserida, pois era inválida

        //Agora vamos fazer um truque, mexer direto nos atributos
        nascimento.dia=32;
        nascimento.mes=13;
        nascimento.ano=2021;
        nascimento.imprimirData();
        //E agora a data foi configurada inconsistente. Porquê?
    }
}
