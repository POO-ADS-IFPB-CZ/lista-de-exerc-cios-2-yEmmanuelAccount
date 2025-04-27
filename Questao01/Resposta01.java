public class Resposta01 {
    // criação de atributos
    private String nome;
    private String cpf;
    private float valorPedido;
    private String endereco;
    private String numeroCartao;

    // construtor da classe
    public Resposta (String nome, String cpf, float valorPedido, String endereco, String numeroCartao) {
        this.nome = nome;
        this.cpf = cpf;
        this.valorPedido = valorPedido;
        this.endereco = endereco;
        this.numeroCartao = numeroCartao;
    }

    // administração da classe
        // nome
            public String getNome() {
                return nome;

            public void setNome (String nome) {
                this.nome = nome;
            }

        // cpf
            public String setCpf (String cpf) {
                this.cpf = cpf;
            }

        // valorPedido
            public float getValorPedido() {
                return valorPedido;
            }

            public void setValorPedido (float valorPedido) {
                this.valorPedido = valorPedido;
            }
}