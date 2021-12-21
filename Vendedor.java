package MiniProjeto;

public class Vendedor {

    private String nome;
    private String setorVeiculo;
    private Long identificacao;

    public Vendedor(String nome, String setorVeiculo, Long identificacao) {
        this.nome = nome;
        this.setorVeiculo = setorVeiculo;
        this.identificacao = identificacao;
    }


    public void imprimirVendedor(){
        System.out.println(nome + ", do setor de veículos " + setorVeiculo + ". Seu número de identificação é: " + identificacao);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSetorVeiculo() {
        return setorVeiculo;
    }

    public void setSetorVeiculo(String setorVeiculo) {
        this.setorVeiculo = setorVeiculo;
    }

    public Long getIdentificacao() {
        return identificacao;
    }

    public void setIdentificacao(Long identificacao) {
        this.identificacao = identificacao;
    }
}
