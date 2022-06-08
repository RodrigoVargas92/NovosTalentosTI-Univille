import java.util.ArrayList;
import java.util.List;

import Entidades.Aluno;
import Entidades.Curso;
import Entidades.Professor;
import Entidades.Turma;
import Enums.TurnoEnum;

public class Principal {
    public static void main(String[] args) {

    Curso c1 = new Curso();
    c1.setNome("Novos Talentos em TI");
    c1.setDuracao(10);
    c1.setInstituicao("Univille");

    Professor p1 = new Professor();
    p1.setNome("João Moretti");

    Aluno a1 = new Aluno();
    Aluno a2 = new Aluno();
    Aluno a3 = new Aluno();

    a1.setNome("Rodrigo");
    a1.setMatricula(1);
    a1.setIdade(29);
    a1.setEmail("rodrigo@univille.br");
    a1.setTelefone(99661299);

    a2.setNome("Talita");
    a2.setMatricula(2);
    a2.setIdade(25);
    a2.setEmail("talita@univille.br");
    a2.setTelefone(99772288);

    a3.setNome("Rogerio");
    a3.setMatricula(3);
    a3.setIdade(35);
    a3.setEmail("rogerio@univille.br");
    a3.setTelefone(88667755);

        Turma t1 = new Turma();
      t1.setNome("Novos Talentes em TI");
      t1.setCurso(c1);
      t1.setProfessor(p1);
      t1.setTurno(TurnoEnum.Noturno);    
      List <Aluno> alunos = new ArrayList<Aluno>();
      alunos.add(a1);
      alunos.add(a2);
      alunos.add(a3);
      t1.setAlunos(alunos);
         

    }
}
