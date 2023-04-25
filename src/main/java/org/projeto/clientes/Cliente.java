package org.projeto.clientes;

public class Cliente {
    private String cpf;
    private String email;
    private String nomecompleto;
    private char genero;

    public Cliente(String cpf, String email, String nomecompleto, char genero) {
        this.cpf = cpf;
        this.email = email;
        this.nomecompleto = nomecompleto;
        this.genero = genero;

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

    public String toString() {
        return tratamento()+ " " + nomecompleto +
                " do CPF " + cpf +
                ", com o email '" + email +
                " e o genero " + genero;
    }
}
