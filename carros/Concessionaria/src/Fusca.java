public class Fusca extends Carro {
    private String musica;

    public String getMusica() {
        return this.musica;
    }

    public void sintonizarMusica(String musica) {
        this.musica = musica;
    }

    @Override
    public String toString() {
        return "Fusca [musica=" + musica + "]";
    }

    


}
