package exercicio5;

public class Paciente {
    private long id;
    private String nome;
    private String telefone;
    private Agendamento agendamento;

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
    public String getTelefone() {
        return telefone;
    }
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    public Agendamento getAgendamento() {
        return agendamento;
    }
    public void setAgendamento(Agendamento agendamento) {
        this.agendamento = agendamento;
    }
    @Override
    public String toString() {
        return "Paciente [id=" + id + ", nome=" + nome + ", telefone=" + telefone + "]";
    }      
    
}
