package Introducao.Exercicio6;
import java.util.List;

public class EquipeDeVendas {
    private Gerente gerente;
    private List<Vendedor> listaVendedor;

    public Gerente getGerente() {
        return gerente;
    }
    public void setGerente(Gerente gerente) {
        this.gerente = gerente;
    }
    public List<Vendedor> getListaVendedor() {
        return listaVendedor;
    }
    public void setListaVendedor(List<Vendedor> listaVendedor) {
        this.listaVendedor = listaVendedor;
    }

    public void add(List<Vendedor> listaVendedor) {
    }
      
    public String listarEquipe(){
        System.out.println(this.getGerente());
        for (Vendedor vend:this.listaVendedor) {
            System.out.println(vend);
        }

        return null;
}
    
}