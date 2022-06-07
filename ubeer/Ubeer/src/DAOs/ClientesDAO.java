package DAOs;

import java.util.ArrayList;
import java.util.List;
import Entidades.Cliente;
import Entidades.Pagamento;
import Enums.BairrosEnum;
import Enums.PagamentosEnum;
import Validacoes.ValidaCliente;

public class ClientesDAO {

    public static void main(String[] args) {
        ClientesDAO cd = new ClientesDAO();
        List<Cliente> result = cd.listar("teste");
        System.out.println("Quantos clientes ? " + result.size());
    }
    

    private List<Cliente> retornaListaClientesTeste() {
        List<Cliente> clientes = new ArrayList<Cliente>();
        Cliente c1 = new Cliente();
        c1.setCodigo(1);
        c1.setNome("José da Silva");
        c1.setEndereco("Rua satunino de brito");
        c1.setNumero(74);
        c1.setBairro(BairrosEnum.Paranaguamirim);
        c1.setCEP(892000000);
        c1.setTelefone(9999999);
        c1.setEmail("jose.silva@Ubeer.com");
        c1.setSenha("Secreta@");
        Pagamento dinheiro = new Pagamento();
        dinheiro.setTipo(PagamentosEnum.Dinheiro);
        c1.setFormadePagamento(dinheiro);

        Cliente c2 = new Cliente();
        c2.setCodigo(2);
        c2.setNome("joão da Souza");
        c2.setEndereco("Rua saturnino de brito");
        c2.setNumero(74);
        c2.setBairro(BairrosEnum.AdhemarGarcia);
        c2.setCEP(892012000);
        c2.setTelefone(932329999);
        c2.setEmail("joao.souza@Ubeer.com");
        c2.setSenha("Senha@");
        Pagamento credito = new Pagamento();
        credito.setNumero(3421234);
        credito.setCVC(123);
        credito.setTipo(PagamentosEnum.Crédito);
        c2.setFormadePagamento(credito);

        Cliente c3 = new Cliente();
        c3.setCodigo(3);
        c3.setNome("Odete Roitmann");
        c3.setEndereco("Rua saturnino de brito");
        c3.setNumero(70);
        c3.setBairro(BairrosEnum.BoaVista);
        c3.setCEP(892222000);
        c3.setTelefone(932234999);
        c3.setEmail("odete.roitmann@Ubeer.com");
        c3.setSenha("SuperSecreta@123");
        Pagamento debito = new Pagamento();
        credito.setNumero(4421234);
        credito.setCVC(126);
        credito.setTipo(PagamentosEnum.Débito);
        c3.setFormadePagamento(debito);

        clientes.add(c1);
        clientes.add(c2);
        clientes.add(c3);

       return clientes; 
    }

    public List<Cliente> listar(String param) {

        if (param.equalsIgnoreCase("teste")) {
            return retornaListaClientesTeste();
        }


        return new ArrayList<Cliente>();
    }

    public List<Cliente> listar() {
        return new ArrayList<Cliente>();
    }

    public void adicionar(Cliente cli) {

    }

    public void editar(Cliente cli) {
        
    }

    public void excluir(Cliente cli) {
        
    }

    public void validaInclusao(Cliente cli) throws Exception {
        ValidaCliente vc = new ValidaCliente();
        vc.validaInclusao(cli);
    }

    public void validaEdicao(Cliente cli) throws Exception {
        ValidaCliente vc = new ValidaCliente();
        vc.validaEdicao(cli);

    }

    
}
