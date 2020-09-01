public class Livro {
    private String titulo;
    private Autor autor;
    private int numeroPaginas;
    private double preco;
    private int tiragem;
    private char classificacao;
    private double nota;

    public Livro(String titulo, Autor autor, int numeroPaginas, double preco, int tiragem, char classificacao, double nota){
        this.titulo = titulo;
        this.autor = autor;
        this.setNumeroPaginas(numeroPaginas);
        this.setPreco(preco);
        this.setTiragem(tiragem);
        this.setClassificacao(classificacao);
        this.setNota(nota);
    }

    public String getTitulo(){
        return this.titulo;
    }
    public void setTitulo(String titulo){
        this.titulo = titulo;
    }
    public Autor getAutor(){
        return this.autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }
    public int getNumeroPaginas(){
        return this.numeroPaginas;
    }

    public void setNumeroPaginas(int numeroPaginas) {
        if(numeroPaginas>0){
            this.numeroPaginas = numeroPaginas;
        }
        else{
            System.out.println("O número de páginas deve ser maior que 0\n");
        }
    }
    public double getPreco(){
        return this.preco;
    }
    public void setPreco(double preco){
        if(preco>=0){
            this.preco = preco;
        }
        else{
            System.out.println("O preço deve ser maior ou igual a 0\n");
        }

    }
    public int getTiragem(){
        return this.tiragem;
    }
    public void setTiragem(int tiragem){
        if(tiragem>0) {
            this.tiragem = tiragem;
        }
        else{
            System.out.println("A tiragem deve ser maior que 0\n");
        }
    }
    public char getClassificacao(){
        return this.classificacao;
    }
    public void setClassificacao(char classificacao){
        if(classificacao=='L'||classificacao=='0'
                ||classificacao=='2' ||classificacao=='4'
                ||classificacao=='6' ||classificacao=='8') {
            this.classificacao=classificacao;
        }
        else{
            System.out.println("A classificação somente pode ser: \n" +
                    "'L' => Livre\n" +
                    "'0' => Não recomendado para menores de 10 anos\n" +
                    "'2' => Não recomendado para menores de 12 anos\n" +
                    "'4' => Não recomendado para menores de 14 anos\n" +
                    "'6' => Não recomendado para menores de 16 anos\n" +
                    "'8' => Não recomendado para menores de 18 anos\n");
        }
    }
    public double getNota(){
        return this.nota;
    }
    public void setNota(double nota){
        if(nota >=0 && nota <=10){
            this.nota = nota;
        }
        else{
            System.out.println("A nota deve ser um valor entre 0.0 e 10.0");
        }
    }

    public String toString(){
        String dadosLivro;
        dadosLivro = "Titulo: \t"+this.titulo+"\n";
        dadosLivro += "Autor: \n"+this.autor.toString();
        dadosLivro += "Número de páginas: \t"+this.numeroPaginas+"\n";
        dadosLivro += "Preço: \tR$"+this.preco+"\n";
        dadosLivro += "Tiragem: \t"+this.tiragem+"\n";
        switch (classificacao){
            case 'L':
                dadosLivro += "Classificação:   Livre\n";
                break;
            case '0':
                dadosLivro += "Classificação:   Não recomendado para menores de 10 anos\n";
                break;
            case '2':
                dadosLivro += "Classificação:   Não recomendado para menores de 12 anos\n";
                break;
            case '4':
                dadosLivro += "Classificação:   Não recomendado para menores de 14 anos\n";
                break;
            case '6':
                dadosLivro += "Classificação:   Não recomendado para menores de 16 anos\n";
                break;
            case '8':
                dadosLivro += "Classificação:   Não recomendado para menores de 18 anos\n";
                break;
            default:
                dadosLivro += "Classificação:   Não definida\n";
                break;
        }
        dadosLivro += "Nota: \t"+this.nota+"\n";
        return dadosLivro;
    }
}
