package Entidades;

import java.util.List;

import Enums.TurnoEnum;

public class Turma {
    private Curso curso;
    private String nome;
    private TurnoEnum turno;
    private Professor professor;
    private List <Aluno> alunos;
    public Curso getCurso() {
        return curso;
    }
    public void setCurso(Curso curso) {
        this.curso = curso;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public TurnoEnum getTurno() {
        return turno;
    }
    public void setTurno(TurnoEnum turno) {
        this.turno = turno;
    }
    public Professor getProfessor() {
        return professor;
    }
    public void setProfessor(Professor professor) {
        this.professor = professor;
    }
    public List<Aluno> getAlunos() {
        return alunos;
    }
    public void setAlunos(List<Aluno> alunos) {
        this.alunos = alunos;
    }       
    
    
}
