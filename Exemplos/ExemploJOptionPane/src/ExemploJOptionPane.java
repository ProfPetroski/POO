import javax.swing.JOptionPane;

public class ExemploJOptionPane {
    public static void main(String[] args)
    {
        // Pergunta Sim ou não
        int resposta = JOptionPane.showConfirmDialog(null,"Pergunta?", "Titulo janela", JOptionPane.YES_NO_OPTION);
        //verfica se a resposta é verdadeira
        if (resposta == JOptionPane.YES_OPTION) {
            //Imprimir uma mensagem
            JOptionPane.showMessageDialog(null, "Resposta SIM");
        }
        else {
            //Imprimir uma mensagem
            JOptionPane.showMessageDialog(null, "Resposta não");
            System.exit(0);
        }

        //Solicitar ao usuário uma entrada
        String valor = JOptionPane.showInputDialog("Digite uma String", null);
        System.out.println(valor);

        //Para solicitar um tipo diferente de string é necessário converter
        String entrada = JOptionPane.showInputDialog("Digite um valor inteiro", null);
        int valorInteiro = Integer.parseInt(entrada);
        System.out.println(valorInteiro);
    }
}
