package Controle;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

public class ClientesViewController implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {
       

        String textoBotao = e.getActionCommand();

        if (textoBotao.equals("Adicionar")) {
            System.out.println("Adicionando novo cliente ");
        } else if (textoBotao.equals("Alterar")) {
            System.out.println("Alterando um cliente ");
        } else if (textoBotao.equals("Remover")) {
            System.out.println("Removendo cliente");
            Integer opcao = JOptionPane.showConfirmDialog(null, "Confirma Exclusão?", "Confirmação", JOptionPane.YES_NO_OPTION);
            if (opcao == 0) {
                System.out.println("Cliente excluído para todo o sempre!");
            } else {
                System.out.println("Cliente poupado da exclusão ... dessa vez !");
            }

        }    

    }
    }

    