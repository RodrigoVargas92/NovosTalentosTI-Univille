package views;

import Controle.ClientesViewController;
import java.awt.Color;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.TableColumn;

public class clientesView extends JFrame {

    ClientesViewController textoBotao = new ClientesViewController();

    public void montarTela() {       
        
        String[] colunas = new String[] {"Código","Nome","Endereço", "Número", "Bairro", "Telefone", "E-mail"} ;
        Object[][] dados = new Object[][] {
            {"","","","","","",""},
            {"","","","","","",""},
            {"","","","","","",""},
            {"","","","","","",""},
            {"","","","","","",""},
            {"","","","","","",""},
            {"","","","","","",""},
            {"","","","","","",""},
            {"","","","","","",""},
            {"","","","","","",""}
                      
        };

        JTable tabela = new JTable(dados,colunas);
        JScrollPane painelLista = new JScrollPane(tabela);
        JPanel painelBotoes = new JPanel();        

        painelLista.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        painelLista.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_NEVER);

        painelLista.setBackground(Color.gray);
        painelBotoes.setBackground(Color.lightGray);
        painelBotoes.setLayout(new FlowLayout(FlowLayout.RIGHT));      
              
        JButton botaoAdicionar = new JButton("Adicionar");
        JButton botaoAlterar = new JButton("Alterar");
        JButton botaoRemover = new JButton("Remover");
        painelBotoes.add(botaoAdicionar);
        painelBotoes.add(botaoAlterar);
        painelBotoes.add(botaoRemover);       
        
        botaoAdicionar.addActionListener(textoBotao);
        botaoAlterar.addActionListener(textoBotao);
        botaoRemover.addActionListener(textoBotao);

        TableColumn colunaCodigo = tabela.getColumnModel().getColumn(0);
        colunaCodigo.setMinWidth(50);
        colunaCodigo.setMaxWidth(50);
        colunaCodigo.setPreferredWidth(50);

        TableColumn colunaNome = tabela.getColumnModel().getColumn(1);
        colunaNome.setMinWidth(150);
        colunaNome.setMaxWidth(150);
        colunaNome.setPreferredWidth(150);

        TableColumn colunaEndereco = tabela.getColumnModel().getColumn(2);
        colunaEndereco.setMinWidth(150);
        colunaEndereco.setPreferredWidth(150);

        TableColumn colunaNumero = tabela.getColumnModel().getColumn(3);
        colunaNumero.setMinWidth(150);
        colunaNumero.setMaxWidth(150);
        colunaNumero.setPreferredWidth(150);

        TableColumn colunaBairro = tabela.getColumnModel().getColumn(4);
        colunaBairro.setMinWidth(150);
        colunaBairro.setMaxWidth(150);
        colunaBairro.setPreferredWidth(150);

        TableColumn colunaTelefone = tabela.getColumnModel().getColumn(5);
        colunaTelefone.setMinWidth(150);
        colunaTelefone.setMaxWidth(150);
        colunaTelefone.setPreferredWidth(150);

        TableColumn colunaEmail = tabela.getColumnModel().getColumn(6);
        colunaEmail.setMinWidth(150);
        colunaEmail.setMaxWidth(150);
        colunaEmail.setPreferredWidth(150);

        add(painelLista, "Center");
        add(painelBotoes, "South");

    }

    public void exibirJanela() {
        setVisible(true);
    }

    public clientesView() {
        setSize(1000,600);
        setTitle("Listagem de Clientes Ubeer");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        clientesView view = new clientesView();
        view.montarTela();
        view.exibirJanela();
    }
    
}