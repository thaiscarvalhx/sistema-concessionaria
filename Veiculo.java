package MiniProjeto;

public class Veiculo {

    private String modelo;
    private String cor;
    private Integer ano;
    private String tipo;

    public Veiculo(String modelo, String cor, Integer ano, String tipo) {
        this.modelo = modelo;
        this.cor = cor;
        this.ano = ano;
        this.tipo = tipo;
    }


    public void imprimirVeiculo(){
        System.out.println(modelo + " na cor " + cor + ", lançado no ano " + ano + ". Veículo do tipo " + tipo);
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public Integer getAno() {
        return ano;
    }

    public void setAno(Integer ano) {
        this.ano = ano;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
