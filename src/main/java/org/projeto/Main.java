package org.projeto;

import org.projeto.clientes.Cliente;
import org.projeto.clientes.ClienteBuilder;

public class Main {
    public static void main(String[] args) {

 /*       Cliente teste = new Cliente("teste","teste","teste","41914435850",
                "09/02/2001",'M',"teste","Teste","19981059338");
        System.out.println(teste.toString());

        Cliente teste2 = new Cliente("teste","Teste","Teste","teste","Teste",'T',"Teste","Teste","Teste");
        System.out.println(teste2.toString()); */

        ClienteBuilder teste3 = new ClienteBuilder().completo("teste","teste","teste","41914435850",
                "09/02/2001",'M',"teste","Teste","19981059338");
        System.out.println(teste3.toStringIdentificacao());
    }

}