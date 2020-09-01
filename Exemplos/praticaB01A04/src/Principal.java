public class Principal {
    public static void main(String[] args){
        Cliente luiz = new Cliente();
        luiz.nome = "Luiz Pedro Petroski";
        luiz.cpf = "00000000000";
        luiz.cargo = "Professor";
        luiz.salario = 1000.00;
        luiz.ativo = true;
        luiz.dataNascimento = new Data();
        luiz.setDataNascimento((byte)1, (byte)1, (short)2000);
        luiz.imprimirInformacoes();

        System.out.println("-----------------------------------");

        Cliente pedro = new Cliente();
        pedro.nome = "Pedro Silva";
        pedro.cpf = "11111111111";
        pedro.cargo = "Coordenador de curso";
        pedro.salario = 2000.00;
        pedro.ativo = true;
        pedro.setDataNascimento((byte)2, (byte)2, (short)2001);
        pedro.imprimirInformacoes();

        System.out.println("-----------------------------------");

        Cliente carlos = new Cliente();
        carlos.nome = "Carlos Souza";
        carlos.cpf = "22222222222";
        carlos.cargo = "Diretor";
        carlos.salario = 2500.00;
        carlos.ativo = true;
        Data nascimento = new Data();
        nascimento.setData((byte)3, (byte)3, (short)2002);
        carlos.setDataNascimento(nascimento);
        carlos.imprimirInformacoes();

        System.out.println("-----------------------------------");

        luiz.imprimirInformacoes();
        //A data foi setada inválida!

        System.out.println("-----------------------------------");
        carlos.imprimirInformacoes();
        //A data inválida não foi atribuida

    }
}
