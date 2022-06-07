
import java.util.Date;

import exercicio5.Agenda;
import exercicio5.Agendamento;
import exercicio5.Medico;
import exercicio5.Paciente;

public class App8 {
    public static void main(String[] args) {

        Paciente p1 = new Paciente();
        p1.setId(1);
        p1.setNome("Pacifico Pereira");
        p1.setTelefone("23465465456");       
       
        Paciente p2 = new Paciente();
        p2.setId(2);
        p2.setNome("Cara Muito Doente");
        p2.setTelefone("3213135132123");                

        Paciente p3 = new Paciente();
        p3.setId(3);
        p3.setNome("Ta Quase Morrendo");
        p3.setTelefone("216456423123");            

        Paciente p4 = new Paciente();
        p4.setId(4);
        p4.setNome("É Só Uma Gripezinha");
        p4.setTelefone("35456456");
               
        Medico m1 = new Medico();
        m1.setId(2);
        m1.setNome("Top Das Galaxias");
        m1.setCRM("21231");              

        Medico m2 = new Medico();
        m2.setId(2);
        m2.setNome("Segundo Top Das Galaxias");
        m2.setCRM("32123123");        

        Agenda agendaM1 = new Agenda();
        agendaM1.setId(1);
        m1.setAgenda(agendaM1);

        Agenda agendaM2 = new Agenda();
        agendaM2.setId(1);
        m2.setAgenda(agendaM2);        
        
        Agendamento agendamento1P1 = new Agendamento();
        agendamento1P1.setId(1);
        agendamento1P1.setPaciente(p1);
        agendamento1P1.setMedico(m1);        
        Date dataAgendamento = new Date();
        dataAgendamento.setHours(10);
        dataAgendamento.setMinutes(00);
        dataAgendamento.setSeconds(00);
        dataAgendamento.setMonth(6);
        dataAgendamento.setYear(2022);
        dataAgendamento.setDate(8);
        agendamento1P1.setDataHora(dataAgendamento);
        agendaM1.addAgendamento(agendamento1P1);

        Agendamento agendamento2P1 = new Agendamento();
        agendamento2P1.setId(2);
        agendamento2P1.setPaciente(p1);
        agendamento2P1.setMedico(m2);      
        dataAgendamento.setHours(8);
        dataAgendamento.setMinutes(00);
        dataAgendamento.setSeconds(00);
        dataAgendamento.setMonth(6);
        dataAgendamento.setYear(2022);
        dataAgendamento.setDate(8);
        agendamento1P1.setDataHora(dataAgendamento);
        agendaM2.addAgendamento(agendamento2P1);

        Agendamento agendamento1P2 = new Agendamento();
        agendamento1P2.setId(3);
        agendamento1P2.setPaciente(p2);
        agendamento1P2.setMedico(m1);       
        dataAgendamento.setHours(8);
        dataAgendamento.setMinutes(00);
        dataAgendamento.setSeconds(00);
        dataAgendamento.setMonth(6);
        dataAgendamento.setYear(2022);
        dataAgendamento.setDate(8);
        agendamento1P1.setDataHora(dataAgendamento);
        agendaM1.addAgendamento(agendamento1P2);

        Agendamento agendamento2P2 = new Agendamento();
        agendamento2P2.setId(4);
        agendamento2P2.setPaciente(p2);
        agendamento2P2.setMedico(m2);        
        dataAgendamento.setHours(9);
        dataAgendamento.setMinutes(00);
        dataAgendamento.setSeconds(00);
        dataAgendamento.setMonth(6);
        dataAgendamento.setYear(2022);
        dataAgendamento.setDate(8);
        agendamento1P1.setDataHora(dataAgendamento);
        agendaM2.addAgendamento(agendamento2P2);

        Agendamento agendamento1P3 = new Agendamento();
        agendamento1P3.setId(5);
        agendamento1P3.setPaciente(p3);
        agendamento1P3.setMedico(m1);        
        dataAgendamento.setHours(9);
        dataAgendamento.setMinutes(00);
        dataAgendamento.setSeconds(00);
        dataAgendamento.setMonth(6);
        dataAgendamento.setYear(2022);
        dataAgendamento.setDate(8);
        agendamento1P1.setDataHora(dataAgendamento);
        agendaM1.addAgendamento(agendamento1P3);

        Agendamento agendamento2P3 = new Agendamento();
        agendamento2P3.setId(6);
        agendamento2P3.setPaciente(p3);
        agendamento2P3.setMedico(m2);       
        dataAgendamento.setHours(11);
        dataAgendamento.setMinutes(00);
        dataAgendamento.setSeconds(00);
        dataAgendamento.setMonth(6);
        dataAgendamento.setYear(2022);
        dataAgendamento.setDate(8);
        agendamento1P1.setDataHora(dataAgendamento);
        agendaM2.addAgendamento(agendamento2P3);

        Agendamento agendamento1P4 = new Agendamento();
        agendamento1P4.setId(7);
        agendamento1P4.setPaciente(p4);
        agendamento1P4.setMedico(m1);        
        dataAgendamento.setHours(13);
        dataAgendamento.setMinutes(00);
        dataAgendamento.setSeconds(00);
        dataAgendamento.setMonth(6);
        dataAgendamento.setYear(2022);
        dataAgendamento.setDate(8);
        agendamento1P1.setDataHora(dataAgendamento);
        agendaM1.addAgendamento(agendamento1P4);

        Agendamento agendamento2P4 = new Agendamento();
        agendamento2P4.setId(8);
        agendamento2P4.setPaciente(p4);
        agendamento2P4.setMedico(m2);        
        dataAgendamento.setHours(14);
        dataAgendamento.setMinutes(00);
        dataAgendamento.setSeconds(00);
        dataAgendamento.setMonth(6);
        dataAgendamento.setYear(2022);
        dataAgendamento.setDate(8);
        agendamento1P1.setDataHora(dataAgendamento);
        agendaM2.addAgendamento(agendamento2P4);

        m1.getAgenda().imprimirAgenda();
        System.out.println("--------------------");

        m2.getAgenda().imprimirAgenda();
        System.out.println("--------------------");

   
    }
}
