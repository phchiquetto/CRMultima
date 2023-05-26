package org.projeto.clientes;

import org.junit.jupiter.api.Assertions;

import static org.junit.jupiter.api.Assertions.*;

class ClienteBuilderTest {

    private ClienteBuilder clienteBuilder;
    private ClienteBuilder clienteBuilder2;

    @org.junit.jupiter.api.BeforeEach
    public void setUp()throws Exception {
        clienteBuilder2 = new ClienteBuilder();
        clienteBuilder = new ClienteBuilder().identificacao("teste", "teste",
                "teste", "41914435850", "09/02/2001", 'U');
    }

    @org.junit.jupiter.api.Test
    void getSetPrimeiroNome() {
        clienteBuilder.setPrimeironome("%%%%%%%");
        Assertions.assertEquals(clienteBuilder.getPrimeironome(), "%%%%%%%");
        clienteBuilder.setPrimeironome("Primeiro");
        Assertions.assertEquals(clienteBuilder.getPrimeironome(), "Primeiro");
    }

    @org.junit.jupiter.api.Test
    void getSetNomeMeio() {
        clienteBuilder.setNomesdomeio("190");
        Assertions.assertEquals(clienteBuilder.getNomesdomeio(), "190");
    }

    @org.junit.jupiter.api.Test
    void getSetSobrenome() {
        clienteBuilder.setSobrenome("190");
        Assertions.assertEquals(clienteBuilder.getSobrenome(), "190");
    }

    @org.junit.jupiter.api.Test
    void getSetNomeCompleto() {
        clienteBuilder.setNomecompleto("Teste da Silva Junior");
        Assertions.assertEquals(clienteBuilder.getNomecompleto(), "Teste da Silva Junior");
    }


    @org.junit.jupiter.api.Test
    void getSetIdade() {
        clienteBuilder.setDatadeNascimento("9/2/2001");
        Assertions.assertEquals(clienteBuilder.getIdadeatual(), 22);
        clienteBuilder.setIdadeatual(90);
        Assertions.assertEquals(clienteBuilder.getIdadeatual(), 90);
    }

    @org.junit.jupiter.api.Test
    void getSetEndereco() {
        clienteBuilder.getEndereco();
        Assertions.assertEquals(clienteBuilder.getEndereco(), null);
        clienteBuilder.setEndereco("Rua teste");
        Assertions.assertEquals(clienteBuilder.getEndereco(),"Rua teste");
    }

    @org.junit.jupiter.api.Test
    void getSetTelefone() {
        clienteBuilder.setTelefone("190");
        Assertions.assertEquals(clienteBuilder.getTelefone(), "190");
    }

    @org.junit.jupiter.api.Test
    void getCpf() {
        Assertions.assertEquals(clienteBuilder2.getCpf(), null);
        Assertions.assertEquals(clienteBuilder.getCpf(), "41914435850");
    }

    @org.junit.jupiter.api.Test
    void setCpf() {
        clienteBuilder.setCpf("00000000000");
        Assertions.assertEquals(clienteBuilder.getCpf(),"00000000000");
    }

    @org.junit.jupiter.api.Test
    void getSetCpf() {
        clienteBuilder.setCpf("00000000000");
        Assertions.assertEquals(clienteBuilder.getCpf(),"00000000000");
    }

    @org.junit.jupiter.api.Test
    void getSetEmail() {
        clienteBuilder.setEmail("email teste");
        Assertions.assertEquals(clienteBuilder.getEmail(), "email teste");
        clienteBuilder.setEmail("");
        Assertions.assertEquals(clienteBuilder.getEmail(), "");
    }

    @org.junit.jupiter.api.Test
    void tratamento() {
        Assertions.assertEquals(clienteBuilder.toStringCompleto(), " teste teste teste do CPF 41914435850 da data" +
                " de nascimento 09/02/2001 com a idade 22, com o email null e telefone null e o genero U");
        clienteBuilder.setGenero('M');
        Assertions.assertEquals(clienteBuilder.toStringCompleto(),"Sr. teste teste teste do CPF 41914435850 da" +
                " data de nascimento 09/02/2001 com a idade 22, com o email null e telefone null e o genero M");
        clienteBuilder.setGenero('F');
        Assertions.assertEquals(clienteBuilder.toStringCompleto(),"Sra. teste teste teste do CPF 41914435850 da" +
                " data de nascimento 09/02/2001 com a idade 22, com o email null e telefone null e o genero F");
        clienteBuilder.setGenero('@');
        Assertions.assertEquals(clienteBuilder.toStringCompleto()," teste teste teste do CPF 41914435850 da data" +
                " de nascimento 09/02/2001 com a idade 22, com o email null e telefone null e o genero @");

    }








    @org.junit.jupiter.api.AfterEach
    public void tearDown()throws Exception {
        clienteBuilder = null;
        clienteBuilder2 = null;
    }
}
