package org.projeto.clientes;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class ClienteBuilder {
    private String primeironome;
    private String nomesdomeio;
    private String sobrenome;
    private String nomecompleto;
    private String cpf;
    private String datadeNascimento;
    private int idadeatual;
    private char genero;
    private String email;
    private String endereco;
    private String telefone;

    public ClienteBuilder completo(String primeironome, String nomesdomeio, String sobrenome, String cpf,
                   String datadeNascimento, char genero, String email, String endereco, String telefone) {
        this.primeironome = primeironome;
        this.nomesdomeio = nomesdomeio;
        this.sobrenome = sobrenome;
        this.nomecompleto = primeironome + " " + nomesdomeio + " " + sobrenome;
        this.cpf = cpf;
        this.datadeNascimento = datadeNascimento;
        this.idadeatual = definirIdadeAtual();
        this.genero = genero;
        this.email = email;
        this.endereco = endereco;
        this.telefone = telefone;
        return this;
    }

    public ClienteBuilder identificacao(String primeironome, String nomesdomeio, String sobrenome, String cpf,
                                        String datadeNascimento, char genero) {
        this.primeironome = primeironome;
        this.nomesdomeio = nomesdomeio;
        this.sobrenome = sobrenome;
        this.nomecompleto = primeironome + " " + nomesdomeio + " " + sobrenome;
        this.cpf = cpf;
        this.datadeNascimento = datadeNascimento;
        this.idadeatual = definirIdadeAtual();
        this.genero = genero;
        return this;
    }

    public ClienteBuilder contato(String email, String endereco, String telefone) {
        this.email = email;
        this.endereco = endereco;
        this.telefone = telefone;
        return this;
    }
    private int definirIdadeAtual(){
        return (recuperaAnoAtual() - recuperarAnoNascimento()) - 1;
    }
    private int recuperarAnoNascimento() {
        Calendar calendario = Calendar.getInstance();
        Date datadeNascimentoCliente;
        try {
            datadeNascimentoCliente = definirFormatoData("").parse(datadeNascimento);
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
        calendario.setTime(datadeNascimentoCliente);
        return calendario.get(calendario.YEAR);
    }
    private int recuperaAnoAtual(){
        Calendar calendario = Calendar.getInstance();
        Date diaatual = new Date();
        calendario.setTime(diaatual);
        return calendario.get(calendario.YEAR);
    }
    private SimpleDateFormat definirFormatoData(String formatoData){
        if (formatoData == ""){
            return new SimpleDateFormat("dd/MM/YYYY");
        } else {
            return new SimpleDateFormat(formatoData);
        }
    }

    public String getPrimeironome() {
        return primeironome;
    }

    public void setPrimeironome(String primeironome) {
        this.primeironome = primeironome;
    }

    public String getNomesdomeio() {
        return nomesdomeio;
    }

    public void setNomesdomeio(String nomesdomeio) {
        this.nomesdomeio = nomesdomeio;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getDatadeNascimento() {
        return datadeNascimento;
    }

    public void setDatadeNascimento(String datadeNascimento) {
        this.datadeNascimento = datadeNascimento;
    }

    public int getIdadeatual() {
        return idadeatual;
    }

    public void setIdadeatual(int idadeatual) {
        this.idadeatual = idadeatual;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNomecompleto() {
        return nomecompleto;
    }

    public char getGenero() {
        return genero;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }

    public void setNomecompleto(String nomecompleto) {
        this.nomecompleto = nomecompleto;

    }

    private String tratamento() {
        if(getGenero() == 'M') {
            return "Sr.";
        }
        else if(getGenero() == 'F') {
            return "Sra.";
        }
        else{
            return "";
        }

    }

    public String toStringCompleto() {
        return tratamento()+ " " + nomecompleto +
                " do CPF " + cpf + " da data de nascimento " + getDatadeNascimento()
                + " com a idade " + getIdadeatual() +
                ", com o email " + email + " e telefone " + getTelefone() +
                " e o genero " + genero;
    }
    public String toStringContato() {
        return "E-mail: " + email + " e telefone " + getTelefone();
    }
    public String toStringIdentificacao() {
        return tratamento()+ " " + nomecompleto +
                " do CPF " + cpf + " da data de nascimento " + getDatadeNascimento()
                + " com a idade " + getIdadeatual() +
                " e o genero " + genero;
    }

}
