import java.util.Scanner;

public class ExemploLerTeclado {
    public static void main(String args[]) {
        Scanner leitura = new Scanner(System.in).useDelimiter("\n");

        String nome;
        System.out.println("Digite seu nome: ");
        nome = leitura.next();
        System.out.println("O Seu nome é:"+nome);

        int nota;
        System.out.println("Digite sua nota: ");
        nota = leitura.nextInt();
        System.out.println("O nota digitada foi:"+nota);
    }
}
