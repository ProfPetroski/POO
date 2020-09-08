public class Principal {
    public static void main(String args[]){
        Funcionario f1 = new Funcionario("Luiz Pedro Petroski", "000.000.000-00", 25, 1300.0, "25/08/2020");
        System.out.println(f1.toString());

        Pessoa p1;
        p1 = f1;
        p1.setIdade(45);
        System.out.println(p1.getIdade());
        f1.setSalario(4500.0);

        Pessoa p2 = new Pessoa("Carlos da Silva", "111.111.111-11", 21);
        //Funcionario f2 = p2;
        Funcionario f2 = new Funcionario("José da Silva", "222.222.222-22", 45, 1200.0, "08/09/2020");
        Funcionario f3 = new Funcionario("Maria da Silva", "333.333.333-33", 24, 1700.0, "08/09/2020");

        Funcionario listaFuncionarios[] = new Funcionario[3];
        listaFuncionarios[0]=f1;
        listaFuncionarios[1]=f2;
        listaFuncionarios[2]=f3;

        double media = Calcular.mediaIdades(listaFuncionarios);
        System.out.println(media);





    }
}
