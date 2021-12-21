package MiniProjeto;

public class Cliente {

    private String nome;
    private String genero;
    private Integer idade;
    private Long cpf;

    public Cliente(String nome, String genero, Integer idade, Long cpf) {
        this.nome = nome;
        this.genero = genero;
        this.idade = idade;
        this.cpf = cpf;
    }

    public void imprimirCliente(){
        System.out.println(nome + ", do gênero " + genero + ", com idade de " + idade + " anos. Seu número de CPF é: " + cpf);

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public Long getCpf() {
        return cpf;
    }

    public void setCpf(Long cpf) {
        this.cpf = cpf;
    }
}
