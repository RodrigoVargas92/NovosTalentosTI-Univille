public abstract class Carro {

   private String nome;
    private String modelo;
    private Integer anoFabricacao;

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public Integer getAnoFabricacao() {
        return anoFabricacao;
    }
    public void setAnoFabricacao(Integer anoFabricacao) {
        this.anoFabricacao = anoFabricacao;
    }
    @Override
    public String toString() {
        return "Carro [anoFabricacao=" + anoFabricacao + ", modelo=" + modelo + ", nome=" + nome + "]";
    }

    
}
