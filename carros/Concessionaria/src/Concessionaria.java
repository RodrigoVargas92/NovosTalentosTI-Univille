public class Concessionaria {
    public static void main(String[] args) {
        Civic c1 = new Civic();
        c1.setNome("Civic");
        c1.setModelo("GLS");
        c1.setAnoFabricacao(2017);
        c1.selecionarMusica("Ragatanga");
        

        Civic c2 = new Civic();
        c2.setNome("Civic");
        c2.setModelo("GL");
        c2.setAnoFabricacao(2015);
        c2.selecionarMusica("How deep is your love");

        Fusca f1 = new Fusca();
        f1.setNome("Fuca");
        f1.setModelo("Joaninha");
        f1.setAnoFabricacao(2017);
        f1.sintonizarMusica("Fuscão Preto");        

        Garagem g1 = new Garagem();  
        g1.estacionarCarro(c1); 
        g1.estacionarCarro(c2); 
        g1.estacionarCarro(f1);         

        g1.listarCarros();
                                     
    }
}
