public class Principal {
    public static void main(String ags[]){
        Livro[] livros;
        livros = new Livro[5];
        // Livros é um array vazio não tem nenhum objeto dentro dele
        Autor autorluiz = new Autor("Luiz Pedro Petroski", "lppetroski@uepg.br", 28);
        Livro l1 = new Livro("Programação Orientada a objetos", autorluiz,150, 10.23, 50, 'L', 7.2);
        livros[0] = l1;

        Livro l2 = new Livro("Contos e causos", autorluiz,54, 87.99, 200, '4', 5.2);
        livros[1] = l2;

        Autor danBrown = new Autor("Dan Brown", "dan@email.com", 56);
        Livro l3 = new Livro("O Código Da Vinci", danBrown,600, 33.70, 1000000, '4', 9.2);
        livros[2] = l3;

        Autor tolkien = new Autor("J.R.R. Tolkien", "tolkien@email.com", 36);
        livros[3] = new Livro("O Código Da Vinci", tolkien,344, 36.90, 1000000, '6', 9.6);

        Autor rowling = new Autor("J. K. Rowling.", "rowling@email.com", 55);
        livros[4] = new Livro("Harry Potter e a Pedra Filosofal ", rowling,256, 29.90, 1000000, 'L', 9.6);


        for(Livro livro : livros){
            System.out.println("=================================");
            System.out.println(livro);
        }
    }
}
