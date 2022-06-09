public class Civic extends Carro {

    private String musica;

    public String getMusica() {
        return musica;
    }

    public void selecionarMusica(String musica) {
        this.musica = musica;
    }

    @Override
    public String toString() {
        return "Civic [musica=" + musica + "]";
    }

    
    
}
