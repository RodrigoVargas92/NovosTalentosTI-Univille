package DAOs;

import java.util.ArrayList;
import java.util.List;

import Entidades.Pagamento;
import Enums.PagamentosEnum;
import Validacoes.ValidaPagamento;

public class PagamentosDAO {


    ValidaPagamento validador = new ValidaPagamento();

    public List<Pagamento> listar() {
        List<Pagamento> pagamentos = new ArrayList<Pagamento>();
        Pagamento credito = new Pagamento();
        credito.setCodigo(1);
        credito.setNome("Crédito");
        credito.setTipo(PagamentosEnum.Crédito);
        pagamentos.add(credito);

        Pagamento debito = new Pagamento();
        debito.setCodigo(2);
        debito.setNome("Débito");
        debito.setTipo(PagamentosEnum.Débito);
        pagamentos.add(debito);

        Pagamento dinheiro =  new Pagamento();
        dinheiro.setCodigo(3);
        dinheiro.setNome("Dinheiro");
        dinheiro.setTipo(PagamentosEnum.Dinheiro);
        pagamentos.add(dinheiro);
        return pagamentos;
    }

    public void adicionar(Pagamento pag) {

    }

    public void editar(Pagamento Pag) {

    }

    public void excluir(Pagamento pag) {

    }

    public void validaInclusao(Pagamento pag) throws Exception  {
        validador.validaAdicao(pag);

    }

    public void validaEdicao(Pagamento pag) throws Exception {
        validador.validaEdicao(pag);
    }

    public void validaExclusao(Pagamento pag) throws Exception {
        validador.validaExclusao(pag);
    }


    
}
