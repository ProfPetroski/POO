public class Principal {
    public static void main(String args[]){
        Funcionario f1 = new Funcionario("Luiz Pedro Petroski", "000.000.000-00", 25, 1300.0, "25/08/2020");
        System.out.println(f1.toString());
        f1.setNome("Maria da Silva");
        f1.setSalario(4500.0);
        System.out.println(f1);


    }
}
