public class Resposta01 {
    // criação de atributos
    private String nome;
    private String cpf;
    private float valorPedido;
    private String endereco;
    private String numeroCartao;

    // construtor da classe
    public Resposta01 (String nome, String cpf, float valorPedido, String endereco, String numeroCartao) {
        this.nome = nome;
        this.cpf = cpf;
        this.valorPedido = valorPedido;
        this.endereco = endereco;
        this.numeroCartao = numeroCartao;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setValorPedido(float valorPedido) {
        this.valorPedido = valorPedido;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void setNumeroCartao(String numeroCartao) {
        this.numeroCartao = numeroCartao;
    }

    public String getNome() {
        return nome;
    }

    public float getValorPedido() {
        return valorPedido;
    }

    public String getEndereco() {
        return endereco;
    }
}