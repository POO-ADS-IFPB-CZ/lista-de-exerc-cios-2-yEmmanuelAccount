public class Produto {
    // atributos
    private int codigo;
    private String nome;
    private double preco;
    private int estoque;

    // construtor
    public Produto(int codigo, String nome, double preco, int estoque) {
        this.codigo = codigo;
        this.nome = nome;
        this.preco = preco;
        this.estoque = estoque;
    }

    // getters (todos)
    public int getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public int getEstoque() {
        return estoque;
    }

    // setter (preço)
    public void setPreco (double preco) {
        if (preco < 0) System.out.println("Preço inválido, pois o sistema não aceita preço negativo. Escolha outro valor.");

        else this.preco = preco;
    }

    // método para exibir informações
    public void exibirInformacoes() {
        System.out.println("----- Informações do Produto -----");
        System.out.printf(" > Código: %d \n", codigo);
        System.out.printf(" > Nome: %s \n", nome);
        System.out.printf(" > Preço: %.2f \n", preco);
        System.out.printf(" > Estoque: %d unidade(s) \n", estoque);
        System.out.println("----------------------------------");
    }
}
