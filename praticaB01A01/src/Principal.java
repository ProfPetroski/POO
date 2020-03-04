public class Principal {
    public static void main(String[] args){
        Funcionario luiz = new Funcionario();
        luiz.nome = "Luiz Pedro Petroski";
        luiz.cpf = "00000000000";
        luiz.cargo = "Professor";
        luiz.salario = 1000.00;
        luiz.ativo = true;
        luiz.imprimirInformacoes();

        System.out.println("-----------------------------------");

        Funcionario pedro = new Funcionario();
        pedro.nome = "Pedro Silva";
        pedro.cpf = "11111111111";
        pedro.cargo = "Coordenador de curso";
        pedro.salario = 2000.00;
        pedro.ativo = true;
        pedro.imprimirInformacoes();

        System.out.println("-----------------------------------");

        Funcionario carlos = new Funcionario();
        carlos.nome = "Carlos Souza";
        carlos.cpf = "22222222222";
        carlos.cargo = "Diretor";
        carlos.salario = 2500.00;
        carlos.ativo = true;
        carlos.imprimirInformacoes();

        System.out.println("-----------------------------------");
        luiz.despedir();
        pedro.aumento(500.0);
        carlos.promover("Chefe de setor");
        System.out.println("-----------------------------------");
        luiz.imprimirInformacoes();
        System.out.println("-----------------------------------");
        pedro.imprimirInformacoes();
        System.out.println("-----------------------------------");
        carlos.imprimirInformacoes();
        System.out.println("-----------------------------------");
        double salarioAnual = luiz.calcularSalarioAnual()+pedro.calcularSalarioAnual()+carlos.calcularSalarioAnual();
        System.out.printf("O salário anual dos 3 funcionarios é: %.2f", salarioAnual);
    }
}
