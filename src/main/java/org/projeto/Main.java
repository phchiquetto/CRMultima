package org.projeto;

import org.projeto.clientes.Cliente;

public class Main {
    public static void main(String[] args) {

        Cliente teste = new Cliente("573.903.400-50","phchiquetto@gmail.com",
                "Pedro Henrique Chiquetto", 'M');
        System.out.println(teste.toString());

        Cliente teste2 = new Cliente("349.225.095-90","teste@gmail.com","Teste da Silva Junior", 'F');
        System.out.println(teste2.toString());
    }

}