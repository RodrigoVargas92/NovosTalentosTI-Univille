package Introducao.Exercicio6;
public class Gerente extends Funcionario {

    private String setor;

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    @Override
    public String toString() {
        return "Gerente: "+getNome()+ "[setor = " + setor +" Telfone: "+getTelefone()+ "]";
    }

    
}
