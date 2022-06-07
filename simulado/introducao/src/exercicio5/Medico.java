package exercicio5;

public class Medico {

    private long id;
    private String nome;
    private String CRM;
    private Agenda agenda;

    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getCRM() {
        return CRM;
    }
    public void setCRM(String cRM) {
        CRM = cRM;
    }
    public Agenda getAgenda() {
        return agenda;
    }
    public void setAgenda(Agenda agenda) {
        this.agenda = agenda;
    }
    @Override
    public String toString() {
        return "Medico [CRM=" + CRM + ", id=" + id + ", nome=" + nome + "]";
    }
    
}
