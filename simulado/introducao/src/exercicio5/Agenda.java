package exercicio5;

import java.util.ArrayList;
import java.util.List;

public class Agenda {

    private long id;
    private List<Agendamento> agendamentos = new ArrayList<Agendamento>();

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }    
    
    public List<Agendamento> getAgendamentos() {
        return agendamentos;
    }

    public void setAgendamentos(List<Agendamento> agendamentos) {
        this.agendamentos = agendamentos;
    }  
 
    public void addAgendamento(Agendamento aa){
        this.agendamentos.add(aa);  
    }

    public void imprimirAgenda(){
        for(Agendamento agenda:agendamentos){
            System.out.println(agenda);
        }
    }
    
}
