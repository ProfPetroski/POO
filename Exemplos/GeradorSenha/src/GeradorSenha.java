public class GeradorSenha {
    // Função para gerar uma senha de tamanho n
    static String gerar(int n)
    {
        // Escolher um caracter da seguinte string
        String AlphaNumericString = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
                + "0123456789"
                + "abcdefghijklmnopqrstuvxyz";
        // criar um buffer de string
        StringBuilder sb = new StringBuilder(n);
        for (int i = 0; i < n; i++) {
            // Gerar um número aleatório
            int index
                    = (int)(AlphaNumericString.length()
                    * Math.random());
            // adicionar os caracteres aleatórios
            sb.append(AlphaNumericString
                    .charAt(index));
        }
        return sb.toString();
    }
}
