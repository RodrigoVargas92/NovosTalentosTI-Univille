package Introducao.Exercicio6;
public class Vendedor extends Funcionario {

    private float percComissao;
    private float metaVendas;
    
    public float getPercComissao() {
        return percComissao;
    }
    public void setPercComissao(float percComissao) {
        this.percComissao = percComissao;
    }
    public float getMetaVendas() {
        return metaVendas;
    }
    public void setMetaVendas(float metaVendas) {
        this.metaVendas = metaVendas;
    }
    @Override
    public String toString() {
        return "Vendedor: "+getNome()+" [Telefone: "+getTelefone()+" metaVendas = " + metaVendas + ", percComissao = " + percComissao + "]";
    }
  
    
}
