import java.util.ArrayList;
import java.util.List;

public class Garagem extends Carro {
    private Carro carro;
    private List<Carro> listarCarros = new ArrayList<Carro>();

    public Carro getCarro() {
        return carro;
    }
    public void setCarro(Carro carro) {
        this.carro = carro;
    }   

    public List<Carro> getListarCarros() {
        return listarCarros;
    }
    public void setListarCarros(List<Carro> listarCarros) {
        this.listarCarros = listarCarros;
    }
    public void estacionarCarro(Carro carro){
        this.listarCarros.add(carro);  
    }

    public void listarCarros(){             
            for (Carro car:this.listarCarros) {
                String musica = new String();
                if (car instanceof Civic){
                    Civic civic = (Civic) car;
                    musica = civic.getMusica();
                } else{                
                        Fusca fusca = (Fusca) car;
                        musica = fusca.getMusica();
                                } 

System.out.println("|Carro: "+car.getNome()+"|Modelo: "+car.getModelo()+"|Ano Fabricação: "+car.getAnoFabricacao()+"|Musica: "+musica+"|");
        }
      
}

}
