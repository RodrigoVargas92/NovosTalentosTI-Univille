package Introducao;

import java.util.ArrayList;
import java.util.List;

import Introducao.Exercicio6.EquipeDeVendas;
import Introducao.Exercicio6.Gerente;
import Introducao.Exercicio6.Vendedor;

public class App9 {
    public static void main(String[] args) {
        Vendedor v1 = new Vendedor();
        v1.setId(1);
        v1.setNome("Vendedor1");
        v1.setTelefone("83838525");
        v1.setMetaVendas(100000.00F);
        v1.setPercComissao(3F);

        Vendedor v2 = new Vendedor();
        v2.setId(2);
        v2.setNome("Vendedor2");
        v2.setTelefone("14323534675");
        v2.setMetaVendas(100000.00F);
        v2.setPercComissao(3F);

        Vendedor v3 = new Vendedor();
        v3.setId(3);
        v3.setNome("Vendedor3");
        v3.setTelefone("1347238957");
        v3.setMetaVendas(100000.00F);
        v3.setPercComissao(3F);

        Vendedor v4 = new Vendedor();
        v4.setId(4);
        v4.setNome("Vendedor4");
        v4.setTelefone("836734895");
        v4.setMetaVendas(100000.00F);
        v4.setPercComissao(3F);

        Vendedor v5 = new Vendedor();
        v5.setId(5);
        v5.setNome("Vendedor5");
        v5.setTelefone("28093742");
        v5.setMetaVendas(100000.00F);
        v5.setPercComissao(3F);

        Gerente g1 = new Gerente();
        g1.setId(1);
        g1.setNome("Gerente1");
        g1.setSetor("Carros");
        g1.setTelefone("13098271");

        Gerente g2 = new Gerente();
        g2.setId(2);
        g2.setNome("Gerente2");
        g2.setSetor("Motos");
        g2.setTelefone("2347289");

        EquipeDeVendas equipe1 = new EquipeDeVendas();
        equipe1.setGerente(g1);
        List<Vendedor> lista1 = new ArrayList<Vendedor>();
        lista1.add(v1);
        lista1.add(v2);
        lista1.add(v3);
        equipe1.setListaVendedor(lista1);;
        

        EquipeDeVendas equipe2 = new EquipeDeVendas();
        equipe2.setGerente(g2);
        List<Vendedor> lista2 = new ArrayList<Vendedor>();
        lista2.add(v4);
        lista2.add(v5);        
        equipe2.setListaVendedor(lista2);
       
        System.out.println("--------------------");   
        
equipe1.listarEquipe();
System.out.println("--------------------");
equipe2.listarEquipe();
System.out.println("--------------------");

            }
        }
    
